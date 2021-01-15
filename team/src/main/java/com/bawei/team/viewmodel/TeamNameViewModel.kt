package com.bawei.team.viewmodel

import com.bawei.team.model.TeamModel
import com.bawei.team.model.entity.CreateTeamEntity
import com.example.observ.customObserver
import core.BaseViewModel

class TeamNameViewModel : BaseViewModel<String, String, TeamModel>() {
    override fun createModel(): TeamModel {
        return TeamModel()
    }

    fun createteam(createTeamEntity: CreateTeamEntity){
        mModel.createteam(createTeamEntity).customObserver({
            _netSuccess.apply {
                value="创建成功"
            }
        },{
            _netFailure.apply {
                value="创建失败"
            }
        })
    }


}