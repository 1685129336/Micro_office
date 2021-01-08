package com.bawei.usercenter.fragment

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.Toast
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
import java.util.*

class LoginFragment : BaseMVVMFragment<UserCenterViewModel,FragmentLoginBinding>(),FragmentPassByValue {
    var boolean:Boolean = false
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
        }
        binding.tvAuthCodeLogin.setOnClickListener {
            val bundle = Bundle()
            bundle.putBoolean("authCode",true)
            ( activity as UserCenterActivity).startFragment(PhoneNumberFragment::class.java,bundle)
        }
        binding.languageSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(p0: AdapterView<*>?) {
            }

            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                Log.i("sjz", "onItemSelected: " + 1)
                if (boolean && p2 == 1) {
                    Log.i("sjz", "onItemSelected: " + 2)
                    changeAppLanguage(Locale.SIMPLIFIED_CHINESE)
                }
                if (boolean && p2 == 2) {
                    Toast.makeText(context, "" + p2, Toast.LENGTH_SHORT).show()
                    Log.i("sjz", "onItemSelected: " + 3)

                    changeAppLanguage(Locale.US)

                }
                if (!boolean) {
                    boolean = true
                }

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