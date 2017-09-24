package com.glumes.eyeshock;

import com.glumes.databindingadapter.BindingViewHolder;
import com.glumes.eyeshock.databinding.TestItemLayoutBinding;
import com.glumes.eyeshock.model.TestModel;

/**
 * Created by glumes on 2017/9/24.
 */

public class TextViewHolder extends BindingViewHolder<TestModel, TestItemLayoutBinding> {


    public TextViewHolder(TestItemLayoutBinding binding) {
        super(binding);
    }

    @Override
    protected void onBind(TestModel data) {
        mBinding.setViewModel(data);
    }

    @Override
    protected void onBind(TestModel data, Object payload) {
        mBinding.setViewModel(data);
    }
}
