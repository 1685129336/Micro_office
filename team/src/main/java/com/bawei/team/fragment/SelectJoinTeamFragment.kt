package com.bawei.team.fragment

import android.content.Intent
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.bawei.team.BR
import com.bawei.team.R
import com.bawei.team.SaoActivity
import com.bawei.team.databinding.FragmentSelectJointeamBinding
import com.bawei.team.viewmodel.SelectJoinTeamViewModel
import core.api.FragmentPassByValue
import core.ui.BaseMVVMFragment
import core.ui.callbackFragment
import core.ui.startFragment
import kotlinx.android.synthetic.main.fragment_select_jointeam.*

class SelectJoinTeamFragment :BaseMVVMFragment<SelectJoinTeamViewModel,FragmentSelectJointeamBinding>(), FragmentPassByValue {
    override fun initData() {
        binding.selectjoinReturn.setOnClickListener {
            callbackFragment(activity!!)
        }
    }

    override fun initView() {

        binding.selectjoin.setOnClickListener {
            startFragment(activity!!,TeamCodeFragment::class.java, Bundle())
        }
        binding.saoRl.setOnClickListener {
            startActivityForResult(Intent(context,SaoActivity::class.java),100)
        }


    }

    override fun layoutID(): Int {
        return R.layout.fragment_select_jointeam
    }

    override fun createViewModel(): SelectJoinTeamViewModel {
        return ViewModelProvider(this,ViewModelProvider.NewInstanceFactory()).get(SelectJoinTeamViewModel::class.java)
    }

    override fun getVariable(): Int {
        return BR.viewModel
    }

    override fun send(data: Bundle?) {

    }
}