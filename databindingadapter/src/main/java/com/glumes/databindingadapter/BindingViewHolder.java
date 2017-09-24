package com.glumes.databindingadapter;

import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by zhaoying on 2017/9/22.
 */

public abstract class BindingViewHolder<T, D extends ViewDataBinding> extends RecyclerView.ViewHolder {

    protected D mBinding;

    public BindingViewHolder(D binding) {
        super(binding.getRoot());
        this.mBinding = binding;
    }

    protected abstract void onBind(T data);

    protected abstract void onBind(T data, Object payload);

    public D getBinding() {
        return mBinding;
    }
}
