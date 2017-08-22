package com.glumes.net.component;

import com.glumes.net.NetClient;
import com.glumes.net.module.NetClientModule;
import com.glumes.net.scope.NetClientScope;

import dagger.Component;

/**
 * Created by zhaoying on 2017/8/22.
 */


@NetClientScope
@Component(
        modules = {
                NetClientModule.class
        }
)
public interface NetClientComponent {
    void inject(NetClient netClient);
}
