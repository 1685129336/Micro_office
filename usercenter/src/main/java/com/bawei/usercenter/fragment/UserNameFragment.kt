package com.bawei.usercenter.fragment

import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModelProvider
import com.bawei.usercenter.BR
import com.bawei.usercenter.R
import com.bawei.usercenter.viewmodel.UserCenterViewModel
import core.ui.BaseMVVMFragment

class UserNameFragment : BaseMVVMFragment<UserCenterViewModel,ViewDataBinding>() {
    override fun createViewModel(): UserCenterViewModel {
        return ViewModelProvider(this,ViewModelProvider.NewInstanceFactory()).get(UserCenterViewModel::class.java)
    }

    override fun getVariable(): Int {
        return BR.viewModel
    }

    override fun initData() {

    }

    override fun initView() {

    }

    override fun layoutID(): Int {
       return R.layout.fragment_user_name
    }

}