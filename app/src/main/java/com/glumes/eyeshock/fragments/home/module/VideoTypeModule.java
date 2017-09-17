package com.glumes.eyeshock.fragments.home.module;

import android.databinding.ObservableField;

import com.glumes.net.bean.VideoBeanForClient;

/**
 * Created by glumes on 2017/9/17.
 */

public class VideoTypeModule {

    public ObservableField<VideoBeanForClient> viewModule;

    public VideoTypeModule(VideoBeanForClient moduel) {
        viewModule = new ObservableField<>();
        viewModule.set(moduel);
    }

    public VideoTypeModule() {
        viewModule = new ObservableField<>();
    }

    public void setViewModule(VideoBeanForClient module) {
        viewModule.set(module);
    }
}
