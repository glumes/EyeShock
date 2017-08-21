package com.glumes.net;

import javax.inject.Singleton;

import dagger.Provides;
import okhttp3.OkHttpClient;

/**
 * Created by glumes on 2017/8/21.
 */

public class NetModule {


    public static final String BASE_URL = "";

    @Singleton
    @Provides
    OkHttpClient provideHttpClient() {

    }

}
