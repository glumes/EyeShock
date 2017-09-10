package com.glumes.views.imageslider;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;

import com.glumes.comlib.LogUtil;
import com.glumes.views.R;
import com.glumes.views.imageslider.imageloader.GlideImageLoader;
import com.glumes.views.imageslider.imageloader.IImageLoader;
import com.glumes.views.imageslider.slidertype.ISliderView;

/**
 * Created by glumes on 2017/9/10.
 */

public class ImageSlider extends RelativeLayout {

    private Context mContext;
    private SliderViewPager sliderViewPager;
    private SliderAdapter sliderAdapter;
    private IImageLoader imageLoader;
    private IImageLoader defaultImageLoader;

    public ImageSlider(Context context) {
        super(context);
        mContext = context;
        initView();
    }

    public ImageSlider(Context context, AttributeSet attrs) {
        super(context, attrs);
        mContext = context;
        initView();
    }

    public ImageSlider(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mContext = context;
        initView();
    }

    private void initView() {
        View rootView = LayoutInflater.from(mContext).inflate(R.layout.image_slider, this, true);
        sliderViewPager = (SliderViewPager) rootView.findViewById(R.id.slider_view_pager);
        sliderAdapter = new SliderAdapter(mContext);

        sliderViewPager.setAdapter(sliderAdapter);

        defaultImageLoader = new GlideImageLoader();

        sliderViewPager.setOffscreenPageLimit(4);
    }

    public <T extends ISliderView> void addSlider(T slider) {
        if (imageLoader != null) {
            slider.bindImageLoader(imageLoader);
        } else {
            slider.bindImageLoader(defaultImageLoader);
        }
        sliderAdapter.addSlider(slider);
    }

    public <T extends IImageLoader> void setImageLoader(T loader) {
        imageLoader = loader;
    }

}
