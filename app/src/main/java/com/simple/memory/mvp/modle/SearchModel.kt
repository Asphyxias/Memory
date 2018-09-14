package com.simple.memory.mvp.modle

import com.simple.memory.base.BaseModel
import com.simple.memory.http.service.ServiceManager
import com.simple.memory.mvp.contract.SearchContract
import javax.inject.Inject

class SearchModel @Inject
constructor(serviceManager: ServiceManager) : BaseModel<ServiceManager>(serviceManager), SearchContract.Model{}
