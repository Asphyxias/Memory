package com.simple.memory.injection.activity.component;

import android.content.Context;
import android.content.SharedPreferences;

import com.simple.memory.mvp.view.MainActivity;

import dagger.Module;
import dagger.Provides;
import dagger.Subcomponent;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;

@Subcomponent( modules = {
        AndroidInjectionModule.class,
        MainActivityComponent.SubModule.class
})
public interface MainActivityComponent extends AndroidInjector<MainActivity>{
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity> {
    }

    @Module
    class SubModule {

        @Provides
        String provideName() {
            return MainActivity.class.getName();
        }

        @Provides
        SharedPreferences provideSp(MainActivity activity) {
            return activity.getSharedPreferences("def", Context.MODE_PRIVATE);
        }

    }
}
