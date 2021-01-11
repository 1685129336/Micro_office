package com.bawei.usercenter.fragment

import android.content.Intent

import android.os.Build
import android.os.Bundle
import android.text.Editable

import android.view.View
import android.widget.AdapterView

import androidx.lifecycle.ViewModelProvider
import com.bawei.usercenter.BR
import com.bawei.usercenter.R
import com.bawei.usercenter.UserCenterActivity
import com.bawei.usercenter.databinding.FragmentLoginBinding

import com.bawei.usercenter.fragment.api.FragmentPassByValue
import com.bawei.usercenter.viewmodel.UserCenterViewModel


import com.example.common.event.api.IEvent



import core.ui.BaseMVVMFragment
import kotlinx.android.synthetic.main.fragment_login.*
import java.util.*

class LoginFragment : BaseMVVMFragment<UserCenterViewModel,FragmentLoginBinding>(),FragmentPassByValue {
    var boolean:Boolean = false
    var sp:Int = 0




    override fun createViewModel(): UserCenterViewModel {
        return ViewModelProvider(this,ViewModelProvider.NewInstanceFactory()).get(UserCenterViewModel::class.java)
    }

    override fun getVariable(): Int {
        return BR.viewModel
    }

    override fun initData() {


    }

    var isUsername:Boolean = false
    var isPwd:Boolean = false

    override fun initView() {
        binding.btLogin.setOnClickListener {
            toast("登录",it)
        }
        binding.btLogin.isEnabled = false
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

        //选择语言监听
        binding.languageSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                if (boolean && p2 == 1) {
                    sp = 1
                    changeAppLanguage(Locale.SIMPLIFIED_CHINESE)
                }
                if (boolean && p2 == 2) {
                    sp = 2
                    changeAppLanguage(Locale.US)
                }
                if (!boolean) {
                    boolean = true
                }
            }
        }


        binding.userNameTextChange = object : IEvent.OnTextChangedListener(){
            override fun afterTextChanged(s: Editable?) {
                super.afterTextChanged(s)
                val username = binding.usernameEt.text.toString()
                viewModel.regexPhone(username,{
                    binding.usernameLayout.isErrorEnabled = false
                    binding.btLogin.isEnabled = true
                },{
                    binding.usernameLayout.error = it
                    binding.btLogin.isEnabled = false

                })
            }
        }

        binding.passwordTextChange = object : IEvent.OnTextChangedListener() {
            override fun afterTextChanged(s: Editable?) {
                super.afterTextChanged(s)
                val pwd = binding.passwordEt.text.toString()
                viewModel.regexPassword(pwd,{
                    binding.passwordInputLayout.isErrorEnabled = false
                    binding.btLogin.isEnabled = true
                },{
                    binding.passwordInputLayout.error = it
                    binding.btLogin.isEnabled = false
                })
            }
        }


    }


    override fun layoutID(): Int {
       return R.layout.fragment_login
    }

    override fun send(data: Bundle?) {

    }

    //切换语言重新启动APP
    private fun changeAppLanguage(locale: Locale) {
        val metrics = resources.displayMetrics
        val configuration = resources.configuration
        //判断版本
        if (Build.VERSION.SDK_INT> Build.VERSION_CODES.JELLY_BEAN_MR1){
            configuration.setLocale(locale)
        }else {
            configuration.locale = locale
        }
        resources.updateConfiguration(configuration,metrics)
        val intent = Intent(context, UserCenterActivity::class.java)
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
        startActivity(intent)
    }
}