package com.glumes.eyeshock.viewholder;

import com.glumes.databindingadapter.BindingViewHolder;
import com.glumes.eyeshock.databinding.TestItemLayoutBinding;
import com.glumes.eyeshock.model.TestModel;

/**
 * Created by glumes on 2017/9/23.
 */

public class TestItemViewHolder extends BindingViewHolder<TestModel, TestItemLayoutBinding> {

    public TestItemViewHolder(TestItemLayoutBinding binding) {
        super(binding);
    }

    @Override
    protected void onBind(TestModel data) {
        mBinding.setViewModel(data);
    }

    @Override
    protected void onBind(TestModel data, Object payload) {

    }
}
