package com.simple.memory.mvp.view

import android.view.View
import android.widget.TextView
import android.widget.Toast
import com.simple.memory.R
import com.simple.memory.base.BaseActivity
import com.simple.memory.databinding.ActivitySearchBinding
import com.simple.memory.http.entity.UserInfo
import com.simple.memory.mvp.contract.SearchContract
import com.simple.memory.mvp.present.SearchPresent
import javax.inject.Inject

class SearchActivity : BaseActivity<SearchPresent, ActivitySearchBinding>(), SearchContract.View {

    @Inject
    @JvmField var userInfo: UserInfo? = null

    override fun getLayoutId(): Int {
        return R.layout.activity_search
    }

    override fun initView() {
        findViewById<TextView>(R.id.tt).setOnClickListener(View.OnClickListener(){
            Toast.makeText(this,userInfo.toString(), Toast.LENGTH_LONG).show()
        })

    }

    override fun initData() {

    }

}
