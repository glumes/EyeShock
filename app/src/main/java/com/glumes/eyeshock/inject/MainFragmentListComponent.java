package com.glumes.eyeshock.inject;

import com.glumes.eyeshock.adapter.NoScrollPagerAdapter;

import dagger.Component;

/**
 * Created by glumes on 2017/9/9.
 */

@Component(
        modules = {
                MainFragmentListModule.class
        }
)
public interface MainFragmentListComponent {
    void inject(NoScrollPagerAdapter adapter);
}
