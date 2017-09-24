package com.glumes.eyeshock;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.glumes.databindingadapter.DataBindingAdapter;
import com.glumes.databindingadapter.Items;
import com.glumes.eyeshock.model.ImageModel;
import com.glumes.eyeshock.model.TestModel;

public class TestActivity extends AppCompatActivity {


    RecyclerView mRecyclerView;

    Items mDataItems;

    public static final String URL = "http://img.lanrentuku.com/img/allimg/1706/14972551527463.jpg";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setHasFixedSize(true);

        DataBindingAdapter bindingAdapter = new DataBindingAdapter();

        mDataItems = new Items();

        mDataItems.add(new ImageModel(URL, "this is content"));
        mDataItems.add(new TestModel("this is test content"));

        for (int i = 0; i < 10; i++) {
            mDataItems.add(new TestModel("this is test content " + i));
        }

        bindingAdapter
                .map(ImageModel.class, new ImageViewHolderBinder())
                .map(TestModel.class, new TextViewHolderBinder())
                .setItems(mDataItems);

        mRecyclerView.setAdapter(bindingAdapter);

        findViewById(R.id.action).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                mDataItems.add(new ImageModel("https://cdn.pixabay.com/photo/2017/08/19/10/00/eagle-2657888_960_720.jpg", "this is content"));

                mDataItems.notifyItemChanged(0, "this is new content " + System.currentTimeMillis());

            }
        });

    }
}
