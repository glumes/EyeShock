package com.glumes.eyeshock;

import android.databinding.ObservableArrayList;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.glumes.databindingadapter.DataBindingAdapter;
import com.glumes.databindingadapter.Items;
import com.glumes.eyeshock.model.ImageModel;
import com.glumes.eyeshock.model.TestHeaderModel;
import com.glumes.eyeshock.model.TestModel;

import java.util.ArrayList;
import java.util.List;

public class TestActivity extends AppCompatActivity {


    RecyclerView mRecyclerView;

    List<Object> mItems;

    ObservableArrayList<Object> mObservableItems;

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

        bindingAdapter.addItem(TestModel.class, R.layout.test_item_layout);
        bindingAdapter.addItem(TestHeaderModel.class, R.layout.test_header_layout);
        bindingAdapter.addItem(ImageModel.class, R.layout.image_item_layout);

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

        mDataItems.addLast(new ImageModel(URL, "this is description"));

        bindingAdapter.setItems(mDataItems);

        mRecyclerView.setAdapter(bindingAdapter);


        findViewById(R.id.action).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ImageModel imageModel = (ImageModel) mDataItems.get(mDataItems.size() - 1);

                imageModel.setContent("this is new description");

            }
        });

    }
}
