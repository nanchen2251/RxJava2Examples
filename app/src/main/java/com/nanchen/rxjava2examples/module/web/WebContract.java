package com.nanchen.rxjava2examples.module.web;

import android.app.Activity;

import com.nanchen.rxjava2examples.base.BasePresenter;
import com.nanchen.rxjava2examples.base.BaseView;


/**
 * WebContract
 *
 * Author: nanchen
 * Email: liushilin520@foxmail.com
 * Date: 2017-04-14  14:38
 */

public interface WebContract {

    interface IWebView extends BaseView {
        Activity getWebViewContext();

        void setGankTitle(String title);

        void loadGankUrl(String url);

        void initWebView();
    }

    interface IWebPresenter extends BasePresenter {
        String getGankUrl();
    }
}
