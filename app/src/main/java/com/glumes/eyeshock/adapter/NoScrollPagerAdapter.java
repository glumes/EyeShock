package com.glumes.eyeshock.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


import com.glumes.eyeshock.inject.DaggerMainFragmentListComponent;
import com.glumes.eyeshock.inject.MainFragmentListModule;

import java.util.List;

import javax.inject.Inject;

/**
 * Created by glumes on 2017/9/9.
 */

public class  NoScrollPagerAdapter extends FragmentPagerAdapter {

    @Inject
    List<Fragment> mainFragmentList;

    public NoScrollPagerAdapter(FragmentManager fm) {
        super(fm);
        DaggerMainFragmentListComponent
                .builder()
                .mainFragmentListModule(new MainFragmentListModule())
                .build()
                .inject(this);
    }

    @Override
    public Fragment getItem(int position) {
        return mainFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return mainFragmentList.size();
    }
}
