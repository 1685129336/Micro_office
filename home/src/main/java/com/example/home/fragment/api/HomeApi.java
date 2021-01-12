package com.example.home.fragment.api;

import com.example.home.entity.AddInfoBodyBean;
import com.example.home.entity.GetInfoBean;
import com.example.home.entity.RequestMsgEntity;
import com.example.home.entity.SearchNumberBean;
import com.example.net.BaseEntity;

import java.util.List;

import io.reactivex.Flowable;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface HomeApi {
    //添加消息
    @POST("/microoffice/chat/addChat")
    Flowable<RequestMsgEntity> addtHomeInfo(@Body AddInfoBodyBean addInfoBodyBean);
    //获取消息
    @GET("/microoffice/chat/getChats")
    Flowable<BaseEntity<List<GetInfoBean>>> getHomeInfo(@Query("from") String from,@Query("to") String to);
    //根据电话号码获取用户信息
    @GET("/microoffice/user/getUserByPhoneNumber")
    Flowable<BaseEntity<SearchNumberBean>> searchNumberInfo(@Query("phonenumber") String phonenumber);

}
