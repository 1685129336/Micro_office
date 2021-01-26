package com.bawei.usercenter.fragment

import android.os.Bundle
import android.text.Editable
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.bawei.usercenter.BR
import com.bawei.usercenter.R
import com.bawei.usercenter.UserCenterActivity
import com.bawei.usercenter.databinding.FragmentPhoneNumberBinding
import com.bawei.usercenter.viewmodel.UserCenterViewModel
import com.example.common.event.api.IEvent
import core.api.FragmentPassByValue
import core.ui.BaseMVVMFragment
import core.ui.callbackFragment
import core.ui.startFragment

class PhoneNumberFragment : BaseMVVMFragment<UserCenterViewModel, FragmentPhoneNumberBinding>(), FragmentPassByValue {
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
            val phoneNum = binding.phoneEt.text.toString()
            val boolean = data.getBoolean("authCode")
            val bundle = Bundle()
            bundle.putString("phoneNum",phoneNum)
            //跳转fragment
                if (boolean) {
                    startFragment(activity!!,AuthCodeFragment::class.java, bundle)
                } else {
                    startFragment(activity!!,UserNameFragment::class.java, bundle)
                }
        }
        binding.phoneBaseLayout.setOnBackClickListener {
            callbackFragment(activity!!)
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