package com.bawei.usercenter.fragment

import android.os.Bundle
import android.util.Log
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModelProvider
import com.bawei.usercenter.BR
import com.bawei.usercenter.R
import com.bawei.usercenter.UserCenterActivity
import com.bawei.usercenter.databinding.FragmentLoginBinding
import com.bawei.usercenter.databinding.FragmentLoginBindingImpl
import com.bawei.usercenter.fragment.api.FragmentPassByValue
import com.bawei.usercenter.viewmodel.UserCenterViewModel
import core.ui.BaseFragment
import core.ui.BaseMVVMFragment
import kotlinx.android.synthetic.main.fragment_login.*

class LoginFragment : BaseMVVMFragment<UserCenterViewModel,FragmentLoginBinding>(),FragmentPassByValue {
    override fun createViewModel(): UserCenterViewModel {
        return ViewModelProvider(this,ViewModelProvider.NewInstanceFactory()).get(UserCenterViewModel::class.java)
    }

    override fun getVariable(): Int {
        return BR.viewModel
    }

    override fun initData() {

    }

    override fun initView() {
        binding.btLogin.setOnClickListener {
            toast("登录",it)
        }
        binding.tvRegister.setOnClickListener {
            val userCenterActivity = activity as UserCenterActivity
            userCenterActivity.startFragment(PhoneNumberFragment::class.java,Bundle())

//            userCenterActivity.changeFrag(3)
        }
        binding.tvAuthCodeLogin.setOnClickListener {
            val bundle = Bundle()
            bundle.putBoolean("authCode",true)
            ( activity as UserCenterActivity).startFragment(PhoneNumberFragment::class.java,bundle)
        }
    }


    override fun layoutID(): Int {
       return R.layout.fragment_login
    }

    override fun send(data: Bundle?) {

    }

}