package com.nanchen.rxjava2examples.module.rxjava2.operators.item;

import android.util.Log;

import com.nanchen.rxjava2examples.R;

import io.reactivex.Observable;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Consumer;

/**
 * last
 * <p>
 * 取出最后一个值，参数是没有值的时候的默认值
 * <p>
 * Author: nanchen
 * Email: liushilin520@foxmail.com
 * Date: 2017-06-22  11:15
 */

public class RxLastActivity extends RxOperatorBaseActivity {
    private static final String TAG = "RxLastActivity";

    @Override
    protected String getSubTitle() {
        return getString(R.string.rx_last);
    }

    @Override
    protected void doSomething() {
        Observable.just(1, 2, 3)
                .last(4)
                .subscribe(new Consumer<Integer>() {
                    @Override
                    public void accept(@NonNull Integer integer) throws Exception {
                        mRxOperatorsText.append("last : " + integer + "\n");
                        Log.e(TAG, "last : " + integer + "\n");
                    }
                });
    }
}
