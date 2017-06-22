package com.nanchen.rxjava2examples.module.rxjava2.operators.item;

import android.util.Log;

import com.nanchen.rxjava2examples.R;

import java.util.concurrent.TimeUnit;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * Completable
 * <p>
 * 只关心结果，也就是说 Completable 是没有 onNext 的，要么成功要么出错，不关心过程，在 subscribe 后的某个时间点返回结果
 *
 * Author: nanchen
 * Email: liushilin520@foxmail.com
 * Date: 2017-06-22  15:08
 */

public class RxCompletableActivity extends RxOperatorBaseActivity {
    private static final String TAG = "RxCompletableActivity";

    @Override
    protected String getSubTitle() {
        return getString(R.string.rx_Completable);
    }

    @Override
    protected void doSomething() {

        mRxOperatorsText.append("Completable\n");
        Log.e(TAG, "Completable\n");

        Completable.timer(1, TimeUnit.SECONDS)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new CompletableObserver() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {
                        mRxOperatorsText.append("onSubscribe : d :" + d.isDisposed() + "\n");
                        Log.e(TAG, "onSubscribe : d :" + d.isDisposed() + "\n");
                    }

                    @Override
                    public void onComplete() {
                        mRxOperatorsText.append("onComplete\n");
                        Log.e(TAG, "onComplete\n");
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {
                        mRxOperatorsText.append("onError :" + e.getMessage() + "\n");
                        Log.e(TAG, "onError :" + e.getMessage() + "\n");
                    }
                });
    }
}
