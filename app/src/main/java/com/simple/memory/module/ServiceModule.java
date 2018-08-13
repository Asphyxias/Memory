package com.simple.memory.module;

import com.simple.memory.http.service.UserInfoService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

/**
 * Created by QingMei on 2017/8/15.
 * desc:
 */
@Module
public class ServiceModule {

    @Singleton
    @Provides
    UserInfoService provideUserInfoService(Retrofit retrofit) {
        return retrofit.create(UserInfoService.class);
    }
}
