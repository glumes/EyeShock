package com.glumes.databindingadapter;

import android.databinding.DataBindingUtil;
import android.databinding.ObservableArrayList;
import android.databinding.ObservableList;
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

    private ObservableList<Object> mObservableData;

    private final ItemBinderManager mItemHolderManager;

    private OnListChangeCallback mOnListChangeCallback;

    public DataBindingAdapter() {
        mItemHolderManager = new ItemBinderManager();
        mObservableData = new ObservableArrayList<>();
        mOnListChangeCallback = new OnListChangeCallback(this);
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
        Object item = mObservableData.get(position);
        holder.bind(item);
        LogUtil.d("onBindViewHolder ");
    }

    @Override
    public void onBindViewHolder(BindingViewHolder holder, int position, List<Object> payloads) {
        if (payloads != null && payloads.size() > 0) {
            Object item = mObservableData.get(position);
            holder.bind(item);
            LogUtil.d("onBindViewHolder with payloads");
        } else {
            onBindViewHolder(holder, position);
            LogUtil.d("onBindViewHolder without payloads");
        }
    }

    @Override
    public int getItemCount() {
        return mObservableData.size();
    }

    @Override
    public int getItemViewType(int position) {
        Object object = mObservableData.get(position);
        return mItemHolderManager.findItemLayout(object);
    }

    public <T> void addItemAndHolder(Class<? extends T> item, int layoutId) {
        mItemHolderManager.addItemAndHolder(item, layoutId);
    }

    public <T> void addItemAndLayoutAndHolder(Class<? extends T> item, int layoutId, Class<?> viewHolder) {
        mItemHolderManager.addItemAndLayoutAndHolder(item, layoutId, viewHolder);
    }


    public void setItems(ObservableArrayList<Object> items) {
        mObservableData.clear();
        mObservableData = items;
        notifyDataSetChanged();
        mObservableData.addOnListChangedCallback(mOnListChangeCallback);
    }


}
