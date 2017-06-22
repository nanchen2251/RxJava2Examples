package com.nanchen.rxjava2examples.module.rxjava2.operators.item;

import android.util.Log;

import com.nanchen.rxjava2examples.R;

import java.util.concurrent.Callable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Consumer;

/**
 * defer
 *
 * 简单的说就是每次订阅都会创建一个新的Observable
 *
 * Author: nanchen
 * Email: liushilin520@foxmail.com
 * Date: 2017-06-22  11:06
 */

public class RxDeferActivity extends RxOperatorBaseActivity {
    private static final String TAG = "RxDeferActivity";

    @Override
    protected String getSubTitle() {
        return getString(R.string.rx_defer);
    }

    @Override
    protected void doSomething() {

        Observable<Integer> observable = Observable.defer(new Callable<ObservableSource<Integer>>() {
            @Override
            public ObservableSource<Integer> call() throws Exception {
                return Observable.just(1,2,3);
            }
        });
        observable.subscribe(new Consumer<Integer>() {
            @Override
            public void accept(@NonNull Integer integer) throws Exception {
                mRxOperatorsText.append("defer 0 : "+integer+"\n");
                Log.e(TAG,"defer 0 : "+integer+"\n");
            }
        });
    }
}
