package com.bawei.usercenter.fragment

import android.os.Bundle
import android.text.Editable
import android.util.Log
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModelProvider
import com.bawei.usercenter.BR
import com.bawei.usercenter.R
import com.bawei.usercenter.UserCenterActivity
import com.bawei.usercenter.databinding.FragmentPasswordBinding
import com.bawei.usercenter.fragment.api.FragmentPassByValue
import com.bawei.usercenter.viewmodel.UserCenterViewModel
import com.example.common.event.api.IEvent
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
    }

    override fun layoutID(): Int {
       return R.layout.fragment_password
    }

    override fun send(data: Bundle?) {

    }


}