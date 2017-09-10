package com.glumes.views.imageslider.slidertype;

import android.content.Context;
import android.os.Bundle;

import com.glumes.views.imageslider.slidertype.ISliderView;

/**
 * Created by glumes on 2017/9/10.
 */

public abstract class BaseSliderView implements ISliderView {

    protected Context mContext;

    protected String mUrl;
    protected Bundle mBundle;

    public BaseSliderView(Context context) {
        this.mContext = context;
    }


    public BaseSliderView image(String url) {
        mUrl = url;
        return this;
    }


}
