package com.nanchen.rxjava2examples;

import android.app.Application;

import com.androidnetworking.AndroidNetworking;

/**
 * Author: nanchen
 * Email: liushilin520@foxmail.com
 * Date: 2017-06-30  15:02
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        AndroidNetworking.initialize(getApplicationContext());
    }
}
