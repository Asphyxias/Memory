package com.simple.memory.injection;

import com.simple.memory.injection.activity.HomeActivityModule;
import com.simple.memory.injection.component.BaseActivityComponent;
import com.simple.memory.mvp.view.HomeActivity;
import com.simple.memory.scope.ActivityScope;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;


@Module(subcomponents = {
        BaseActivityComponent.class
})
public abstract class ActivitiesModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = HomeActivityModule.class)
    abstract HomeActivity contributeHomeActivitytInjector();

}
