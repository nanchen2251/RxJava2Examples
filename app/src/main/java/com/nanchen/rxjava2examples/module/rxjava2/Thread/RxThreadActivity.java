package com.nanchen.rxjava2examples.module.rxjava2.Thread;

import android.util.Log;

import com.nanchen.rxjava2examples.module.rxjava2.operators.item.RxOperatorBaseActivity;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * Thread 原谅我把线程调度切换放在了例子一页，实属无奈
 * <p>
 * Author: nanchen
 * Email: liushilin520@foxmail.com
 * Date: 2017-07-03  14:45
 */

public class RxThreadActivity extends RxOperatorBaseActivity {
    private static final String TAG = "RxThreadActivity";


    @Override
    protected String getSubTitle() {
        return "线程调度";
    }

    @Override
    protected void doSomething() {
        Observable.create(new ObservableOnSubscribe<Integer>() {
            @Override
            public void subscribe(@NonNull ObservableEmitter<Integer> e) throws Exception {
                Log.e(TAG, "Observable thread is : " + Thread.currentThread().getName());
                e.onNext(1);
                e.onComplete();
            }
        }).subscribeOn(Schedulers.newThread())
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .doOnNext(new Consumer<Integer>() {
                    @Override
                    public void accept(@NonNull Integer integer) throws Exception {
                        Log.e(TAG, "After observeOn(mainThread)，Current thread is " + Thread.currentThread().getName());
                    }
                })
                .observeOn(Schedulers.io())
                .subscribe(new Consumer<Integer>() {
                    @Override
                    public void accept(@NonNull Integer integer) throws Exception {
                        Log.e(TAG, "After observeOn(io)，Current thread is " + Thread.currentThread().getName());
                    }
                });
    }
}
