package com.simple.memory.mvp.present;

import com.simple.memory.base.BasePresenter;
import com.simple.memory.mvp.contract.MainContract;

import org.jetbrains.annotations.NotNull;

import javax.inject.Inject;


public class MainPresent extends BasePresenter<MainContract.View, MainContract.Model> implements MainContract.Present{

    @Inject
    public MainPresent(MainContract.View rootView, MainContract.Model model) {
        super(rootView, model);
    }


    @Override
    public void setButtonListener(@NotNull String s) {
        view.showToast(s);
    }
}
