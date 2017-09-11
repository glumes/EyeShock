package com.glumes.views.viewslider;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import com.glumes.views.viewslider.slidertype.ISliderView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by glumes on 2017/9/10.
 */

public class SliderAdapter extends PagerAdapter {

    private Context mContext;
    private List<ISliderView> sliderViews;

    public SliderAdapter(Context mContext) {
        this.mContext = mContext;
        sliderViews = new ArrayList<>();
    }

    @Override
    public int getCount() {
        return sliderViews.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        View view = sliderViews.get(position).getSliderView();

        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    public <T extends ISliderView> void addSlider(T slider) {
        sliderViews.add(slider);
        notifyDataSetChanged();
    }

}

