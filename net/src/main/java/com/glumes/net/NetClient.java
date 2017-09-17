package com.glumes.net;


import com.glumes.net.bean.DiscoveryAuthorBean;
import com.glumes.net.bean.DiscoveryBean;
import com.glumes.net.bean.DiscoveryCategoryBean;
import com.glumes.net.bean.DiscoveryHotBean;
import com.glumes.net.bean.HomeModule;
import com.glumes.net.component.DaggerNetClientComponent;
import com.glumes.net.constant.UrlConstant;
import com.glumes.net.module.NetClientModule;

import javax.inject.Inject;

import io.reactivex.Observable;
import retrofit2.http.Url;


/**
 * Created by glumes on 2017/8/21.
 */

public class NetClient {

    @Inject
    public ServiceFactory serviceFactory;


    private static class NetClientHolder {
        public static NetClient instance = new NetClient();
    }

    private NetClient() {
        DaggerNetClientComponent
                .builder()
                .netClientModule(new NetClientModule())
                .build().inject(this);
    }

    public static NetClient getInstance() {
        return NetClientHolder.instance;
    }

    public Observable<HomeModule> requetHomeContent() {
        return serviceFactory.getEyeService().requetHomeContent(UrlConstant.HOME_URL);
    }

    public Observable<DiscoveryBean> requestDiscovery() {
        return serviceFactory.getEyeService().requestDiscovery(UrlConstant.DISCOVERY_URL);
    }

    public Observable<DiscoveryHotBean> requestDiscoveryHot() {
        return serviceFactory.getEyeService().requestDiscoveryHot(UrlConstant.DISCOVERY_HOT_URL);
    }

    public Observable<DiscoveryCategoryBean> requestDiscoveryCategory() {
        return serviceFactory.getEyeService().requestDiscoveryCategory(UrlConstant.DISCOVERY_CATEGORY_URL);
    }

    public Observable<DiscoveryAuthorBean> requestDiscoveryAuthor() {
        return serviceFactory.getEyeService().requestDiscoveryAuthor(UrlConstant.DISCOVERY_AUTHOR_URL);
    }

}
