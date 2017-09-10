package com.glumes.eyeshock;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.glumes.eyeshock.adapter.NoScrollPagerAdapter;
import com.glumes.eyeshock.databinding.ActivityMainBinding;
import com.glumes.eyeshock.model.MainActivityModel;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding mBinding;

    private int mSelectedItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        MainActivityModel activityModel = new MainActivityModel();

        mBinding.noScrollViewPager.setPagingEnabled(false);

        mBinding.noScrollViewPager.setAdapter(new NoScrollPagerAdapter(getSupportFragmentManager()));

        mBinding.setMainActivityModel(activityModel);

        mBinding.bottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                updateContent(item);
                return true;
            }
        });
    }


    @Override
    protected void onResume() {
        super.onResume();
        mBinding.bottomNavigation.getMenu().getItem(2).setChecked(true);
        mBinding.noScrollViewPager.setOffscreenPageLimit(3);
    }

    private void updateContent(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_home:
                mBinding.noScrollViewPager.setCurrentItem(0);
                break;
            case R.id.menu_search:
                mBinding.noScrollViewPager.setCurrentItem(1);
                break;
            case R.id.menu_notifications:
                mBinding.noScrollViewPager.setCurrentItem(2);
                break;
            default:
                break;
        }
    }

}
