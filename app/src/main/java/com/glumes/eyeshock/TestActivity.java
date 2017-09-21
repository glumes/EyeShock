package com.glumes.eyeshock;

import android.databinding.ObservableArrayList;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.glumes.comlib.LogUtil;
import com.glumes.databindingadapter.DataBindingAdapter;
import com.glumes.databindingadapter.Items;
import com.glumes.eyeshock.adapter.ListAdapter;
import com.glumes.eyeshock.model.TestHeaderModel;
import com.glumes.eyeshock.model.TestModel;

import java.util.ArrayList;
import java.util.List;

public class TestActivity extends AppCompatActivity {


    RecyclerView mRecyclerView;

    List<Object> mItems;

    ObservableArrayList<Object> mObservableItems;

    Items mDataItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setHasFixedSize(true);

        DataBindingAdapter bindingAdapter = new DataBindingAdapter();

        bindingAdapter.addItemAndHolder(TestModel.class, R.layout.test_item_layout);
        bindingAdapter.addItemAndHolder(TestHeaderModel.class, R.layout.test_header_layout);

        mItems = new ArrayList<>();

        mDataItems = new Items();

        mObservableItems = new ObservableArrayList<>();

        mItems.add(new TestHeaderModel("this is header"));
        mObservableItems.add(new TestHeaderModel("this is header"));
        mDataItems.add(new TestHeaderModel("this is header"));


        for (int i = 0; i < 6; i++) {
            mItems.add(new TestModel("test  " + i));

            mDataItems.add(new TestModel("test  " + i));

            mObservableItems.add(new TestModel("test  " + i));
        }

//        bindingAdapter.setItems(mItems);

//        bindingAdapter.setItems(mObservableItems);

        bindingAdapter.setItems(mDataItems);

        mRecyclerView.setAdapter(bindingAdapter);

//        mRecyclerView.setAdapter(new ListAdapter());

        findViewById(R.id.action).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mItems.add(new TestHeaderModel("this is footer"));

                mObservableItems.add(new TestHeaderModel("this is footer"));
                LogUtil.d("add footer item");
                mObservableItems.set(0, new TestHeaderModel("change new header"));

                mDataItems.addFirst(new TestHeaderModel("change new header"));

                mDataItems.addLast(new TestHeaderModel("change new header"));


                mDataItems.setEmpty(new TestHeaderModel("change new header"));
            }
        });

    }
}
