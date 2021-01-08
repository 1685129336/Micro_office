package com.bawei.usercenter.viewmodel

import com.bawei.usercenter.model.UserCenterModel
import core.BaseViewModel

class UserCenterViewModel : BaseViewModel<String,String,UserCenterModel>() {
    override fun createModel(): UserCenterModel {
        return UserCenterModel()
    }
}