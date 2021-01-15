package com.bawei.team.fragment

import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.bawei.team.BR
import com.bawei.team.R
import com.bawei.team.databinding.FragmentAddMemberBinding
import com.bawei.team.viewmodel.AddMemberViewModel
import com.bawei.team.viewmodel.TeamCodeViewModel
import core.api.FragmentPassByValue
import core.ui.BaseMVVMFragment
import core.ui.startFragment
import kotlinx.android.synthetic.main.fragment_add_member.*

class AddMemberFragment : BaseMVVMFragment<AddMemberViewModel, FragmentAddMemberBinding>() , FragmentPassByValue {
    override fun initData() {

    }

    override fun initView() {
        binding.addmemberbtn.setOnClickListener {
            startFragment(activity!!,AddMemberInfoFragment::class.java, Bundle())
        }
    }

    override fun layoutID(): Int {
        return R.layout.fragment_add_member
    }

    override fun createViewModel(): AddMemberViewModel {
        return ViewModelProvider(this,
            ViewModelProvider.NewInstanceFactory()).get(AddMemberViewModel::class.java)

    }

    override fun getVariable(): Int {
       return BR.viewModel
    }

    override fun send(data: Bundle?) {

    }

}