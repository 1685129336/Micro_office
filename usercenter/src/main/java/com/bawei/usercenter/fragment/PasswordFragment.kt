package com.bawei.usercenter.fragment

import android.os.Bundle
import android.text.Editable
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.bawei.usercenter.BR
import com.bawei.usercenter.R
import com.bawei.usercenter.UserCenterActivity
import com.bawei.usercenter.databinding.FragmentPasswordBinding
import com.bawei.usercenter.viewmodel.UserCenterViewModel
import com.example.common.event.api.IEvent
import core.api.FragmentPassByValue
import core.ui.BaseMVVMFragment
import core.ui.callbackFragment

class PasswordFragment : BaseMVVMFragment<UserCenterViewModel,FragmentPasswordBinding>(),FragmentPassByValue {
    override fun createViewModel(): UserCenterViewModel {
        return ViewModelProvider(this,ViewModelProvider.NewInstanceFactory()).get(UserCenterViewModel::class.java)
    }

    override fun getVariable(): Int {
        return BR.viewModel
    }

    override fun initData() {
        binding.btBack.setOnClickListener {
            callbackFragment(activity!!)
        }
    }

    override fun initView() {
        binding.btRegister.isEnabled = false
        binding.pwdTextChange01 =  object : IEvent.OnTextChangedListener(){
            override fun afterTextChanged(s: Editable?) {
                super.afterTextChanged(s)
                val pwd01 = binding.pwdEt01.text.toString()
                viewModel.regexPassword(pwd01,{
                    binding.pwdInputLayout01.isErrorEnabled = false
                    binding.btRegister.isEnabled = true
                },{
                    binding.pwdInputLayout01.error = it
                    binding.btRegister.isEnabled = false

                })
            }
        }
        binding.pwdTextChange02 =  object : IEvent.OnTextChangedListener(){
            override fun afterTextChanged(s: Editable?) {
                super.afterTextChanged(s)
                val pwd01 = binding.pwdEt01.text.toString()
                val pwd02 = binding.pwdEt02.text.toString()
                viewModel.regexPassword(pwd02,{
                    if(pwd01==pwd02){
                        binding.pwdInputLayout02.isErrorEnabled = false
                        binding.btRegister.isEnabled = true
                    }else{
                        binding.pwdInputLayout02.error = "两次密码不一致"
                        binding.btRegister.isEnabled = false
                    }
                },{
                    binding.pwdInputLayout02.error = it
                    binding.btRegister.isEnabled = false

                })
            }
        }

        binding.btRegister.setOnClickListener {
            val pwd1 = binding.pwdEt01.text.toString()
            val pwd2 = binding.pwdEt02.text.toString()
            val phoneNum = data.getString("phoneNum")
            if(!phoneNum.isNullOrBlank() && pwd1==pwd2){
                viewModel.register(phoneNum!!,pwd1)
            }else{
                toast("注册失败")
            }
        }

        viewModel.netSuccess.observe(this, Observer {
            toast("注册成功")
        })
        viewModel.netFailure.observe(this, Observer {
            toast(it)
        })
    }

    override fun layoutID(): Int {
       return R.layout.fragment_password
    }
    var data = Bundle()
    override fun send(data: Bundle?) {
        if (data != null) {
            this.data = data
        }
    }


}