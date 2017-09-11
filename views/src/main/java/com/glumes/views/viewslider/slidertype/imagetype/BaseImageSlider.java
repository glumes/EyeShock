package com.glumes.views.viewslider.slidertype.imagetype;

import android.content.Context;
import android.os.Bundle;

import com.glumes.views.viewslider.slidertype.ISliderView;

/**
 * Created by glumes on 2017/9/10.
 */

public abstract class BaseImageSlider implements ISliderView {

    protected Context mContext;

    protected String mUrl;
    protected Bundle mBundle;

    public BaseImageSlider(Context context) {
        this.mContext = context;
    }


    public BaseImageSlider image(String url) {
        mUrl = url;
        return this;
    }


}
