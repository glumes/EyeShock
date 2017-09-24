package com.glumes.eyeshock.viewholder;

import com.glumes.databindingadapter.BindingViewHolder;
import com.glumes.eyeshock.databinding.TestHeaderLayoutBinding;
import com.glumes.eyeshock.model.TestHeaderModel;

/**
 * Created by glumes on 2017/9/23.
 */

public class TestHeaderViewHolder extends BindingViewHolder<TestHeaderModel, TestHeaderLayoutBinding> {


    public TestHeaderViewHolder(TestHeaderLayoutBinding binding) {
        super(binding);
    }

    @Override
    protected void onBind(TestHeaderModel data) {
        mBinding.setViewModel(data);
    }

    @Override
    protected void onBind(TestHeaderModel data, Object payload) {

    }
}
