package com.nanchen.rxjava2examples.module.rxjava2.operators.item;

import android.util.Log;

import com.nanchen.rxjava2examples.R;

import io.reactivex.Observable;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;


/**
 * reduce
 * <p>
 * 就是一次用一个方法处理一个值，可以有一个seed作为初始值
 * <p>
 * Author: nanchen
 * Email: liushilin520@foxmail.com
 * Date: 2017-06-22  11:27
 */

public class RxReduceActivity extends RxOperatorBaseActivity {
    private static final String TAG = "RxReduceActivity";

    @Override
    protected String getSubTitle() {
        return getString(R.string.rx_reduce);
    }

    @Override
    protected void doSomething() {
        Observable.just(1, 2, 3)
                .reduce(new BiFunction<Integer, Integer, Integer>() {
                    @Override
                    public Integer apply(@NonNull Integer integer, @NonNull Integer integer2) throws Exception {
                        return integer + integer2;
                    }
                }).subscribe(new Consumer<Integer>() {
            @Override
            public void accept(@NonNull Integer integer) throws Exception {
                mRxOperatorsText.append("reduce : " + integer + "\n");
                Log.e(TAG, "accept: reduce : " + integer + "\n");
            }
        });
    }
}
