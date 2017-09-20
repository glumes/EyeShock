package com.glumes.views.viewslider.imageloader;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * Created by glumes on 2017/9/10.
 */

public class GlideImageLoader implements IImageSliderLoader {

    @Override
    public void loadImageView(Context context, Object path, ImageView imageView) {
        Glide.with(context).load(path).fitCenter().into(imageView);
    }
}
