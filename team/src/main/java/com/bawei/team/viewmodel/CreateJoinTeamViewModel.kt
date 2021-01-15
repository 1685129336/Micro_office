package com.bawei.team.viewmodel

import com.bawei.team.model.TeamModel
import core.BaseViewModel

class CreateJoinTeamViewModel : BaseViewModel<String, String, TeamModel>(){
    override fun createModel(): TeamModel {
        return TeamModel()
    }
}