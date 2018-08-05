package com.simple.memory.http.service;


import com.simple.memory.http.base.BaseServiceManager;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class ServiceManager implements BaseServiceManager {

    private UserInfoService userInfoService;

    public UserInfoService getUserInfoService() {
        return userInfoService;
    }

    @Inject
    public ServiceManager(UserInfoService userInfoService) {
        this.userInfoService = userInfoService;
    }

    @Override
    public void destroy() {
        userInfoService = null;
    }

}
