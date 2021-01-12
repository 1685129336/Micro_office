package com.bawei.usercenter.model;

import com.bawei.usercenter.model.bean.UserCenterEntity;
import com.example.net.BaseEntity;

import io.reactivex.Flowable;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface UserCenterApi {
    @POST("/microoffice/user/register")
    Flowable<BaseEntity<Boolean>> register(@Query("phonenumber")String phoneNum,@Query("pwd")String pwd);

    @POST("/microoffice/user/login")
    Flowable<BaseEntity<UserCenterEntity>> login(@Query("phoneNumber")String phoneNum, @Query("pwd")String pwd);
}
