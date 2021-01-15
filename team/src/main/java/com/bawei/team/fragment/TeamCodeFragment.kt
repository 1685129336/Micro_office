package com.bawei.team.fragment

import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.bawei.team.BR
import com.bawei.team.R
import com.bawei.team.databinding.FragmentTeamcodeBinding
import com.bawei.team.viewmodel.TeamCodeViewModel
import core.api.FragmentPassByValue
import core.ui.BaseMVVMFragment
import core.ui.callbackFragment
import kotlinx.android.synthetic.main.fragment_teamcode.*

class TeamCodeFragment :BaseMVVMFragment<TeamCodeViewModel,FragmentTeamcodeBinding>(), FragmentPassByValue {
    override fun initData() {
        binding.codeReturn.setOnClickListener {
            callbackFragment(activity!!)
        }
    }

    override fun initView() {
        binding.teamCodebtnNext.setOnClickListener {
            val inputTeamcode = binding.inputTeamcode.text.toString()

            viewModel.jointeam(inputTeamcode,"111")
        }

        viewModel.netSuccess.observe(this, Observer {
            toast("${it}")
        })
        viewModel.netFailure.observe(this, Observer {
            toast("${it}")
        })
    }

    override fun layoutID(): Int {
        return R.layout.fragment_teamcode
    }

    override fun createViewModel(): TeamCodeViewModel {
        return ViewModelProvider(this,ViewModelProvider.NewInstanceFactory()).get(TeamCodeViewModel::class.java)
    }

    override fun getVariable(): Int {
        return BR.viewModel
    }

    override fun send(data: Bundle?) {

    }
}