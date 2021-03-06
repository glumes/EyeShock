package com.glumes.eyeshock.fragments.home;

import android.databinding.ObservableField;

import com.glumes.comlib.LogUtil;
import com.glumes.net.NetClient;
import com.glumes.net.bean.HomeModule;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by glumes on 2017/9/10.
 */

public class HomeViewModel {

    public ObservableField<HomeModule> homeModule;


    public HomeViewModel() {
        homeModule = new ObservableField<>();
    }

    public void getHomeData() {
        NetClient.getInstance()
                .requetHomeContent()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<HomeModule>() {
                    @Override
                    public void accept(@NonNull HomeModule module) throws Exception {
                        homeModule.set(module);
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(@NonNull Throwable throwable) throws Exception {
                        LogUtil.e(throwable.getMessage(), throwable);
                    }
                });
    }
}
