package com.nanchen.rxjava2examples.module.rxjava2.operators.item;

import android.util.Log;

import com.nanchen.rxjava2examples.R;

import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.subjects.BehaviorSubject;

/**
 * BehaviorSubject
 *
 * BehaviorSubject 的最后一次 onNext() 操作会被缓存，然后在 subscribe() 后立刻推给新注册的 Observer
 *
 * Author: nanchen
 * Email: liushilin520@foxmail.com
 * Date: 2017-06-22  14:54
 */

public class RxBehaviorSubjectActivity extends RxOperatorBaseActivity {
    private static final String TAG = "RxBehaviorSubjectActivi";

    @Override
    protected String getSubTitle() {
        return getString(R.string.rx_BehaviorSubject);
    }

    @Override
    protected void doSomething() {
        mRxOperatorsText.append("BehaviorSubject\n");
        Log.e(TAG, "BehaviorSubject\n");

        BehaviorSubject<Integer> behaviorSubject = BehaviorSubject.create();

        behaviorSubject.subscribe(new Observer<Integer>() {
            @Override
            public void onSubscribe(@NonNull Disposable d) {
                mRxOperatorsText.append("First onSubscribe :"+d.isDisposed()+"\n");
                Log.e(TAG, "First onSubscribe :"+d.isDisposed()+"\n");
            }

            @Override
            public void onNext(@NonNull Integer integer) {
                mRxOperatorsText.append("First onNext value :"+integer + "\n");
                Log.e(TAG, "First onNext value :"+integer + "\n");
            }

            @Override
            public void onError(@NonNull Throwable e) {
                mRxOperatorsText.append("First onError:"+e.getMessage()+"\n");
                Log.e(TAG, "First onError:"+e.getMessage()+"\n" );
            }

            @Override
            public void onComplete() {
                mRxOperatorsText.append("First onComplete!\n");
                Log.e(TAG, "First onComplete!\n");
            }
        });

        behaviorSubject.onNext(1);
        behaviorSubject.onNext(2);
        behaviorSubject.onNext(3);

        behaviorSubject.subscribe(new Observer<Integer>() {
            @Override
            public void onSubscribe(@NonNull Disposable d) {
                mRxOperatorsText.append("Second onSubscribe :"+d.isDisposed()+"\n");
                Log.e(TAG, "Second onSubscribe :"+d.isDisposed()+"\n");
            }

            @Override
            public void onNext(@NonNull Integer integer) {
                mRxOperatorsText.append("Second onNext value :"+integer + "\n");
                Log.e(TAG, "Second onNext value :"+integer + "\n");
            }

            @Override
            public void onError(@NonNull Throwable e) {
                mRxOperatorsText.append("Second onError:"+e.getMessage()+"\n");
                Log.e(TAG, "Second onError:"+e.getMessage()+"\n" );
            }

            @Override
            public void onComplete() {
                mRxOperatorsText.append("Second onComplete!\n");
                Log.e(TAG, "Second onComplete!\n");
            }
        });

        behaviorSubject.onNext(4);
        behaviorSubject.onNext(5);
        behaviorSubject.onComplete();
    }
}
