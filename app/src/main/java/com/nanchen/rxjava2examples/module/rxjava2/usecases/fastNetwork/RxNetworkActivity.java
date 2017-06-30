package com.nanchen.rxjava2examples.module.rxjava2.usecases.fastNetwork;

import android.util.Log;

import com.nanchen.rxjava2examples.model.MobileAddress;
import com.nanchen.rxjava2examples.model.MobileAddress.ResultBean;
import com.nanchen.rxjava2examples.module.rxjava2.operators.item.RxOperatorBaseActivity;
import com.rx2androidnetworking.Rx2AndroidNetworking;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;


/**
 * Rx2AndroidNetworking
 *
 * 仅仅是采用这个框架做 rx2 网络请求
 *
 * Author: nanchen
 * Email: liushilin520@foxmail.com
 * Date: 2017-06-30  15:41
 */

public class RxNetworkActivity extends RxOperatorBaseActivity {

    private static final String TAG = "RxNetworkActivity";

    @Override
    protected String getSubTitle() {
        return "使用Rx2-Networking";
    }

    @Override
    protected void doSomething() {
        mRxOperatorsText.append("RxNetworkActivity\n");
        Rx2AndroidNetworking.get("http://api.avatardata.cn/MobilePlace/LookUp?key=ec47b85086be4dc8b5d941f5abd37a4e&mobileNumber=13021671512")
                .build()
                .getObjectObservable(MobileAddress.class)
                .observeOn(AndroidSchedulers.mainThread()) // 为doOnNext() 指定在主线程，否则报错
                .doOnNext(new Consumer<MobileAddress>() {
                    @Override
                    public void accept(@NonNull MobileAddress data) throws Exception {
                        Log.e(TAG, "doOnNext:"+Thread.currentThread().getName()+"\n" );
                        mRxOperatorsText.append("\ndoOnNext:"+Thread.currentThread().getName()+"\n" );
                        Log.e(TAG,"doOnNext:"+data.toString()+"\n");
                        mRxOperatorsText.append("doOnNext:"+data.toString()+"\n");
                    }
                })
                .map(new Function<MobileAddress, ResultBean>() {
                    @Override
                    public ResultBean apply(@NonNull MobileAddress mobileAddress) throws Exception {
                        Log.e(TAG, "\n" );
                        mRxOperatorsText.append("\n");
                        Log.e(TAG, "map:"+Thread.currentThread().getName()+"\n" );
                        mRxOperatorsText.append("map:"+Thread.currentThread().getName()+"\n" );
                        return mobileAddress.getResult();
                    }
                })
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<ResultBean>() {
                    @Override
                    public void accept(@NonNull ResultBean data) throws Exception {
                        Log.e(TAG, "subscribe 成功:"+Thread.currentThread().getName()+"\n" );
                        mRxOperatorsText.append("\nsubscribe 成功:"+Thread.currentThread().getName()+"\n" );
                        Log.e(TAG, "成功:" + data.toString() + "\n");
                        mRxOperatorsText.append("成功:" + data.toString() + "\n");
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(@NonNull Throwable throwable) throws Exception {
                        Log.e(TAG, "subscribe 失败:"+Thread.currentThread().getName()+"\n" );
                        mRxOperatorsText.append("\nsubscribe 失败:"+Thread.currentThread().getName()+"\n" );
                        Log.e(TAG, "失败："+ throwable.getMessage()+"\n" );
                        mRxOperatorsText.append("失败："+ throwable.getMessage()+"\n");
                    }
                });
    }
}
