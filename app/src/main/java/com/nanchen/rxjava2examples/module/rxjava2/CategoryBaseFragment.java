package com.nanchen.rxjava2examples.module.rxjava2;

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
import com.nanchen.rxjava2examples.module.rxjava2.operators.OperatorsAdapter;

import java.util.List;

import butterknife.BindView;

/**
 * Author: nanchen
 * Email: liushilin520@foxmail.com
 * Date: 2017-06-30  14:34
 */

public abstract class CategoryBaseFragment extends BaseFragment implements OnRefreshListener {

    protected List<OperatorModel> data;

    @BindView(R.id.operators_recycler)
    RecyclerView mRecyclerView;
    @BindView(R.id.operators_refresh)
    SwipeRefreshLayout mRefreshLayout;

    @Override
    protected int getContentViewLayoutID() {
        return R.layout.fragment_operators;
    }

    protected abstract void fillData();

    protected abstract void itemClick(int position);

    @Override
    protected void init() {
        fillData();
        OperatorsAdapter adapter = new OperatorsAdapter(data) {
            @Override
            public void onItemClick(int position) {
                itemClick(position);
            }
        };

        adapter.openLoadAnimation(BaseQuickAdapter.SCALEIN);

        mRefreshLayout.setColorSchemeColors(Color.RED, Color.BLUE, Color.GREEN);
        mRefreshLayout.setOnRefreshListener(this);


        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.addItemDecoration(new DividerItemDecoration(getActivity(), LinearLayoutManager.VERTICAL));

        mRecyclerView.setAdapter(adapter);

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