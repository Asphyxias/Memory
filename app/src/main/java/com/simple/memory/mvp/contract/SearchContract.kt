package com.simple.memory.mvp.contract

import com.simple.memory.base.IModel
import com.simple.memory.base.IPresenter
import com.simple.memory.base.IView

interface SearchContract {

    interface Presenter : IPresenter

    interface View : IView

    interface Model : IModel

}