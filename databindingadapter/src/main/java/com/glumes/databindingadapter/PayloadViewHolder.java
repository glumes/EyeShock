package com.glumes.databindingadapter;

import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by zhaoying on 2017/9/22.
 */

public abstract class PayloadViewHolder<T, D extends ViewDataBinding> extends RecyclerView.ViewHolder {


    protected D mBinding;

//    protected T data;

    public PayloadViewHolder(D binding) {
        super(binding.getRoot());
        this.mBinding = binding;
    }

    public abstract void onBind(T data);

    public abstract void onBind(T data, Object payload);
}
