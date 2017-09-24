package com.glumes.databindingadapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by glumes on 2017/9/24.
 */

public abstract class ViewHolderBinder<D, T extends BindingViewHolder> {


    public abstract T createViewHolder(LayoutInflater inflater, ViewGroup parent);

    public abstract void onBindViewHolder(T holder, D data);

    protected void onBindViewHolder(T holder, D data, List<Object> payloads) {
        onBindViewHolder(holder, data);
    }

}
