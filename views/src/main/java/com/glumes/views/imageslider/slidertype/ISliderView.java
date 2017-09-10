package com.glumes.views.imageslider.slidertype;

import android.view.View;

import com.glumes.views.imageslider.imageloader.IImageLoader;

/**
 * Created by glumes on 2017/9/10.
 */

public interface ISliderView {

    void bindImageLoader(IImageLoader loader);

    View getSliderView();
}
