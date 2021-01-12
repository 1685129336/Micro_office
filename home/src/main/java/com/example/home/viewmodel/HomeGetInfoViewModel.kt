package com.example.home.viewmodel

import androidx.lifecycle.MutableLiveData
import com.example.home.entity.AddInfoBodyBean
import com.example.home.entity.GetInfoBean
import com.example.home.model.HomeModel
import com.example.observ.CustomObserver
import com.example.observ.customObserver
import core.BaseViewModel
import io.reactivex.Flowable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class HomeGetInfoViewModel:BaseViewModel<MutableList<GetInfoBean>,String, HomeModel>(){
    protected val uploadSuccess = MutableLiveData<String>()

    override fun createModel(): HomeModel {
        return HomeModel()
    }

    fun getinfodata(from:String , to:String){
        mModel.getHomeInfo(from,to).customObserver({
            _netSuccess.apply {
                value=it.data
            }
        },{
            _netFailure.apply {
                value="请求不成功"
            }
        }
        )
    }
}