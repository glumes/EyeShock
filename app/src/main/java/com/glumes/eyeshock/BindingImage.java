package com.glumes.eyeshock;

import android.view.View;

import com.glumes.comlib.LogUtil;
import com.glumes.databindingadapter.BindingViewHolder;
import com.glumes.eyeshock.databinding.ImageItemLayoutBinding;
import com.glumes.eyeshock.model.ImageModel;
import com.glumes.eyeshock.utils.BindingUtil;

/**
 * Created by glumes on 2017/9/23.
 */

public class BindingImage extends BindingViewHolder<ImageModel, ImageItemLayoutBinding> {


    public BindingImage(ImageItemLayoutBinding binding) {
        super(binding);
    }

    @Override
    public void onBind(ImageModel data) {
        mBinding.setViewModel(data);

        mBinding.textView.setClickable(true);
        mBinding.textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LogUtil.d("BindingImage onClick");
            }
        });
    }

    @Override
    public void onBind(ImageModel data, Object payload) {
        String content = (String) payload;
        mBinding.textView.setText(content);
        BindingUtil.loadImage(mBinding.imageView2, "http://gaopin-preview.bj.bcebos.com/133106909130.jpg");
    }
}
