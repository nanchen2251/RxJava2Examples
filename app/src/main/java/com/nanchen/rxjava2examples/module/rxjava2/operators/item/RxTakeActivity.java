package com.nanchen.rxjava2examples.module.rxjava2.operators.item;

import android.util.Log;

import com.nanchen.rxjava2examples.R;

import io.reactivex.Flowable;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Consumer;

/**
 * take
 *
 * 用于指定订阅者最多收到多少数据
 *
 *
 * Author: nanchen
 * Email: liushilin520@foxmail.com
 * Date: 2017-06-20  10:59
 */

public class RxTakeActivity extends RxOperatorBaseActivity {
    private static final String TAG = "RxTakeActivity";

    @Override
    protected String getSubTitle() {
        return getString(R.string.rx_take);
    }

    @Override
    protected void doSomething() {
        Flowable.fromArray(1,2,3,4,5)
                .take(2)
                .subscribe(new Consumer<Integer>() {
                    @Override
                    public void accept(@NonNull Integer integer) throws Exception {
                        mRxOperatorsText.append("take : "+integer + "\n");
                        Log.e(TAG, "accept: take : "+integer + "\n" );
                    }
                });
    }
}
