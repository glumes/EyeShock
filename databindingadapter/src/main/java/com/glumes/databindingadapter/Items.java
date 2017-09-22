package com.glumes.databindingadapter;

import android.databinding.ObservableArrayList;

/**
 * Created by glumes on 2017/9/21.
 */

public class Items extends ObservableArrayList<Object> {

    public Items() {
        super();
    }

    public void addFirst(Object obj) {
        set(0, obj);
    }

    public void addLast(Object obj) {
        int length = size();
        add(length, obj);
    }

    public void setEmpty(Object obj) {
        clear();
        add(obj);
    }


    public void set(int index, Object object, Object payload) {
        set(index, object);

    }



}
