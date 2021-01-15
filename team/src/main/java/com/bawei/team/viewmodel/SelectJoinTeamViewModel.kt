package com.bawei.team.viewmodel

import com.bawei.team.model.TeamModel
import core.BaseViewModel

class SelectJoinTeamViewModel : BaseViewModel<String, String, TeamModel>() {
    override fun createModel(): TeamModel {
        return TeamModel()
    }

}