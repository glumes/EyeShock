package com.glumes.net.service;

import com.glumes.net.bean.HomeBean;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * Created by glumes on 2017/8/21.
 */

public interface EyeService {

    @GET
    Observable<HomeBean> requetHomeContent(
            @Url String url
    );
}
