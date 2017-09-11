package com.glumes.views.viewslider.sliderloader.imageloader;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.glumes.comlib.LogUtil;

/**
 * Created by glumes on 2017/9/10.
 */

public class GlideImageLoader implements IImageSliderLoader {

    @Override
    public void loadImageView(Context context, Object path, ImageView imageView) {
        if (path != null) {
            LogUtil.d("paht is " + path.toString());
        }else {
            LogUtil.d("path is null");
        }
        Glide.with(context).load(path).into(imageView);
    }
}
