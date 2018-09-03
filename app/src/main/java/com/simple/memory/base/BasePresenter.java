package com.simple.memory.base;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleOwner;
import android.support.annotation.CallSuper;
import android.support.annotation.MainThread;

import com.simple.memory.util.RxLifecycleUtils;
import com.uber.autodispose.AutoDisposeConverter;

import org.jetbrains.annotations.NotNull;

public class BasePresenter<V extends IView, M extends IModel> implements IPresenter {

    protected V view;

    protected M model;

    private LifecycleOwner lifecycleOwner;

    public BasePresenter(V rootView, M model) {
        this.view = rootView;
        this.model = model;
    }

    protected <T> AutoDisposeConverter<T> bindLifecycle() {
        if (null == lifecycleOwner)
            throw new NullPointerException("lifecycleOwner == null");
        return RxLifecycleUtils.bindLifecycle(lifecycleOwner);
    }

    @Override
    @CallSuper
    @MainThread
    public void onLifecycleChanged(@NotNull LifecycleOwner owner, @NotNull Lifecycle.Event event) {

    }

    @Override
    public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        this.lifecycleOwner = lifecycleOwner;
    }

    @Override
    @CallSuper
    @MainThread
    public void onCreate(@NotNull LifecycleOwner owner) {

    }

    @Override
    @CallSuper
    @MainThread
    public void onStart(@NotNull LifecycleOwner owner) {

    }

    @Override
    @CallSuper
    @MainThread
    public void onResume(@NotNull LifecycleOwner owner) {

    }

    @Override
    @CallSuper
    @MainThread
    public void onPause(@NotNull LifecycleOwner owner) {

    }

    @Override
    @CallSuper
    @MainThread
    public void onStop(@NotNull LifecycleOwner owner) {

    }

    @Override
    @CallSuper
    @MainThread
    public void onDestroy(@NotNull LifecycleOwner owner) {
        if (model != null) {
            model.onDestroy();
            this.model = null;
        }
        this.view = null;
    }

}
