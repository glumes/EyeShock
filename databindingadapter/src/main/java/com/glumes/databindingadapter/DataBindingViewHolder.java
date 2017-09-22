package com.glumes.databindingadapter;

import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by zhaoying on 2017/9/22.
 */

public class DataBindingViewHolder<T> extends RecyclerView.ViewHolder {


    private ViewDataBinding mBinding;

    protected T data;


    public DataBindingViewHolder(ViewDataBinding binding) {
        super(binding.getRoot());
        this.mBinding = binding;
    }


}
