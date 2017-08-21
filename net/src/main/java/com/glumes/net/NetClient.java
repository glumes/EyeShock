package com.glumes.net;

import com.glumes.net.bean.HomeBean;
import com.glumes.net.component.DaggerEyeShockComponent;
import com.glumes.net.component.DaggerNetBaseComponent;
import com.glumes.net.component.NetBaseComponent;
import com.glumes.net.constant.UrlConstant;
import com.glumes.net.module.EyeShockModule;
import com.glumes.net.module.NetBaseModule;
import com.glumes.net.service.EyeService;

import javax.inject.Inject;

import dagger.internal.DaggerCollections;
import io.reactivex.Observable;

/**
 * Created by glumes on 2017/8/21.
 */

public class NetClient {

    @Inject
    EyeService eyeService;

    public NetClient() {

        NetBaseComponent netBaseComponent = DaggerNetBaseComponent.builder().netBaseModule(new NetBaseModule())
                .build();
        DaggerEyeShockComponent.builder().netBaseComponent(netBaseComponent)
                .eyeShockModule(new EyeShockModule())
                .build()
                .inject(this);
    }


    public Observable<HomeBean> request() {
        return eyeService.requetHomeContent(UrlConstant.HOME_URL);
    }

}
