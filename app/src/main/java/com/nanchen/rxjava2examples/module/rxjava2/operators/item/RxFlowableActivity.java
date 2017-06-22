package com.nanchen.rxjava2examples.module.rxjava2.operators.item;

import android.util.Log;

import com.nanchen.rxjava2examples.R;

import io.reactivex.Flowable;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;

/**
 * Flowable
 *
 * 专用于解决背压问题
 *
 * Author: nanchen
 * Email: liushilin520@foxmail.com
 * Date: 2017-06-22  15:15
 */

public class RxFlowableActivity extends RxOperatorBaseActivity {
    private static final String TAG = "RxFlowableActivity";

    @Override
    protected String getSubTitle() {
        return getString(R.string.rx_Flowable);
    }

    @Override
    protected void doSomething() {
        Flowable.just(1,2,3,4)
                .reduce(100, new BiFunction<Integer, Integer, Integer>() {
                    @Override
                    public Integer apply(@NonNull Integer integer, @NonNull Integer integer2) throws Exception {
                        return integer+integer2;
                    }
                }).subscribe(new Consumer<Integer>() {
            @Override
            public void accept(@NonNull Integer integer) throws Exception {
                mRxOperatorsText.append("Flowable :"+integer+"\n");
                Log.e(TAG, "Flowable :"+integer+"\n" );
            }
        });
    }
}
