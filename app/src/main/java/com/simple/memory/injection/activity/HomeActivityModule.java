package com.simple.memory.injection.activity;

import com.simple.memory.mvp.contract.HomeContract;
import com.simple.memory.mvp.modle.HomeModel;
import com.simple.memory.mvp.view.HomeActivity;
import com.simple.memory.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

@Module
public class HomeActivityModule {

    @Provides
    @ActivityScope
    static HomeContract.View provideView(HomeActivity activity) {
        return activity;
    }

    @Provides
    @ActivityScope
    static HomeContract.Model provideModel(HomeModel homeModel) {
        return homeModel;
    }
}
