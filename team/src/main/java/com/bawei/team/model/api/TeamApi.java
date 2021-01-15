package com.bawei.team.model.api;

import com.bawei.team.model.entity.CreateTeamEntity;
import com.bawei.team.model.entity.RequestMsgEntity;
import com.example.net.BaseEntity;

import java.util.ArrayList;

import io.reactivex.Flowable;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Query;

public interface TeamApi {
    //加入团队
    @POST("/microoffice/team/addUserToTeam")
    Flowable<RequestMsgEntity> jointeam(@Query("teamcode") String teamcode,@Query("userid") String userid);
    //同意加入团队
    @PUT("/microoffice/team/agreeApply")
    Flowable<RequestMsgEntity> agreejoin(@Query("teamcode") String teamcode,@Query("userid") String userid);
    //创建团队
    @POST("/microoffice/team/createTeam")
    Flowable<RequestMsgEntity> createteam(@Body CreateTeamEntity createTeamEntity);
    //获取加入团队申请

    //根据id获取团队信息




}
