package com.nanchen.rxjava2examples.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.jaeger.library.StatusBarUtil;
import com.nanchen.rxjava2examples.R;

import butterknife.BindView;

/**
 * 封装一个带ToolBar和Butterknife注解的Activity基类
 *
 * Author: nanchen
 * Email: liushilin520@foxmail.com
 * Date: 2017-06-19  13:51
 */

public abstract class ToolbarBaseActivity extends BaseActivity {

    @BindView(R.id.toolbar)
    Toolbar mToolbar;
    @BindView(R.id.title_text)
    TextView mTitleName;


    /**
     * 设置标题文本
     */
    protected abstract String getSubTitle();


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        StatusBarUtil.setColor(this,getResources().getColor(R.color.blue)); //
        if (getContentViewLayoutID() != 0) {
            initToolbar();
        }
    }

    private void initToolbar() {
        if (mToolbar != null){
            mToolbar.setTitle("");
            mTitleName.setText(getSubTitle());
            if (isShowBack()){
                showBack();
            }
        }
    }

    /**
     * 版本号小于21的后退按钮图片
     */
    private void showBack(){
        //setNavigationIcon必须在setSupportActionBar(toolbar);方法后面加入
        setSupportActionBar(mToolbar);
        mToolbar.setNavigationIcon(R.mipmap.icon_back);
        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }


    protected boolean isShowBack(){
        return true;
    }

}
