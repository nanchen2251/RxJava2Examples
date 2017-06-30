package com.nanchen.rxjava2examples.net;

import com.nanchen.rxjava2examples.net.api.GankApi;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * 网络操作类
 *
 * Author: nanchen
 * Email: liushilin520@foxmail.com
 * Date: 2017-06-30  13:20
 */

public class Network {
    private static GankApi gankApi;
    private static OkHttpClient okHttpClient = new OkHttpClient();

    public static GankApi getGankApi() {
        if (gankApi == null) {
            Retrofit retrofit = new Retrofit.Builder()
                    .client(okHttpClient)
                    .baseUrl("http://gank.io/api/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .build();
            gankApi = retrofit.create(GankApi.class);
        }
        return gankApi;
    }
}
