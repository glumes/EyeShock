package com.glumes.eyeshock.fragments.home;

import android.databinding.ObservableField;

import com.glumes.comlib.LogUtil;
import com.glumes.net.NetClient;
import com.glumes.net.bean.HomeBean;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by glumes on 2017/9/10.
 */

public class HomeViewModel {

    public final ObservableField<HomeBean> homeBean = new ObservableField<>();


    public void getHomeData() {
        NetClient.getInstance()
                .requetHomeContent()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<HomeBean>() {
                    @Override
                    public void accept(@NonNull HomeBean homeBean) throws Exception {
                        LogUtil.d("home Bean to String is " + homeBean.toString());
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(@NonNull Throwable throwable) throws Exception {
                        LogUtil.e(throwable.getMessage(), throwable);
                    }
                });
    }
}
