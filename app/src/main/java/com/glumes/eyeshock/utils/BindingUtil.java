package com.glumes.eyeshock.utils;

import android.databinding.BindingAdapter;
import android.support.design.widget.BottomNavigationView;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.glumes.comlib.LogUtil;

/**
 * Created by glumes on 2017/9/9.
 */

public class BindingUtil {

    @BindingAdapter("app:imageUrl")
    public static void loadImage(ImageView view, String url) {

        LogUtil.d("refresh load image");
        Glide.with(view.getContext())
                .load(url)
                .into(view);
    }
}
