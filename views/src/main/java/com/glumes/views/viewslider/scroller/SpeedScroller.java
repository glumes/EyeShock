package com.glumes.views.viewslider.scroller;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.Scroller;

/**
 * Created by zhaoying on 2017/9/21.
 */

public class SpeedScroller extends Scroller {

    private int mDurationTime = 1000;

    public SpeedScroller(Context context) {
        super(context);
    }

    public SpeedScroller(Context context, Interpolator interpolator) {
        super(context, interpolator);
    }

    @Override
    public void startScroll(int startX, int startY, int dx, int dy) {
        super.startScroll(startX, startY, dx, dy, mDurationTime);
    }

    @Override
    public void startScroll(int startX, int startY, int dx, int dy, int duration) {
        super.startScroll(startX, startY, dx, dy, mDurationTime);
    }


    public void setDurationTime(int durationTime) {
        mDurationTime = durationTime;
    }

}
