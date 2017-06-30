package com.nanchen.rxjava2examples.module.rxjava2.usecases.okHttp;

import android.util.Log;

import com.google.gson.Gson;
import com.nanchen.rxjava2examples.model.MobileAddress;
import com.nanchen.rxjava2examples.module.rxjava2.operators.item.RxOperatorBaseActivity;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Request.Builder;
import okhttp3.Response;
import okhttp3.ResponseBody;

/**
 *
 * 采用 OkHttp3 配合 map , doOnNext , 线程切换做简单的网络请求
 *
 * 1、通过 Observable.create() 方法，调用 OkHttp 网络请求;
 * 2、通过 map 操作符结合 Gson , 将 Response 转换为 bean 类;
 * 3、通过 doOnNext() 方法，解析 bean 中的数据，并进行数据库存储等操作;
 * 4、调度线程，在子线程进行耗时操作任务，在主线程更新 UI;
 * 5、通过 subscribe(),根据请求成功或者失败来更新 UI。
 *
 * Author: nanchen
 * Email: liushilin520@foxmail.com
 * Date: 2017-06-30  14:24
 */

public class RxNetSingleActivity extends RxOperatorBaseActivity {
    private static final String TAG = "RxNetSingleActivity";

    @Override
    protected String getSubTitle() {
        return "单一的网络请求";
    }

    @Override
    protected void doSomething() {
        Observable.create(new ObservableOnSubscribe<Response>() {
            @Override
            public void subscribe(@NonNull ObservableEmitter<Response> e) throws Exception {
                Builder builder = new Builder()
                        .url("http://api.avatardata.cn/MobilePlace/LookUp?key=ec47b85086be4dc8b5d941f5abd37a4e&mobileNumber=13021671512")
                        .get();
                Request request = builder.build();
                Call call = new OkHttpClient().newCall(request);
                Response response = call.execute();
                e.onNext(response);
            }
        }).map(new Function<Response, MobileAddress>() {
                    @Override
                    public MobileAddress apply(@NonNull Response response) throws Exception {

                        Log.e(TAG, "map 线程:" + Thread.currentThread().getName() + "\n");
                        if (response.isSuccessful()) {
                            ResponseBody body = response.body();
                            if (body != null) {
                                Log.e(TAG, "map:转换前:" + response.body());
                                return new Gson().fromJson(body.string(), MobileAddress.class);
                            }
                        }
                        return null;
                    }
                }).observeOn(AndroidSchedulers.mainThread())
                .doOnNext(new Consumer<MobileAddress>() {
                    @Override
                    public void accept(@NonNull MobileAddress s) throws Exception {
                        Log.e(TAG, "doOnNext 线程:" + Thread.currentThread().getName() + "\n");
                        mRxOperatorsText.append("\ndoOnNext 线程:" + Thread.currentThread().getName() + "\n");
                        Log.e(TAG, "doOnNext: 保存成功：" + s.toString() + "\n");
                        mRxOperatorsText.append("doOnNext: 保存成功：" + s.toString() + "\n");

                    }
                }).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<MobileAddress>() {
                    @Override
                    public void accept(@NonNull MobileAddress data) throws Exception {
                        Log.e(TAG, "subscribe 线程:" + Thread.currentThread().getName() + "\n");
                        mRxOperatorsText.append("\nsubscribe 线程:" + Thread.currentThread().getName() + "\n");
                        Log.e(TAG, "成功:" + data.toString() + "\n");
                        mRxOperatorsText.append("成功:" + data.toString() + "\n");
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(@NonNull Throwable throwable) throws Exception {
                        Log.e(TAG, "subscribe 线程:" + Thread.currentThread().getName() + "\n");
                        mRxOperatorsText.append("\nsubscribe 线程:" + Thread.currentThread().getName() + "\n");

                        Log.e(TAG, "失败：" + throwable.getMessage() + "\n");
                        mRxOperatorsText.append("失败：" + throwable.getMessage() + "\n");
                    }
                });
    }

}
