package com.glumes.eyeshock.fragments.home;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.glumes.eyeshock.R;
import com.glumes.eyeshock.adapter.ListAdapter;
import com.glumes.eyeshock.databinding.FragmentHomeBinding;
import com.glumes.eyeshock.fragments.BaseInfoFragment;
import com.glumes.views.viewslider.slidertype.imagetype.ImageSliderType;

public class HomeFragment extends BaseInfoFragment {
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    private FragmentHomeBinding mBinding;

    private HomeViewModel mViewModel;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false);
        mViewModel = new HomeViewModel();
        return mBinding.getRoot();

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        mViewModel.getHomeData();

        ImageSliderType slider1 = new ImageSliderType(getContext());
        slider1.image("http://images.boomsbeat.com/data/images/full/19640/game-of-thrones-season-4-jpg.jpg");
        mBinding.imageSlider.addSlider(slider1);

        ImageSliderType slider2 = new ImageSliderType(getContext());
        slider2.image("http://cdn3.nflximg.net/images/3093/2043093.jpg");
        mBinding.imageSlider.addSlider(slider2);

        ImageSliderType slider3 = new ImageSliderType(getContext());
        slider3.image("http://tvfiles.alphacoders.com/100/hdclearart-10.png");
        mBinding.imageSlider.addSlider(slider3);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        mBinding.recyclerView.setHasFixedSize(true);
        mBinding.recyclerView.setLayoutManager(layoutManager);
        mBinding.recyclerView.setAdapter(new ListAdapter());
    }

    public HomeFragment() {
    }

    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

}
