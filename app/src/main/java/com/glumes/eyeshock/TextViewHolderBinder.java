package com.glumes.eyeshock;

import android.databinding.DataBindingUtil;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.glumes.databindingadapter.ViewHolderBinder;
import com.glumes.eyeshock.databinding.TestItemLayoutBinding;
import com.glumes.eyeshock.model.TestModel;

import java.util.List;

/**
 * Created by glumes on 2017/9/24.
 */

public class TextViewHolderBinder extends ViewHolderBinder<TestModel, TextViewHolder> {


    @Override
    public TextViewHolder createViewHolder(LayoutInflater inflater, ViewGroup parent) {
        TestItemLayoutBinding mBinding = DataBindingUtil.inflate(inflater, R.layout.test_item_layout, parent, false);

        return new TextViewHolder(mBinding);
    }

    @Override
    public void onBindViewHolder(TextViewHolder holder, TestModel data) {
        holder.onBind(data);
    }


}
