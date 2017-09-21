package com.glumes.eyeshock;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.glumes.databindingadapter.DataBindingAdapter;
import com.glumes.eyeshock.model.TestModel;

import java.util.ArrayList;
import java.util.List;

public class TestActivity extends AppCompatActivity {


    RecyclerView mRecyclerView;

    List<Object> mItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setHasFixedSize(true);

        DataBindingAdapter bindingAdapter = new DataBindingAdapter();

        bindingAdapter.addItemAndHolder(TestModel.class, R.layout.test_item_layout);

        mItems = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            mItems.add(new TestModel("test  " + i));
        }

        bindingAdapter.setItems(mItems);

        mRecyclerView.setAdapter(bindingAdapter);


    }
}
