package com.nanchen.rxjava2examples.module.rxjava2.operators;

import android.content.Intent;
import android.graphics.Color;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.nanchen.rxjava2examples.R;
import com.nanchen.rxjava2examples.base.BaseFragment;
import com.nanchen.rxjava2examples.model.OperatorModel;
import com.nanchen.rxjava2examples.module.rxjava2.operators.item.RxConcatMapActivity;
import com.nanchen.rxjava2examples.module.rxjava2.operators.item.RxCreateActivity;
import com.nanchen.rxjava2examples.module.rxjava2.operators.item.RxDoOnNextActivity;
import com.nanchen.rxjava2examples.module.rxjava2.operators.item.RxFilterActivity;
import com.nanchen.rxjava2examples.module.rxjava2.operators.item.RxFlatMapActivity;
import com.nanchen.rxjava2examples.module.rxjava2.operators.item.RxIntervalActivity;
import com.nanchen.rxjava2examples.module.rxjava2.operators.item.RxJustActivity;
import com.nanchen.rxjava2examples.module.rxjava2.operators.item.RxMapActivity;
import com.nanchen.rxjava2examples.module.rxjava2.operators.item.RxSingleActivity;
import com.nanchen.rxjava2examples.module.rxjava2.operators.item.RxSkipActivity;
import com.nanchen.rxjava2examples.module.rxjava2.operators.item.RxTakeActivity;
import com.nanchen.rxjava2examples.module.rxjava2.operators.item.RxTimerActivity;
import com.nanchen.rxjava2examples.module.rxjava2.operators.item.RxZipActivity;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * 操作符Fragment
 *
 * Author: nanchen
 * Email: liushilin520@foxmail.com
 * Date: 2017-06-20  14:55
 */

public class OperatorsFragment extends BaseFragment implements OnRefreshListener{

    private OperatorsAdapter mAdapter;
    private List<OperatorModel> data;

    @BindView(R.id.operators_recycler)
    RecyclerView mRecyclerView;
    @BindView(R.id.operators_refresh)
    SwipeRefreshLayout mRefreshLayout;

    @Override
    protected int getContentViewLayoutID() {
        return R.layout.fragment_operators;
    }


    @Override
    protected void init() {
        fillData();
        mAdapter = new OperatorsAdapter(data) {
            @Override
            public void onItemClick(int position) {
                itemClick(position);
            }
        };

        mAdapter.openLoadAnimation(BaseQuickAdapter.SCALEIN);

        mRefreshLayout.setColorSchemeColors(Color.RED, Color.BLUE, Color.GREEN);
        mRefreshLayout.setOnRefreshListener(this);


        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.addItemDecoration(new DividerItemDecoration(getActivity(),LinearLayoutManager.VERTICAL));

        mRecyclerView.setAdapter(mAdapter);

    }

    private void itemClick(int position) {
        switch (position){
            case 0:
                startActivity(new Intent(getActivity(), RxCreateActivity.class));
                break;
            case 1:
                startActivity(new Intent(getActivity(), RxZipActivity.class));
                break;
            case 2:
                startActivity(new Intent(getActivity(), RxMapActivity.class));
                break;
            case 3:
                startActivity(new Intent(getActivity(), RxFlatMapActivity.class));
                break;
            case 4:
                startActivity(new Intent(getActivity(), RxConcatMapActivity.class));
                break;
            case 5:
                startActivity(new Intent(getActivity(), RxDoOnNextActivity.class));
                break;
            case 6:
                startActivity(new Intent(getActivity(), RxFilterActivity.class));
                break;
            case 7:
                startActivity(new Intent(getActivity(), RxSkipActivity.class));
                break;
            case 8:
                startActivity(new Intent(getActivity(), RxTakeActivity.class));
                break;
            case 9:
                startActivity(new Intent(getActivity(), RxTimerActivity.class));
                break;
            case 10:
                startActivity(new Intent(getActivity(), RxIntervalActivity.class));
                break;
            case 11:
                startActivity(new Intent(getActivity(), RxJustActivity.class));
                break;
            case 12:
                startActivity(new Intent(getActivity(), RxSingleActivity.class));
                break;
        }
    }

    private void fillData() {
        data = new ArrayList<>();
        data.add(new OperatorModel(getString(R.string.rx_create),"可用于获取一个被观察的对象"));
        data.add(new OperatorModel(getString(R.string.rx_zip),"合并事件专用," +
                "分别从两个上游事件中各取出一个组合," +
                "一个事件只能被使用一次，顺序严格按照事件发送的顺序," +
                "最终下游事件收到的是和上游事件最少的数目相同（必须两两配对，多余的舍弃)"));
        data.add(new OperatorModel(getString(R.string.rx_map),"基本是RxJava 最简单的操作符了作用是对上游发送的每一个事件应用一个函数，" +
                "使得每一个事件都按照指定的函数去变化"));
        data.add(new OperatorModel(getString(R.string.rx_flatMap),"FlatMap将一个发送事件的上游Observable变换成多个发送事件的Observables， 然后将它们发射的时间合并后放进一个单独的Observable里"));
        data.add(new OperatorModel(getString(R.string.rx_concatMap),"concatMap作用和flatMap几乎一模一样，唯一的区别是它能保证事件的顺序"));
        data.add(new OperatorModel(getString(R.string.rx_doOnNext),"让订阅者在接收到数据前干点事情的操作符"));
        data.add(new OperatorModel(getString(R.string.rx_filter),"过滤操作符，取正确的值"));
        data.add(new OperatorModel(getString(R.string.rx_skip),"接受一个long型参数，代表跳过多少个数目的事件再开始接收"));
        data.add(new OperatorModel(getString(R.string.rx_take),"用于指定订阅者最多收到多少数据"));
        data.add(new OperatorModel(getString(R.string.rx_timer),"在Rxjava中timer 操作符既可以延迟执行一段逻辑，也可以间隔执行一段逻辑\n" +
                "【注意】但在RxJava 2.x已经过时了，现在用interval操作符来间隔执行，详见RxIntervalActivity\n" +
                "timer和interval都默认执行在一个新线程上。"));
        data.add(new OperatorModel(getString(R.string.rx_interval),"间隔执行操作，默认在新线程"));
        data.add(new OperatorModel(getString(R.string.rx_just),"just操作符，和RxJava 1.x 没有什么区别，就是接受一个可变参数，依次发送"));
        data.add(new OperatorModel(getString(R.string.rx_single),"顾名思义，Single只会接收一个参数" +
                "而SingleObserver只会调用onError或者onSuccess"));


    }

    @Override
    public void onRefresh() {
        mRefreshLayout.post(new Runnable() {
            @Override
            public void run() {
                mRefreshLayout.setRefreshing(false);
            }
        });
    }
}