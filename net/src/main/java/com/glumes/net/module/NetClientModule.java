package com.glumes.net.module;

import com.glumes.net.ServiceFactory;
import com.glumes.net.scope.NetClientScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by zhaoying on 2017/8/22.
 */

@Module
public class NetClientModule {

    public NetClientModule() {
    }

    @NetClientScope
    @Provides
    ServiceFactory provideServiceFactory() {
        return new ServiceFactory();
    }
}
