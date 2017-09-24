package com.glumes.databindingadapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;


import java.util.List;

/**
 * Created by glumes on 2017/9/18.
 */


public class DataBindingAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

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
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int index) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        ViewHolderBinder<?, ?> viewHolderWrapper = mItemHolderManager.getViewHolderWrapper(index);

        return viewHolderWrapper.createViewHolder(inflater, parent);
    }

    @Override
    @SuppressWarnings("unchecked")
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Object object = mItems.get(position);

        ViewHolderBinder viewHolder = mItemHolderManager.getViewHolderWrapper(holder.getItemViewType());

        viewHolder.onBindViewHolder((BindingViewHolder) holder, object);
    }

    @Override
    @SuppressWarnings("unchecked")
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position, List<Object> payloads) {
        if (payloads != null && !payloads.isEmpty()) {
            Object object = mItems.get(position);

            ViewHolderBinder viewHolder = mItemHolderManager.getViewHolderWrapper(holder.getItemViewType());

            viewHolder.onBindViewHolder((BindingViewHolder) holder, object, payloads);
        } else {
            onBindViewHolder(holder, position);
        }
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }


    // type 返回 item 对应的 viewholder 在 ItemBinderManager 中的 位置。
    // 然后根据这个位置，在 onCreateViewHolder 中找到 对应的 ViewHolder 直接返回即可。


    // 在 onBindViewHolder 方法中，根据 position，找到对应位置的 item 数据类型
    // 然后根据数据类型，依旧是找到对应的 ViewHolder ，然后再根据调用 ViewHolder 的 bind 方法绑定数据即可。
    @Override
    public int getItemViewType(int position) {
        Object object = mItems.get(position);
        return mItemHolderManager.findItemIndex(object);
    }


    public <T> DataBindingAdapter map(Class<? extends T> item, ViewHolderBinder<T, ?> holder) {
        mItemHolderManager.addItem(item, holder);
        return this;
    }

    public void setItems(Items items) {
        mItems.clear();
        mItems = items;
        mItems.addOnListChangedCallback(mOnListChangeCallback);
        mItems.setAdapter(this);
        notifyDataSetChanged();
    }

}
