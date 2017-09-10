package com.glumes.eyeshock.inject;

import android.support.v4.app.Fragment;

import com.glumes.eyeshock.fragments.home.HomeFragment;

import java.util.ArrayList;
import java.util.List;

import dagger.Module;
import dagger.Provides;

/**
 * Created by glumes on 2017/9/9.
 */

@Module
public class MainFragmentListModule {

    public MainFragmentListModule() {
    }

    @Provides
    List<Fragment> provideMainFragmentList() {
        List<Fragment> fragmentList = new ArrayList<>();

        fragmentList.add(HomeFragment.newInstance("test 1", "test 1"));
        fragmentList.add(HomeFragment.newInstance("test 2", "test 2"));
        fragmentList.add(HomeFragment.newInstance("test 3", "test 3"));

        return fragmentList;
    }
}
