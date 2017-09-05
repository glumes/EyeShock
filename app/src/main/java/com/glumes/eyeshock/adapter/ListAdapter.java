package com.glumes.eyeshock.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.glumes.eyeshock.R;

/**
 * Created by glumes on 2017/8/30.
 */

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ItemViewHolder> {


    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View root = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);

        return new ItemViewHolder(root);
    }

    @Override
    public void onBindViewHolder(ItemViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class ItemViewHolder extends RecyclerView.ViewHolder {

        public ItemViewHolder(View itemView) {
            super(itemView);
        }
    }
}
