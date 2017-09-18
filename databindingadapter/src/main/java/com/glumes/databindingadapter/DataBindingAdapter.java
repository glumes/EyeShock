package com.glumes.databindingadapter;

import android.databinding.ObservableList;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

/**
 * Created by glumes on 2017/9/18.
 */

public class DataBindingAdapter<T> extends RecyclerView.Adapter {

    private ObservableList<T> mObservableData;

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return mObservableData.size();
    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
    }


}
