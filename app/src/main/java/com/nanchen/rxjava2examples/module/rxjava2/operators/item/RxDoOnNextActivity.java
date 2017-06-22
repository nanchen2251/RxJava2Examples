package com.nanchen.rxjava2examples.module.rxjava2.operators.item;

import android.util.Log;

import com.nanchen.rxjava2examples.R;

import io.reactivex.Observable;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Consumer;

/**
 * doOnNext
 *
 * 让订阅者在接收到数据前干点事情的操作符
 *
 * Author: nanchen
 * Email: liushilin520@foxmail.com
 * Date: 2017-06-20  11:02
 */

public class RxDoOnNextActivity extends RxOperatorBaseActivity {
    private static final String TAG = "RxDoOnNextActivity";

    @Override
    protected String getSubTitle() {
        return getString(R.string.rx_doOnNext);
    }

    @Override
    protected void doSomething() {
        Observable.just(1, 2, 3, 4)
                .doOnNext(new Consumer<Integer>() {
                    @Override
                    public void accept(@NonNull Integer integer) throws Exception {
                        mRxOperatorsText.append("doOnNext 保存 " + integer + "成功" + "\n");
                        Log.e(TAG, "doOnNext 保存 " + integer + "成功" + "\n");
                    }
                }).subscribe(new Consumer<Integer>() {
            @Override
            public void accept(@NonNull Integer integer) throws Exception {
                mRxOperatorsText.append("doOnNext :" + integer + "\n");
                Log.e(TAG, "doOnNext :" + integer + "\n");
            }
        });
    }
}
