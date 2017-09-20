package com.glumes.views.viewslider.slidertype;

import android.view.View;

import com.glumes.views.viewslider.imageloader.IImageSliderLoader;

/**
 * Created by glumes on 2017/9/10.
 */

public interface ISliderView {

    void bindImageLoader(IImageSliderLoader loader);

    View getSliderView();
}
