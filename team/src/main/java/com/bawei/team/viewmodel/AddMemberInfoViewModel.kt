package com.bawei.team.viewmodel

import com.bawei.team.model.TeamModel
import core.BaseViewModel

class AddMemberInfoViewModel: BaseViewModel<String, String, TeamModel>() {
    override fun createModel(): TeamModel {
        return TeamModel()
    }

}