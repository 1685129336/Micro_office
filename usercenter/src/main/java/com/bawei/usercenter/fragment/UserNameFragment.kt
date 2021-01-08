package com.bawei.usercenter.fragment

import android.os.Bundle
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModelProvider
import com.bawei.usercenter.BR
import com.bawei.usercenter.R
import com.bawei.usercenter.UserCenterActivity
import com.bawei.usercenter.databinding.FragmentUserNameBinding
import com.bawei.usercenter.fragment.api.FragmentPassByValue
import com.bawei.usercenter.viewmodel.UserCenterViewModel
import core.ui.BaseMVVMFragment

class UserNameFragment : BaseMVVMFragment<UserCenterViewModel,FragmentUserNameBinding>(),FragmentPassByValue {
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
        binding.btUserNameNext.setOnClickListener {
            val userCenterActivity = activity as UserCenterActivity
            userCenterActivity.startFragment(PasswordFragment::class.java,Bundle())
        }
    }

    override fun layoutID(): Int {
       return R.layout.fragment_user_name
    }

    override fun send(data: Bundle?) {

    }

}