package com.glumes.views.viewslider;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;

import com.glumes.comlib.LogUtil;
import com.glumes.views.R;
import com.glumes.views.viewslider.imageloader.GlideImageLoader;
import com.glumes.views.viewslider.imageloader.IImageSliderLoader;
import com.glumes.views.viewslider.scroller.SpeedScroller;
import com.glumes.views.viewslider.slidertype.ISliderView;

import java.lang.reflect.Field;

/**
 * Created by glumes on 2017/9/10.
 */

public class ViewSlider extends RelativeLayout {

    private Context mContext;
    private SliderViewPager sliderViewPager;
    private SliderAdapter sliderAdapter;
    private IImageSliderLoader imageLoader;
    private IImageSliderLoader defaultImageLoader;
    private SpeedScroller mSpeedScroller;
    private int mShowTime = 3 * 1000;

    public ViewSlider(Context context) {
        super(context);
        mContext = context;
        initView();
    }

    public ViewSlider(Context context, AttributeSet attrs) {
        super(context, attrs);
        mContext = context;
        initView();
    }

    public ViewSlider(Context context, AttributeSet attrs, int defStyleAttr) {
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

        mSpeedScroller = new SpeedScroller(mContext);
    }

    public <T extends ISliderView> void addSlider(T slider) {
        if (imageLoader != null) {
            slider.bindImageLoader(imageLoader);
        } else {
            slider.bindImageLoader(defaultImageLoader);
        }
        sliderAdapter.addSlider(slider);
    }

    public <T extends IImageSliderLoader> void setImageLoader(T loader) {
        imageLoader = loader;
    }


    private void setViewPagerScroller() {
        try {
            Field scrollerField = ViewPager.class.getDeclaredField("mScroller");
            scrollerField.setAccessible(true);
            scrollerField.set(sliderViewPager, mSpeedScroller);
        } catch (Exception e) {
            LogUtil.e(e.getMessage(), e);
        }
    }

    public void start() {
        stop();
        postDelayed(player, mShowTime);
    }


    public void stop() {
        removeCallbacks(player);
    }

    private Runnable player = new Runnable() {
        @Override
        public void run() {
            play();
        }
    };

    private void play() {
        int count = sliderAdapter.getCount();
        int currentItem = sliderViewPager.getCurrentItem();
        currentItem++;

        if (currentItem == count) {
            currentItem = 0;
        }

        sliderViewPager.setCurrentItem(currentItem, true);

        start();
    }

    public void setShowTime(int showTime) {
        this.mShowTime = showTime;
        setViewPagerScroller();
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:
                stop();
                break;
            case MotionEvent.ACTION_UP:
                start();
                break;
            default:
                break;
        }
        return super.onInterceptTouchEvent(ev);
    }


}
