package com.simple.memory.module;

import com.simple.memory.base.BaseApplication;
import com.simple.memory.module.sheduler.AppSchedulerProvider;
import com.simple.memory.module.sheduler.SchedulerProvider;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    private BaseApplication application;

    public AppModule(BaseApplication application) {
        this.application = application;
    }

    @Singleton
    @Provides
    public BaseApplication provideApplication() {
        return application;
    }

    @Singleton
    @Provides
    public SchedulerProvider provideSchedulers() {
        return new AppSchedulerProvider();
    }
}
