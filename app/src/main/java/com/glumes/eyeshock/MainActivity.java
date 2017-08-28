package com.glumes.eyeshock;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.glumes.comlib.LogUtil;
import com.glumes.net.NetClient;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.button)
    Button button;
    @BindView(R.id.button2)
    Button button2;
    @BindView(R.id.button3)
    Button button3;
    @BindView(R.id.button4)
    Button button4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }


    @OnClick({R.id.button, R.id.button2, R.id.button3, R.id.button4})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.button:
                NetClient.getInstance().requetHomeContent()
                        .subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(homeBean -> LogUtil.d(homeBean.toString()), throwable -> LogUtil.e(throwable.getMessage(), throwable));

                break;
            case R.id.button2:
                NetClient.getInstance().requestDiscovery()
                        .subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(discoveryBean -> LogUtil.d(discoveryBean.toString()), throwable -> LogUtil.e(throwable.getMessage(), throwable));

                break;
            case R.id.button3:
                NetClient.getInstance().requestDiscoveryHot()
                        .subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(discoveryHotBean -> LogUtil.d(discoveryHotBean.toString()), throwable -> LogUtil.e(throwable.getMessage(), throwable));

                break;
            case R.id.button4:
                NetClient.getInstance().requestDiscoveryAuthor()
                        .subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(discoveryAuthorBean -> LogUtil.d(discoveryAuthorBean.toString()), throwable -> LogUtil.e(throwable.getMessage(), throwable));

                break;

        }
    }
}
