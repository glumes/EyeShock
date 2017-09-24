package com.glumes.eyeshock;

import android.databinding.DataBindingUtil;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.glumes.databindingadapter.ViewHolderBinder;
import com.glumes.eyeshock.databinding.ImageItemLayoutBinding;
import com.glumes.eyeshock.model.ImageModel;

import java.util.List;

/**
 * Created by glumes on 2017/9/24.
 */

public class ImageViewHolderBinder extends ViewHolderBinder<ImageModel, BindingImage> {

    @Override
    public BindingImage createViewHolder(LayoutInflater inflater, ViewGroup parent) {
        ImageItemLayoutBinding mBinding = DataBindingUtil.inflate(inflater, R.layout.image_item_layout, parent, false);
        return new BindingImage(mBinding);
    }

    @Override
    public void onBindViewHolder(BindingImage holder, ImageModel data) {
        holder.onBind(data);
    }

    @Override
    public void onBindViewHolder(BindingImage holder, ImageModel data, List<Object> payloads) {
        if (payloads != null && !payloads.isEmpty()) {
            holder.onBind(data, payloads.get(0));
        } else {
            holder.onBind(data);
        }
    }

}
