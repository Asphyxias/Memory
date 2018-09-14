package com.simple.memory.mvp.present

import com.simple.memory.base.BasePresenter
import com.simple.memory.mvp.contract.MainContract

import javax.inject.Inject


class MainPresent @Inject
constructor(rootView: MainContract.View, model: MainContract.Model) : BasePresenter<MainContract.View, MainContract.Model>(rootView, model), MainContract.Present {


    override fun setButtonListener(s: String) {
        view.showToast(s)
    }
}
