package com.glumes.databindingadapter;

import android.databinding.DataBindingUtil;
import android.databinding.ObservableArrayMap;
import android.databinding.ObservableList;
import android.databinding.ObservableMap;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.glumes.comlib.LogUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by glumes on 2017/9/18.
 */


public class DataBindingAdapter extends RecyclerView.Adapter<BindingViewHolder> {


    private ObservableList mObservableData;

    private ObservableArrayMap<Object, Integer> mObservableMap;

    private final ItemHolderManager mItemHolderManager;

    private List<?> mItems;

    public DataBindingAdapter() {
        mItemHolderManager = new ItemHolderManager();
        mItems = new ArrayList<>();
    }

    @Override
    public BindingViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ViewDataBinding binding = DataBindingUtil.inflate(
                LayoutInflater.from(parent.getContext()),
                viewType,
                parent,
                false
        );
        return new BindingViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(BindingViewHolder holder, int position) {
        Object item = mItems.get(position);
        holder.bind(item);
    }

    @Override
    public int getItemCount() {
        LogUtil.d("size is " + mItems.size());
        return mItems.size();
    }

    @Override
    public int getItemViewType(int position) {
        Object object = mItems.get(position);
        return mItemHolderManager.findItemLayout(object);
    }

    public <T> void addItemAndHolder(Class<? extends T> item, int layoutId) {
        mItemHolderManager.addItemAndHolder(item, layoutId);
    }

    public void setItems(List<?> items) {
        this.mItems = items;
        notifyDataSetChanged();
    }


}
