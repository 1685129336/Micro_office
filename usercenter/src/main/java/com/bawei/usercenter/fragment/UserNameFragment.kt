package com.bawei.usercenter.fragment

import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.bawei.usercenter.BR
import com.bawei.usercenter.R
import com.bawei.usercenter.UserCenterActivity
import com.bawei.usercenter.databinding.FragmentUserNameBinding
import com.bawei.usercenter.viewmodel.UserCenterViewModel
import core.api.FragmentPassByValue
import core.ui.BaseMVVMFragment
import core.ui.callbackFragment
import core.ui.startFragment

class UserNameFragment : BaseMVVMFragment<UserCenterViewModel,FragmentUserNameBinding>(), FragmentPassByValue {
    override fun createViewModel(): UserCenterViewModel {
        return ViewModelProvider(this,ViewModelProvider.NewInstanceFactory()).get(UserCenterViewModel::class.java)
    }

    override fun getVariable(): Int {
        return BR.viewModel
    }

    override fun initData() {
        binding.usernameBaseLayout.setOnBackClickListener {
            callbackFragment(activity!!)
        }
    }

    override fun initView() {
        binding.btUserNameNext.setOnClickListener {
            startFragment(activity!!,PasswordFragment::class.java,data)
        }
    }

    override fun layoutID(): Int {
       return R.layout.fragment_user_name
    }
    var data = Bundle()
    override fun send(data: Bundle?) {
        if (data != null) {
            this.data = data
        }
    }

}