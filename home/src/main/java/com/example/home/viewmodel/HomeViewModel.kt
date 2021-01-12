package com.example.home.viewmodel

import com.example.home.entity.AddInfoBodyBean
import com.example.home.model.HomeModel
import com.example.observ.customObserver
import com.example.observ.customXMppObserver
import core.BaseViewModel

class HomeViewModel : BaseViewModel<String, String, HomeModel>(){

    override fun createModel(): HomeModel {
        return HomeModel()
    }

    fun addinfo(addInfoBodyBean: AddInfoBodyBean){
        mModel.addtHomeInfo(addInfoBodyBean)
            .customObserver({
                _netSuccess.apply {
                    value="请求成功"
                }
            },{
                _netFailure.apply {
                    value="请求不成功"
                }
            }
            )
    }

}