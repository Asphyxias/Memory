package com.simple.memory.mvp.present;

import com.simple.memory.base.BasePresenter;
import com.simple.memory.mvp.contract.MainContract;

public class MainPresent extends BasePresenter<MainContract.View, MainContract.Model>{

    public MainPresent(MainContract.View rootView, MainContract.Model model) {
        super(rootView, model);
    }


}
