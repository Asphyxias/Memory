package com.simple.memory.mvp.modle;

import com.simple.memory.base.BaseModel;
import com.simple.memory.http.service.ServiceManager;
import com.simple.memory.mvp.contract.MainContract;

import javax.inject.Inject;

public class MainModel extends BaseModel<ServiceManager> implements MainContract.Model {
    @Inject
    public MainModel(ServiceManager serviceManager) {
        super(serviceManager);
    }
}
