package com.bawei.usercenter.viewmodel

import android.util.Log
import com.bawei.usercenter.model.UserCenterModel
import com.example.observ.customObserver
import core.BaseViewModel
import java.util.regex.Pattern

class UserCenterViewModel : BaseViewModel<String,String,UserCenterModel>() {
    override fun createModel(): UserCenterModel {
        return UserCenterModel()
    }


    fun regexPhone(inputData:String,success:()->Unit,error:(msg:String)->Unit){
        val matches = Pattern.matches("(13|14|15|18|17|16)[0-9]{9}", inputData)

        if(matches){
            success()
            Log.i("===", "成功$inputData")
        }else{
            Log.i("===", "失败$inputData")
            error("手机号不正确")
        }
    }

    fun regexPassword(inputData:String,success:()->Unit,error:(msg:String)->Unit){
        val matches = Pattern.matches("([a-z]|[A-Z]|[0-9]){6,10}", inputData)
        if(matches){
            success()
        }else{
            error("密码必须为6-10以内")
        }
    }

    fun register(phoneNum:String,pwd:String){
        mModel.register(phoneNum, pwd).customObserver({

        },{

        })
    }
    fun login(){

    }


}