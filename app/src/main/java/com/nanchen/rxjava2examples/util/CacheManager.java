package com.nanchen.rxjava2examples.util;

import com.nanchen.rxjava2examples.model.FoodList;

/**
 * 缓存管理器
 *
 * Author: nanchen
 * Email: liushilin520@foxmail.com
 * Date: 2017-07-03  9:49
 */

public class CacheManager {
    private static CacheManager instance;
    private FoodList footListJson;

    private CacheManager(){}

    public static CacheManager getInstance(){
        if (instance == null){
            instance = new CacheManager();
        }
        return instance;
    }

    public FoodList getFoodListData(){
        return this.footListJson;
    }

    public void setFoodListData(FoodList data){
        this.footListJson = data;
    }
}
