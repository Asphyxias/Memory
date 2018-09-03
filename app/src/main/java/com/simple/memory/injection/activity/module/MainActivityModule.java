package com.simple.memory.injection.activity.module;

import com.simple.memory.mvp.contract.MainContract;
import com.simple.memory.mvp.modle.MainModel;
import com.simple.memory.mvp.present.MainPresent;
import com.simple.memory.mvp.view.MainActivity;
import com.simple.memory.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class MainActivityModule {

    @Provides
    @ActivityScope
    static MainContract.View provideView(MainActivity activity) {
        return activity;
    }

    @Provides
    @ActivityScope
    static MainContract.Present providePresent(MainPresent mainPresent) {
        return mainPresent;
    }

    @Provides
    @ActivityScope
    static MainContract.Model provideModel(MainModel mainModel) {
        return mainModel;
    }
}
