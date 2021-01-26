package com.bawei.team.fragment

import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.bawei.team.BR
import com.bawei.team.R
import com.bawei.team.databinding.FragmentTeamnameBinding
import com.bawei.team.model.entity.CreateTeamEntity
import com.bawei.team.viewmodel.TeamCodeViewModel
import com.bawei.team.viewmodel.TeamNameViewModel
import core.api.FragmentPassByValue
import core.ui.BaseMVVMFragment
import core.ui.callbackFragment
import core.ui.startFragment
import kotlinx.android.synthetic.main.fragment_teamname.*

class TeamNameFragment : BaseMVVMFragment<TeamNameViewModel, FragmentTeamnameBinding>(), FragmentPassByValue {
    override fun initData() {

    }
    /**
     * creator : 0  创建者ID
     * creatorname :  创建者真实姓名
     * ctime :  创建时间
     * description :  描述
     * id : 0  团队ID
     * teamcode :  团队码
     * teamname :  团队名称
     */
    //TODO teamcode 暂时222
    override fun initView() {
        binding.teamNamebtnNext.setOnClickListener {

            startFragment(activity!!,AddMemberFragment::class.java, Bundle())
            val inputTeamname = binding.inputTeamname.text.toString()
            val createTeamEntity = CreateTeamEntity(
                111,
                "不知道",
                "2020-1-12 12:30",
                "简简单单一个团",
                0, "暂时222", inputTeamname
            )
            viewModel.createteam(createTeamEntity)
        }

        viewModel.netSuccess.observe(this, Observer {
            toast("${it}")
        })
        viewModel.netFailure.observe(this, Observer {
            toast("${it}")
        })

        binding.nameReturn.setOnClickListener {
            callbackFragment(activity!!)
        }
    }

    override fun layoutID(): Int {
        return R.layout.fragment_teamname
    }

    override fun createViewModel(): TeamNameViewModel {
        return ViewModelProvider(this,
            ViewModelProvider.NewInstanceFactory()).get(TeamNameViewModel::class.java)

    }

    override fun getVariable(): Int {
        return BR.viewModel
    }

    override fun send(data: Bundle?) {

    }
}