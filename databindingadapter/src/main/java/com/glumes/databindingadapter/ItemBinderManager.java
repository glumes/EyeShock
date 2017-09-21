package com.glumes.databindingadapter;

/**
 * Created by zhaoying on 2017/9/21.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * keep multi class and holder
 */
public class ItemBinderManager {


    private final List<Class<?>> dataTypeList;
    private final List<Integer> viewHolderTypeList;

    public ItemBinderManager() {
        dataTypeList = new ArrayList<>();
        viewHolderTypeList = new ArrayList<>();
    }


    public <T> void addItemAndHolder(Class<? extends T> item, int layoutId) {
        dataTypeList.add(item);
        viewHolderTypeList.add(layoutId);
    }


    public int findItemLayout(Object object) {

        int index = dataTypeList.indexOf(object.getClass());

        return viewHolderTypeList.get(index);
    }
}
