package com.nanchen.rxjava2examples.module.rxjava2.operators.item;

import com.nanchen.rxjava2examples.R;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Consumer;

/**
 * timer
 *
 * 在Rxjava中timer 操作符既可以延迟执行一段逻辑，也可以间隔执行一段逻辑
 * 【注意】但在RxJava 2.x已经过时了，现在用interval操作符来间隔执行，详见RxIntervalActivity
 *  timer和interval都默认执行在一个新线程上。
 *
 * Author: nanchen
 * Email: liushilin520@foxmail.com
 * Date: 2017-06-20  11:14
 */

public class RxTimerActivity extends RxOperatorBaseActivity {
    @Override
    protected String getSubTitle() {
        return getString(R.string.rx_timer);
    }

    @Override
    protected void doSomething() {
        Observable.timer(2, TimeUnit.MILLISECONDS)
                .subscribe(new Consumer<Long>() {
                    @Override
                    public void accept(@NonNull Long aLong) throws Exception {
                        mRxOperatorsText.append("timer :"+aLong+"\n");
                    }
                });
    }

}
