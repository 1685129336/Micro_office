package com.bawei.usercenter.fragment

import android.os.Bundle
import android.util.Log
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModelProvider
import com.bawei.usercenter.BR
import com.bawei.usercenter.R
import com.bawei.usercenter.UserCenterActivity
import com.bawei.usercenter.databinding.FragmentAuthCodeBinding
import com.bawei.usercenter.fragment.api.FragmentPassByValue
import com.bawei.usercenter.viewmodel.UserCenterViewModel
import core.ui.BaseFragment
import core.ui.BaseMVVMFragment

class AuthCodeFragment : BaseMVVMFragment<UserCenterViewModel,FragmentAuthCodeBinding>(),FragmentPassByValue {
    override fun createViewModel(): UserCenterViewModel {
        return ViewModelProvider(this,ViewModelProvider.NewInstanceFactory()).get(UserCenterViewModel::class.java)
    }

    override fun getVariable(): Int {
        return BR.viewModel
    }

    override fun initData() {

    }

    override fun initView() {
        binding.btBack.setOnClickListener {
            (activity as UserCenterActivity).goBack()
        }
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
    override fun onResume() {
        super.onResume()
    }
}