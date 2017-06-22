package com.nanchen.rxjava2examples.module.rxjava2.operators.item;

import android.util.Log;

import com.nanchen.rxjava2examples.R;

import io.reactivex.Observable;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Consumer;

/**
 * skip
 *
 * 接受一个long型参数，代表跳过多少个数目的事件再开始接收
 *
 * Author: nanchen
 * Email: liushilin520@foxmail.com
 * Date: 2017-06-20  13:53
 */

public class RxSkipActivity extends RxOperatorBaseActivity {
    private static final String TAG = "RxSkipActivity";

    @Override
    protected String getSubTitle() {
        return getString(R.string.rx_skip);
    }

    @Override
    protected void doSomething() {
        Observable.just(1,2,3,4,5)
                .skip(2)
                .subscribe(new Consumer<Integer>() {
                    @Override
                    public void accept(@NonNull Integer integer) throws Exception {
                        mRxOperatorsText.append("skip : "+integer + "\n");
                        Log.e(TAG, "skip : "+integer + "\n");
                    }
                });
    }
}
