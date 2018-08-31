package com.simple.memory.injection.activity;

import com.simple.memory.mvp.contract.MainContract;
import com.simple.memory.mvp.view.MainActivity;
import com.simple.memory.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

@Module
public class MainActivityModule {

    @Provides
    @ActivityScope
    static MainContract.View provideView(MainActivity activity) {
        return activity;
    }
}
