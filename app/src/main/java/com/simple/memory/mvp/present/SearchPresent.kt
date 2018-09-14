package com.simple.memory.mvp.present

import com.simple.memory.base.BasePresenter
import com.simple.memory.mvp.contract.SearchContract
import com.simple.memory.mvp.modle.SearchModel
import com.simple.memory.mvp.view.SearchActivity
import javax.inject.Inject


class SearchPresent @Inject
constructor(view: SearchActivity, model: SearchModel) : BasePresenter<SearchActivity, SearchContract.Model>(view, model), SearchContract.Presenter {

}