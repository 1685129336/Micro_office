package com.bawei.team.viewmodel

import com.bawei.team.model.TeamModel
import com.example.observ.customObserver
import core.BaseViewModel

class TeamCodeViewModel : BaseViewModel<String, String, TeamModel>() {
    override fun createModel(): TeamModel {
        return TeamModel()
    }

    fun jointeam(teamcode:String , userid:String){
        mModel.jointeam(teamcode,userid)
            .customObserver({
                _netSuccess.apply {
                    value="成功申请加入"
                }
            },{
                _netFailure.apply {
                    value="请求不成功"
                }
            }
            )
    }

}