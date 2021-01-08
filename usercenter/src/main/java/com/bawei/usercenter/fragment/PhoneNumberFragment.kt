package com.bawei.usercenter.fragment

import android.os.Bundle
import android.util.Log
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModelProvider
import com.bawei.usercenter.BR
import com.bawei.usercenter.R
import com.bawei.usercenter.UserCenterActivity
import com.bawei.usercenter.databinding.FragmentPhoneNumberBinding
import com.bawei.usercenter.fragment.api.FragmentPassByValue
import com.bawei.usercenter.viewmodel.UserCenterViewModel
import core.ui.BaseFragment
import core.ui.BaseMVVMFragment

class PhoneNumberFragment : BaseMVVMFragment<UserCenterViewModel, FragmentPhoneNumberBinding>(),
    FragmentPassByValue {
    lateinit var data: Bundle
    override fun createViewModel(): UserCenterViewModel {
        return ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(
            UserCenterViewModel::class.java
        )
    }

    override fun getVariable(): Int {
        return BR.viewModel
    }

    override fun initData() {

    }

    override fun initView() {
        binding.btPhoneNumberNext.setOnClickListener {
                val boolean = data.getBoolean("authCode")
                //跳转fragment
                val a = activity as UserCenterActivity
                if (boolean) {
                    a.startFragment(AuthCodeFragment::class.java, Bundle())
                } else {
                    a.startFragment(UserNameFragment::class.java, Bundle())
                }
        }
        binding.btBack.setOnClickListener {
            (activity as UserCenterActivity).goBack()
        }


    }

    override fun layoutID(): Int {
        return R.layout.fragment_phone_number
    }

    override fun send(data: Bundle?) {
        if (data != null) {
            this.data = data
        }
        Log.i("====", "消息")
    }

}