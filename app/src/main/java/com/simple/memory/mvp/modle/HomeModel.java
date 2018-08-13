package com.simple.memory.mvp.modle;

import com.simple.memory.base.BaseModel;
import com.simple.memory.http.service.ServiceManager;
import com.simple.memory.mvp.contract.HomeContract;

import javax.inject.Inject;

public class HomeModel extends BaseModel<ServiceManager> implements HomeContract.Model{
    @Inject
    public HomeModel(ServiceManager serviceManager) {
        super(serviceManager);
    }
}
