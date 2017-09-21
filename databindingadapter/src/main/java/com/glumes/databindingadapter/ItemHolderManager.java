package com.glumes.databindingadapter;

/**
 * Created by zhaoying on 2017/9/21.
 */

import com.glumes.comlib.LogUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * keep multi class and holder
 */
public class ItemHolderManager {


    private final List<Class<?>> dataTypeList;
    private final List<Integer> viewHolderTypeList;

    public ItemHolderManager() {
        dataTypeList = new ArrayList<>();
        viewHolderTypeList = new ArrayList<>();
    }


    public <T> void addItemAndHolder(Class<? extends T> item, int layoutId) {
        dataTypeList.add(item);
        viewHolderTypeList.add(layoutId);
    }


    public int findItemLayout(Object object) {

        LogUtil.d("data type is " + dataTypeList.size());

        int index = dataTypeList.indexOf(object);

        return viewHolderTypeList.get(0);
    }
}
