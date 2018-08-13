package com.simple.memory.mvp.view;


import com.simple.memory.R;
import com.simple.memory.base.BaseActivity;
import com.simple.memory.databinding.ActivityHomeBinding;
import com.simple.memory.mvp.contract.HomeContract;
import com.simple.memory.mvp.present.HomePresent;

public class HomeActivity extends BaseActivity<HomePresent, ActivityHomeBinding> implements HomeContract.View {

    @Override
    protected int getLayoutId() {
        return R.layout.activity_home;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }

    @Override
    protected void inject() {
        super.inject();

    }
}
