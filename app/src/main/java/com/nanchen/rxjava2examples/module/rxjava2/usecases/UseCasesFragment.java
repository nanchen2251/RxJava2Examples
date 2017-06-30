package com.nanchen.rxjava2examples.module.rxjava2.usecases;

import android.content.Intent;

import com.nanchen.rxjava2examples.model.OperatorModel;
import com.nanchen.rxjava2examples.module.rxjava2.CategoryBaseFragment;
import com.nanchen.rxjava2examples.module.rxjava2.usecases.fastNetwork.RxNetworkActivity;
import com.nanchen.rxjava2examples.module.rxjava2.usecases.okHttp.RxNetSingleActivity;
import com.nanchen.rxjava2examples.module.rxjava2.usecases.zip.RxCaseZipActivity;

import java.util.ArrayList;

/**
 * 用例Fragment
 *
 * Author: nanchen
 * Email: liushilin520@foxmail.com
 * Date: 2017-06-20  14:55
 */

public class UseCasesFragment extends CategoryBaseFragment {

    @Override
    protected void fillData() {
        data = new ArrayList<>();
        data.add(new OperatorModel("单一的网络请求",
                "1、通过 Observable.create() 方法，调用 OkHttp 网络请求;\n" +
                "2、通过 map 操作符结合 Gson , 将 Response 转换为 bean 类;\n" +
                "3、通过 doOnNext() 方法，解析 bean 中的数据，并进行数据库存储等操作;\n" +
                "4、调度线程，在子线程进行耗时操作任务，在主线程更新 UI;\n" +
                "5、通过 subscribe(),根据请求成功或者失败来更新 UI。"));
        data.add(new OperatorModel("使用框架 rx2-Networking",
                "1、通过 Rx2AndroidNetworking 的 get() 方法获取 Observable 对象(已解析)；\n" +
                        "2、调度线程，根据请求结果更新 UI。"));
        data.add(new OperatorModel("集合多个接口的数据再更新 UI",
                "zip 操作符可以把多个 Observable 的数据接口成一个数据源再发出去"));
    }

    @Override
    protected void itemClick(int position) {
        switch (position) {
            case 0:
                startActivity(new Intent(getActivity(), RxNetSingleActivity.class));
                break;
            case 1:
                startActivity(new Intent(getActivity(), RxNetworkActivity.class));
                break;
            case 2:
                startActivity(new Intent(getActivity(), RxCaseZipActivity.class));
                break;
        }
    }

}