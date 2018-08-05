package com.simple.memory.base;

import android.content.Context;
import android.support.v4.app.Fragment;

import dagger.android.support.AndroidSupportInjection;

/**
 * The class for controlling the dependency injection category.
 * <p>
 * Dependency injection that developers should be concerned about is the *Dagger* and the *ARouter*
 * <p>
 * Created by QingMei on 2017/12/27.
 */

public abstract class BaseInjectFragment extends Fragment {

    protected void inject() {
        AndroidSupportInjection.inject(this);
    }

    @Override
    public void onAttach(Context context) {
        inject();
        super.onAttach(context);
    }
}
