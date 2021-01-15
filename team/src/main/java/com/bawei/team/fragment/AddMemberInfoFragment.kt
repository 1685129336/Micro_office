package com.bawei.team.fragment

import android.content.Intent
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.bawei.team.BR
import com.bawei.team.R
import com.bawei.team.databinding.FragmentAddMemberinfoBinding
import com.bawei.team.viewmodel.AddMemberInfoViewModel
import core.api.FragmentPassByValue
import core.ui.BaseMVVMFragment

class AddMemberInfoFragment :BaseMVVMFragment<AddMemberInfoViewModel,FragmentAddMemberinfoBinding>(), FragmentPassByValue {
    override fun initData() {

    }

    override fun initView() {
        binding.teamBtnAddnumber.setOnClickListener {
           activity!!.finish()
        }
    }

    override fun layoutID(): Int {
        return R.layout.fragment_add_memberinfo
    }

    override fun createViewModel(): AddMemberInfoViewModel {
        return ViewModelProvider(this,
            ViewModelProvider.NewInstanceFactory()).get(AddMemberInfoViewModel::class.java)
    }

    override fun getVariable(): Int {
        return BR.viewModel
    }

    override fun send(data: Bundle?) {

    }
}