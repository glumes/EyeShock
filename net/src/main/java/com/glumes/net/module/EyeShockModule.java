package com.glumes.net.module;

import com.glumes.net.scope.EyeShockScope;
import com.glumes.net.service.EyeService;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

/**
 * Created by glumes on 2017/8/21.
 */

@Module
public class EyeShockModule {

    public EyeShockModule() {
    }

    @EyeShockScope
    @Provides
    EyeService provideEyeService(Retrofit retrofit) {
        return retrofit.create(EyeService.class);
    }
}
