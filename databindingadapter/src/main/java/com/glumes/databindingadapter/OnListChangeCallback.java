package com.glumes.databindingadapter;

import android.databinding.ObservableList;
import android.support.v7.widget.RecyclerView;

/**
 * Created by glumes on 2017/9/21.
 */

public class OnListChangeCallback extends ObservableList.OnListChangedCallback {


    RecyclerView.Adapter mBindingAdapter;

    public OnListChangeCallback(RecyclerView.Adapter bindingAdapter) {
        mBindingAdapter = bindingAdapter;
    }

    @Override
    public void onChanged(ObservableList sender) {
        mBindingAdapter.notifyDataSetChanged();
    }

    @Override
    public void onItemRangeChanged(ObservableList sender, int positionStart, int itemCount) {
        mBindingAdapter.notifyItemRangeChanged(positionStart, itemCount);
    }

    @Override
    public void onItemRangeInserted(ObservableList sender, int positionStart, int itemCount) {
        mBindingAdapter.notifyItemRangeInserted(positionStart, itemCount);
    }

    @Override
    public void onItemRangeMoved(ObservableList sender, int fromPosition, int toPosition, int itemCount) {
        mBindingAdapter.notifyItemMoved(fromPosition, toPosition);
    }

    @Override
    public void onItemRangeRemoved(ObservableList sender, int positionStart, int itemCount) {
        mBindingAdapter.notifyItemRangeRemoved(positionStart, itemCount);
    }
}
