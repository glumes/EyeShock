package com.glumes.views.imageslider.imageloader;

import android.content.Context;
import android.widget.ImageView;

/**
 * Created by glumes on 2017/9/10.
 */

public interface IImageLoader {

    void loadImageView(Context context, Object path, ImageView imageView);
}
