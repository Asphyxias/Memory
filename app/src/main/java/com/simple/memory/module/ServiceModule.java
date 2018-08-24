package com.simple.memory.module;

import com.simple.memory.http.service.UserInfoService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

@Module
public class ServiceModule {

    @Singleton
    @Provides
    UserInfoService provideUserInfoService(Retrofit retrofit) {
        return retrofit.create(UserInfoService.class);
    }
}
