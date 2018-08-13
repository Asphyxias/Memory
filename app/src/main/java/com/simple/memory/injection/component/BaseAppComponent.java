package com.simple.memory.injection.component;

import com.google.gson.Gson;
import com.simple.memory.base.BaseApplication;
import com.simple.memory.http.service.ServiceManager;
import com.simple.memory.injection.ActivitiesModule;
import com.simple.memory.module.AppModule;
import com.simple.memory.module.GlobalConfigModule;
import com.simple.memory.module.HttpClientModule;
import com.simple.memory.module.ServiceModule;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.support.AndroidSupportInjectionModule;
import okhttp3.OkHttpClient;


@Singleton
@Component(modules = {
        AndroidInjectionModule.class,
        AndroidSupportInjectionModule.class,
        AppModule.class,
        HttpClientModule.class,
        GlobalConfigModule.class,
        ServiceModule.class,
        ActivitiesModule.class
})
public interface BaseAppComponent {

    Gson gson();

    OkHttpClient okHttpClient();

    ServiceManager serviceManager();

    BaseApplication baseApplication();

    void inject(BaseApplication application);
}
