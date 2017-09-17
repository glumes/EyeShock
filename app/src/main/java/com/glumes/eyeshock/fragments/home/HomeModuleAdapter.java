package com.glumes.eyeshock.fragments.home;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.glumes.eyeshock.R;
import com.glumes.eyeshock.databinding.VideoItemLayoutBinding;
import com.glumes.eyeshock.fragments.home.module.VideoTypeModule;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by glumes on 2017/9/17.
 */

public class HomeModuleAdapter extends RecyclerView.Adapter<HomeModuleAdapter.ViewHolder> {

    private List<VideoTypeModule> moduleList;


    public HomeModuleAdapter() {
        moduleList = new ArrayList<>();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        VideoItemLayoutBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),
                R.layout.video_item_layout, parent, false);

        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        VideoTypeModule module = moduleList.get(position);
        holder.bind(module);
    }

    @Override
    public int getItemCount() {
        return moduleList.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        private VideoItemLayoutBinding mBinding;

        public ViewHolder(VideoItemLayoutBinding binding) {
            super(binding.getRoot());
            this.mBinding = binding;
        }


        public void bind(VideoTypeModule module) {
            mBinding.setVideoTypeModel(module);
            mBinding.executePendingBindings();
        }
    }


}
