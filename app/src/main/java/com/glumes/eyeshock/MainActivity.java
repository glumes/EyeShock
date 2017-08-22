package com.glumes.eyeshock;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.glumes.comlib.LogUtil;
import com.glumes.net.NetClient;
import com.glumes.net.bean.HomeBean;
import com.glumes.net.constant.UrlConstant;

import java.util.concurrent.Callable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NetClient netClient = new NetClient();

//        netClient.request().subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(new Observer<HomeBean>() {
//                    @Override
//                    public void onSubscribe(@NonNull Disposable d) {
//                        LogUtil.d("onSubscribe");
//                    }
//
//                    @Override
//                    public void onNext(@NonNull HomeBean homeBean) {
//                        LogUtil.d("onNext");
//                    }
//
//                    @Override
//                    public void onError(@NonNull Throwable e) {
//                        LogUtil.e(e.getMessage(), e);
//                    }
//
//                    @Override
//                    public void onComplete() {
//                        LogUtil.d("onComplete");
//                    }
//                });
    }


}
