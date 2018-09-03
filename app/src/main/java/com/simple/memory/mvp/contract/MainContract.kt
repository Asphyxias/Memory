package com.simple.memory.mvp.contract

import com.simple.memory.base.IModel
import com.simple.memory.base.IPresenter
import com.simple.memory.base.IView

interface MainContract {

    interface Present : IPresenter{
        fun setButtonListener(s : String)
    }

    interface View : IView{
        fun showToast(s : String)
    }

    interface Model : IModel
}