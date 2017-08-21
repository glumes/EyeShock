package com.glumes.net.component;

import com.glumes.net.module.NetBaseModule;
import com.google.gson.Gson;

import javax.inject.Singleton;

import dagger.Component;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/**
 * Created by glumes on 2017/8/21.
 */

@Singleton
@Component(modules = {
        NetBaseModule.class
})
public interface NetBaseComponent {

    OkHttpClient okHttpClient();

    Retrofit retrofit();

    Gson gson();
}
