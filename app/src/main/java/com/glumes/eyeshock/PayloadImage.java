package com.glumes.eyeshock;

import com.glumes.databindingadapter.PayloadViewHolder;
import com.glumes.eyeshock.databinding.ImageItemLayoutBinding;
import com.glumes.eyeshock.model.ImageModel;

/**
 * Created by glumes on 2017/9/23.
 */

public class PayloadImage extends PayloadViewHolder<ImageModel, ImageItemLayoutBinding> {

    public PayloadImage(ImageItemLayoutBinding binding) {
        super(binding);
    }

    @Override
    public void onBind(ImageModel data) {
        mBinding.textView.setText(data.getContent());
    }

    @Override
    public void onBind(ImageModel data, Object payload) {

    }
}
