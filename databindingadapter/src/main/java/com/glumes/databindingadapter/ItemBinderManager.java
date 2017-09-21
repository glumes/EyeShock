package com.glumes.databindingadapter;

/**
 * Created by zhaoying on 2017/9/21.
 */

import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

/**
 * keep multi class and holder
 */
public class ItemBinderManager {


    private final List<Class<?>> dataTypeList;
    private final List<Integer> viewHolderTypeList;
    private final List<Class<?>> mViewHolderList;


    public ItemBinderManager() {
        dataTypeList = new ArrayList<>();
        viewHolderTypeList = new ArrayList<>();
        mViewHolderList = new ArrayList<>();
    }


    public <T> void addItemAndHolder(Class<? extends T> item, int layoutId) {
        dataTypeList.add(item);
        viewHolderTypeList.add(layoutId);
        mViewHolderList.add(BindingViewHolder.class);
    }


    public int findItemLayout(Object object) {
        int index = dataTypeList.indexOf(object.getClass());
        return viewHolderTypeList.get(index);
    }

    public <T> void addItemAndLayoutAndHolder(Class<? extends T> item, int layoutId, Class<?> viewHolder) {
        dataTypeList.add(item);
        viewHolderTypeList.add(layoutId);
        mViewHolderList.add(viewHolder.getClass());
    }

    public Class findViewHolderByViewType(int viewType) {
        int index = viewHolderTypeList.indexOf(viewType);
        return mViewHolderList.get(index);
    }
}
