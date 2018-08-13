package com.simple.memory.injection;

import com.google.gson.Gson;
import com.simple.memory.base.BaseApplication;
import com.simple.memory.http.service.ServiceManager;
import com.simple.memory.module.AppModule;
import com.simple.memory.module.GlobalConfigModule;
import com.simple.memory.module.HttpClientModule;
import com.simple.memory.module.ServiceModule;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.support.AndroidSupportInjectionModule;
import okhttp3.OkHttpClient;

/**
 * Created by QingMei on 2017/8/14.
 * desc:
 */
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
public interface ModuleAppComponent {

    Gson gson();

    ServiceManager serviceManager();

    OkHttpClient okHttpClient();

    BaseApplication baseApplication();

    void inject(BaseApplication application);
}
