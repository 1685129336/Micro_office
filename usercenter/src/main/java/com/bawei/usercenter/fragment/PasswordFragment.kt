package com.bawei.usercenter.fragment

import android.os.Bundle
import android.util.Log
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModelProvider
import com.bawei.usercenter.BR
import com.bawei.usercenter.R
import com.bawei.usercenter.UserCenterActivity
import com.bawei.usercenter.databinding.FragmentPasswordBinding
import com.bawei.usercenter.fragment.api.FragmentPassByValue
import com.bawei.usercenter.viewmodel.UserCenterViewModel
import core.ui.BaseFragment
import core.ui.BaseMVVMFragment

class PasswordFragment : BaseMVVMFragment<UserCenterViewModel,FragmentPasswordBinding>(),FragmentPassByValue {
    override fun createViewModel(): UserCenterViewModel {
        return ViewModelProvider(this,ViewModelProvider.NewInstanceFactory()).get(UserCenterViewModel::class.java)
    }

    override fun getVariable(): Int {
        return BR.viewModel
    }

    override fun initData() {
        binding.btBack.setOnClickListener {
            (activity as UserCenterActivity).goBack()
        }
    }

    override fun initView() {

    }

    override fun layoutID(): Int {
       return R.layout.fragment_password
    }

    override fun send(data: Bundle?) {

    }


}