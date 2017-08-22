package com.glumes.net;

import android.util.SparseArray;

import com.glumes.net.component.DaggerNetBaseComponent;
import com.glumes.net.component.DaggerServiceComponent;
import com.glumes.net.component.NetBaseComponent;
import com.glumes.net.constant.ServiceTypeConstant;
import com.glumes.net.module.ServiceModule;
import com.glumes.net.module.NetBaseModule;
import com.glumes.net.service.EyeService;

import javax.inject.Inject;


/**
 * Created by zhaoying on 2017/8/22.
 */

public class ServiceFactory {


    @Inject
    public EyeService eyeService;

    public ServiceFactory() {

        NetBaseComponent netBaseComponent = DaggerNetBaseComponent.builder().netBaseModule(new NetBaseModule())
                .build();

        DaggerServiceComponent.builder().netBaseComponent(netBaseComponent)
                .serviceModule(new ServiceModule())
                .build()
                .inject(this);

    }

    public EyeService getEyeService() {
        return eyeService;
    }
}
