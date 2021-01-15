package com.bawei.team.model;

import com.bawei.team.model.api.TeamApi;
import com.bawei.team.model.entity.CreateTeamEntity;
import com.bawei.team.model.entity.RequestMsgEntity;
import com.example.net.RetrofitFactory;

import core.IModel;
import io.reactivex.Flowable;
import retrofit2.http.Body;
import retrofit2.http.Query;

public class TeamModel implements IModel {
    //加入团队
    public Flowable<RequestMsgEntity> jointeam(String teamcode,String userid){
        return RetrofitFactory.INSTANCE.create(TeamApi.class).jointeam(teamcode,userid);
    }
    //同意加入团队
    public Flowable<RequestMsgEntity> agreejoin(String teamcode,String userid){
        return RetrofitFactory.INSTANCE.create(TeamApi.class).agreejoin(teamcode,userid);
    }
    //创建团队
    public Flowable<RequestMsgEntity> createteam(CreateTeamEntity createTeamEntity){
        return RetrofitFactory.INSTANCE.create(TeamApi.class).createteam(createTeamEntity);
    }
}
