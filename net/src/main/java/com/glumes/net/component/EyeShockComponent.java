package com.glumes.net.component;

import com.glumes.net.NetClient;
import com.glumes.net.module.EyeShockModule;
import com.glumes.net.scope.EyeShockScope;

import dagger.Component;

/**
 * Created by glumes on 2017/8/21.
 */

@EyeShockScope
@Component(
        dependencies = NetBaseComponent.class,
        modules = {
                EyeShockModule.class
        }
)
public interface EyeShockComponent {
    void inject(NetClient netClient);
}
