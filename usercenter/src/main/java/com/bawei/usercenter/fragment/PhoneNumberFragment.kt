package com.bawei.usercenter.fragment

import android.os.Bundle
import android.text.Editable
import android.util.Log
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModelProvider
import com.bawei.usercenter.BR
import com.bawei.usercenter.R
import com.bawei.usercenter.UserCenterActivity
import com.bawei.usercenter.databinding.FragmentPhoneNumberBinding
import com.bawei.usercenter.fragment.api.FragmentPassByValue
import com.bawei.usercenter.viewmodel.UserCenterViewModel
import com.example.common.event.api.IEvent
import core.ui.BaseFragment
import core.ui.BaseMVVMFragment
import kotlinx.android.synthetic.main.fragment_phone_number.*

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
        binding.btPhoneNumberNext.isEnabled = false
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

        binding.phoneTextChange = object : IEvent.OnTextChangedListener() {
            override fun afterTextChanged(s: Editable?) {
                super.afterTextChanged(s)
                val phone = binding.phoneEt.text.toString()
                viewModel.regexPhone(phone,{
                    binding.phoneInputLayout.isErrorEnabled = false
                    binding.btPhoneNumberNext.isEnabled = true
                },{
                    binding.phoneInputLayout.error = it
                    binding.btPhoneNumberNext.isEnabled = false
                })
            }
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