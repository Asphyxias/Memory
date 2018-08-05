package com.simple.memory.base;

import android.support.annotation.VisibleForTesting;
import com.simple.memory.http.base.BaseServiceManager;

public class BaseModel<S extends BaseServiceManager> implements IModel {

    /**
     * Retrofit Service Manager
     */
    @VisibleForTesting
    public S serviceManager;

    public BaseModel(S serviceManager) {
        this.serviceManager = serviceManager;
    }

    @Override
    public void onDestroy() {
        serviceManager = null;
    }

}
