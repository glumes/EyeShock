package com.glumes.views.imageslider.slidertype;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.glumes.views.R;
import com.glumes.views.imageslider.imageloader.IImageLoader;
import com.glumes.views.imageslider.slidertype.BaseSliderView;

/**
 * Created by glumes on 2017/9/10.
 */

public class ImageSliderType extends BaseSliderView {


    private IImageLoader imageLoader;

    public ImageSliderType(Context context) {
        super(context);
    }

    @Override
    public void bindImageLoader(IImageLoader loader) {
        imageLoader = loader;
    }

    @Override
    public View getSliderView() {
        View view = LayoutInflater.from(mContext).inflate(R.layout.slider_item, null);

        ImageView imageView = (ImageView) view.findViewById(R.id.slider_item_image);

        imageLoader.loadImageView(mContext, mUrl, imageView);

        return view;
    }

}
