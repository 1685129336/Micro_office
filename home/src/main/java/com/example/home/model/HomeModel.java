package com.example.home.model;

import com.example.home.callback.ActivityToFragmentInfo;
import com.example.home.entity.AddInfoBodyBean;
import com.example.home.entity.GetInfoBean;
import com.example.home.entity.RequestMsgEntity;
import com.example.home.entity.SearchNumberBean;
import com.example.home.fragment.api.HomeApi;
import com.example.net.BaseEntity;
import com.example.net.RetrofitFactory;

import java.util.List;

import core.IModel;
import io.reactivex.Flowable;
import retrofit2.http.Query;

public class HomeModel implements IModel {
    public Flowable<RequestMsgEntity> addtHomeInfo(AddInfoBodyBean addInfoBodyBean){
        return RetrofitFactory.INSTANCE.create(HomeApi.class).addtHomeInfo(addInfoBodyBean);
    }

    public Flowable<BaseEntity<List<GetInfoBean>>> getHomeInfo(String from, String to){
        return RetrofitFactory.INSTANCE.create(HomeApi.class).getHomeInfo(from,to);
    }

    public Flowable<BaseEntity<SearchNumberBean>> searchNumberInfo(String phonenumber){
        return RetrofitFactory.INSTANCE.create(HomeApi.class).searchNumberInfo(phonenumber);
    }
}
