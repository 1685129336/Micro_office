package com.example.home.viewmodel

import com.example.home.entity.SearchNumberBean
import com.example.home.model.HomeModel
import com.example.observ.customObserver
import core.BaseViewModel

class HomeSearchNumberViewModel : BaseViewModel<SearchNumberBean, String, HomeModel>() {
    override fun createModel(): HomeModel {
        return HomeModel()
    }

    fun searchinfodata(phonenumber: String) {
        mModel.searchNumberInfo(phonenumber).customObserver({
            _netSuccess.apply {
                value = it.data
            }
        }, {
            _netFailure.apply {
                value = "请求不成功"
            }
        }
        )

    }
}