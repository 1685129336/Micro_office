package com.bawei.usercenter.fragment

import android.os.Bundle
import android.util.Log
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModelProvider
import com.bawei.usercenter.BR
import com.bawei.usercenter.R
import com.bawei.usercenter.UserCenterActivity
import com.bawei.usercenter.databinding.FragmentAuthCodeBinding
import com.bawei.usercenter.viewmodel.UserCenterViewModel
import core.api.FragmentPassByValue
import core.ui.BaseFragment
import core.ui.BaseMVVMFragment
import core.ui.callbackFragment

class AuthCodeFragment : BaseMVVMFragment<UserCenterViewModel,FragmentAuthCodeBinding>(), FragmentPassByValue {
    override fun createViewModel(): UserCenterViewModel {
        return ViewModelProvider(this,ViewModelProvider.NewInstanceFactory()).get(UserCenterViewModel::class.java)
    }

    override fun getVariable(): Int {
        return BR.viewModel
    }

    override fun initData() {

    }

    override fun initView() {
        binding.authCodeBaseLayout.setOnBackClickListener {
            callbackFragment(activity!!)
        }

        binding.authCode01.addEdit(binding.authCode02)
        binding.authCode02.addEdit(binding.authCode03)
        binding.authCode03.addEdit(binding.authCode04)
        binding.authCode04.addEdit(binding.authCode05)
        binding.authCode05.addEdit(binding.authCode06)

        binding.authCode01.setFinish {
            (activity as UserCenterActivity).startFragment(PasswordFragment::class.java,Bundle())
        }

        binding.authCode01.setRegex("123456")
    }

    override fun layoutID(): Int {
       return R.layout.fragment_auth_code
    }
    lateinit var data:Bundle
    override fun send(data: Bundle?) {
        if (data != null) {
            this.data = data
        }
        Log.i("====", "消息")
    }
}