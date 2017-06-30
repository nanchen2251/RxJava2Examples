package com.nanchen.rxjava2examples.net.api;

import com.nanchen.rxjava2examples.model.CategoryResult;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 *
 * 代码家的gank.io接口
 *
 * Author: nanchen
 * Email: liushilin520@foxmail.com
 * Date: 2017-06-30  13:21
 */

public interface GankApi {
    /**
     * 根据category获取Android、iOS等干货数据
     * @param category  类别
     * @param count     条目数目
     * @param page      页数
     */
    @GET("data/{category}/{count}/{page}")
    Observable<CategoryResult> getCategoryData(@Path("category")String category, @Path("count")int count, @Path("page")int page);
}
