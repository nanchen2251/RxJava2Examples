package com.nanchen.rxjava2examples.module.rxjava2.usecases.concat;

import android.util.Log;

import com.nanchen.rxjava2examples.model.FoodList;
import com.nanchen.rxjava2examples.module.rxjava2.operators.item.RxOperatorBaseActivity;
import com.nanchen.rxjava2examples.util.CacheManager;
import com.rx2androidnetworking.Rx2AndroidNetworking;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 *
 * Concat 先读取缓存数据并展示UI再获取网络数据刷新UI
 *
 * 1、concat 可以做到不交错的发射两个甚至多个 Observable 的发射物;
 * 2、并且只有前一个 Observable 终止（onComplete）才会订阅下一个 Observable
 *
 *
 * Author: nanchen
 * Email: liushilin520@foxmail.com
 * Date: 2017-07-03  9:37
 */

public class RxCaseConcatActivity extends RxOperatorBaseActivity {
    private static final String TAG = "RxCaseConcatActivity";
    private boolean isFromNet = false;

    @Override
    protected String getSubTitle() {
        return "先读取缓存再读取网络";
    }

    @Override
    protected void doSomething() {
        Observable<FoodList> cache = Observable.create(new ObservableOnSubscribe<FoodList>() {
            @Override
            public void subscribe(@NonNull ObservableEmitter<FoodList> e) throws Exception {
                Log.e(TAG, "create当前线程:"+Thread.currentThread().getName() );
                FoodList data = CacheManager.getInstance().getFoodListData();

                // 在操作符 concat 中，只有调用 onComplete 之后才会执行下一个 Observable
                if (data != null){ // 如果缓存数据不为空，则直接读取缓存数据，而不读取网络数据
                    isFromNet = false;
                    Log.e(TAG, "\nsubscribe: 读取缓存数据:" );
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            mRxOperatorsText.append("\nsubscribe: 读取缓存数据:\n");
                        }
                    });

                    e.onNext(data);
                }else {
                    isFromNet = true;
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            mRxOperatorsText.append("\nsubscribe: 读取网络数据:\n");
                        }
                    });
                    Log.e(TAG, "\nsubscribe: 读取网络数据:" );
                    e.onComplete();
                }


            }
        });

        Observable<FoodList> network = Rx2AndroidNetworking.get("http://www.tngou.net/api/food/list")
                .addQueryParameter("rows",10+"")
                .build()
                .getObjectObservable(FoodList.class);


        // 两个 Observable 的泛型应当保持一致

        Observable.concat(cache,network)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<FoodList>() {
                    @Override
                    public void accept(@NonNull FoodList tngouBeen) throws Exception {
                        Log.e(TAG, "subscribe 成功:"+Thread.currentThread().getName() );
                        if (isFromNet){
                            mRxOperatorsText.append("accept : 网络获取数据设置缓存: \n");
                            Log.e(TAG, "accept : 网络获取数据设置缓存: \n"+tngouBeen.toString() );
                            CacheManager.getInstance().setFoodListData(tngouBeen);
                        }

                        mRxOperatorsText.append("accept: 读取数据成功:" + tngouBeen.toString()+"\n");
                        Log.e(TAG, "accept: 读取数据成功:" + tngouBeen.toString());
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(@NonNull Throwable throwable) throws Exception {
                        Log.e(TAG, "subscribe 失败:"+Thread.currentThread().getName() );
                        Log.e(TAG, "accept: 读取数据失败："+throwable.getMessage() );
                        mRxOperatorsText.append("accept: 读取数据失败："+throwable.getMessage()+"\n");
                    }
                });

    }
}
