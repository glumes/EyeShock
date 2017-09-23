package com.glumes.databindingadapter;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.glumes.comlib.LogUtil;

import java.util.List;

/**
 * Created by glumes on 2017/9/18.
 */


public class DataBindingAdapter extends RecyclerView.Adapter<BindingViewHolder> {

    private Items mItems;

    private final ItemBinderManager mItemHolderManager;

    private OnListChangeCallback mOnListChangeCallback;

    public DataBindingAdapter() {
        mItemHolderManager = new ItemBinderManager();
        mItems = new Items();
        mItems.setAdapter(this);
        mOnListChangeCallback = new OnListChangeCallback(this);
    }

    @Override
    public BindingViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // viewType is layout Id,so make ViewDataBinding by layoutId
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
    public void onBindViewHolder(BindingViewHolder holder, int position, List<Object> payloads) {
        if (payloads != null && !payloads.isEmpty()) {
            Object item = mItems.get(position);
            holder.bind(item, payloads);
            LogUtil.d("onBindViewHolder with payloads");
        } else {
            onBindViewHolder(holder, position);
            LogUtil.d("onBindViewHolder without payloads");
        }
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }

    @Override
    public int getItemViewType(int position) {
        Object object = mItems.get(position);
        return mItemHolderManager.findItemLayout(object);
    }

    public <T> void addItem(Class<? extends T> item, int layoutId) {
        mItemHolderManager.addItemAndHolder(item, layoutId);
    }

    public <T> void addItem(Class<? extends T> item, int layoutId, PayloadViewHolder<T, ?> holder) {
        mItemHolderManager.addItem(item, layoutId, holder);
    }

    public void setItems(Items items) {
        mItems.clear();
        mItems = items;
        mItems.addOnListChangedCallback(mOnListChangeCallback);
        mItems.setAdapter(this);
        notifyDataSetChanged();
    }

}
