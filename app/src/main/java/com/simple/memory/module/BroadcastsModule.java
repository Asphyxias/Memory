package com.simple.memory.module;

import com.simple.memory.injection.component.BroadcastsComponent;
import dagger.Module;


@Module(subcomponents = {
        BroadcastsComponent.class
})
public abstract class BroadcastsModule {


}
