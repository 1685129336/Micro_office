package com.example.home.viewmodel

import com.example.home.model.HomeModel
import core.BaseViewModel

class HomeViewModel : BaseViewModel<String, String, HomeModel>(){

    override fun createModel(): HomeModel {
        return HomeModel()
    }


}