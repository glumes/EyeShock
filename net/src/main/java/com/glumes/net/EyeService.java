package com.glumes.net;

import retrofit2.http.GET;

/**
 * Created by glumes on 2017/8/21.
 */

public interface EyeService {

    @GET
    void requetHomeContent();
}
