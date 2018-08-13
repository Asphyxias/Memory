package com.simple.memory.mvp.present;


import com.simple.memory.base.BasePresenter;
import com.simple.memory.mvp.contract.HomeContract;

public class HomePresent extends BasePresenter<HomeContract.View, HomeContract.Model> implements HomeContract.Present {

    public HomePresent(HomeContract.View rootView, HomeContract.Model model) {
        super(rootView, model);
    }
}
