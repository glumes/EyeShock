package com.glumes.net;

import android.util.SparseArray;

import com.glumes.net.component.DaggerEyeShockComponent;
import com.glumes.net.component.DaggerNetBaseComponent;
import com.glumes.net.component.NetBaseComponent;
import com.glumes.net.constant.ServiceTypeConstant;
import com.glumes.net.module.EyeShockModule;
import com.glumes.net.module.NetBaseModule;
import com.glumes.net.service.EyeService;

import javax.inject.Inject;

import retrofit2.Retrofit;

/**
 * Created by zhaoying on 2017/8/22.
 */

public class ServiceFactory {

    private SparseArray<Object> serviceMap;

    @Inject
    private Retrofit retrofit;

    private static class ServiceFactoryHolder {

        private static ServiceFactory instance = new ServiceFactory();

        private ServiceFactoryHolder() {
        }
    }

    private ServiceFactory() {
        serviceMap = new SparseArray<>();

        NetBaseComponent netBaseComponent = DaggerNetBaseComponent.builder().netBaseModule(new NetBaseModule())
                .build();
        DaggerEyeShockComponent.builder().netBaseComponent(netBaseComponent)
                .eyeShockModule(new EyeShockModule())
                .build()
                .inject(this);


    }

    public static ServiceFactory getInstance() {
        return ServiceFactoryHolder.instance;
    }

    public Object createService(int type) {

        if (serviceMap.get(type) != null) {
            return serviceMap.get(type);
        }

        if (type == ServiceTypeConstant.TYPE_OPEN_EYE) {
            serviceMap.put(type, createService(EyeService.class));
            return serviceMap.get(type);
        }

        return null;
    }


    private <S> S createService(Class<S> serviceClass) {
        return retrofit.create(serviceClass);
    }
}
