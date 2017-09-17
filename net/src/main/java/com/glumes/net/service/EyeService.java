package com.glumes.net.service;

import com.glumes.net.bean.DiscoveryAuthorBean;
import com.glumes.net.bean.DiscoveryBean;
import com.glumes.net.bean.DiscoveryCategoryBean;
import com.glumes.net.bean.DiscoveryHotBean;
import com.glumes.net.bean.HomeModule;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * Created by glumes on 2017/8/21.
 */

public interface EyeService {

    @GET
    Observable<HomeModule> requetHomeContent(
            @Url String url
    );

    @GET
    Observable<DiscoveryBean> requestDiscovery(
            @Url String url
    );

    @GET
    Observable<DiscoveryHotBean> requestDiscoveryHot(
            @Url String url
    );

    @GET
    Observable<DiscoveryCategoryBean> requestDiscoveryCategory(
            @Url String url
    );

    @GET
    Observable<DiscoveryAuthorBean> requestDiscoveryAuthor(
            @Url String url
    );

}
