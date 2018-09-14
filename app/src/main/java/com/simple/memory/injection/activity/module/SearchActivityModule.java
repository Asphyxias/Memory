package com.simple.memory.injection.activity.module;

import com.simple.memory.http.entity.UserInfo;
import com.simple.memory.mvp.contract.SearchContract;
import com.simple.memory.mvp.present.SearchPresent;
import com.simple.memory.mvp.view.SearchActivity;
import com.simple.memory.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

@Module
public class SearchActivityModule {

    @Provides
    @ActivityScope
    public SearchContract.View provideSearchActivity(SearchActivity activity){
        return activity;
    }

    @Provides
    @ActivityScope
    public SearchContract.Presenter provideSearchPresenter(SearchPresent present){
        return present;
    }

    @Provides
    @ActivityScope
    public UserInfo provideUserInfo(){
        return new UserInfo();
    }


}
