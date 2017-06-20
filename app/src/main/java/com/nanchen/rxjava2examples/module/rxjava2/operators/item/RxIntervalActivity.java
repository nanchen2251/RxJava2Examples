package com.nanchen.rxjava2examples.module.rxjava2.operators.item;

import com.nanchen.rxjava2examples.R;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Consumer;

/**
 * interval
 *
 * 间隔执行操作，默认在新线程
 *
 * Author: nanchen
 * Email: liushilin520@foxmail.com
 * Date: 2017-06-20  11:23
 */

public class RxIntervalActivity extends RxOperatorBaseActivity {
    @Override
    protected String getSubTitle() {
        return getString(R.string.rx_interval);
    }

    @Override
    protected void doSomething() {
        Observable.interval(0,5, TimeUnit.SECONDS)
                .subscribe(new Consumer<Long>() {
                    @Override
                    public void accept(@NonNull Long aLong) throws Exception {
                        mRxOperatorsText.append("interval : "+aLong + "\n");
                    }
                });
    }
}
