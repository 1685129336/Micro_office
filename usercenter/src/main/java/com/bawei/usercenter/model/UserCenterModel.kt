package com.bawei.usercenter.model

import com.bawei.usercenter.model.bean.UserCenterEntity
import com.example.net.BaseEntity
import com.example.net.RetrofitFactory
import core.IModel
import io.reactivex.Flowable

class UserCenterModel : IModel {
    fun register(phoneNum:String,pwd:String): Flowable<BaseEntity<Boolean>> {
        return RetrofitFactory.create(UserCenterApi::class.java).register(phoneNum, pwd)
    }

    fun login(phoneNum:String,pwd:String): Flowable<BaseEntity<UserCenterEntity>> {
        return RetrofitFactory.create(UserCenterApi::class.java).login(phoneNum, pwd)
    }

}