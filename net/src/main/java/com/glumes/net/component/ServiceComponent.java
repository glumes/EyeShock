package com.glumes.net.component;

import com.glumes.net.ServiceFactory;
import com.glumes.net.module.ServiceModule;
import com.glumes.net.scope.ServiceScope;

import dagger.Component;

/**
 * Created by glumes on 2017/8/21.
 */

@ServiceScope
@Component(
        dependencies = NetBaseComponent.class,
        modules = {
                ServiceModule.class
        }
)
public interface ServiceComponent {
    void inject(ServiceFactory serviceFactory);
}
