package com.bawei.team.fragment

import android.os.Bundle
import android.os.Handler
import android.os.Message
import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.bawei.team.BR
import com.bawei.team.R
import com.bawei.team.databinding.FragmentCreateJointeamBinding
import com.bawei.team.viewmodel.CreateJoinTeamViewModel
import core.api.FragmentPassByValue
import core.ui.BaseMVVMFragment
import core.ui.callbackFragment
import core.ui.startFragment
import kotlinx.android.synthetic.main.fragment_create_jointeam.*


class CreateJoinTeamFragment :BaseMVVMFragment<CreateJoinTeamViewModel, FragmentCreateJointeamBinding>(), FragmentPassByValue {
    override fun initData() {
        binding.createjoinReturn.setOnClickListener {
            callbackFragment(activity!!)
        }
    }

    override fun initView() {

//        将字体文件保存在assets/fonts/目录下，创建Typeface对象
//        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonnts/fangsongti.ttf")
//        使用字体成仿宋体
//        textView.setTypeface(typeFace)
        //进入加入团队
        binding.jointeamRl.setOnClickListener {
            startFragment(activity!!,SelectJoinTeamFragment::class.java, Bundle())
        }
        binding.createteamRl.setOnClickListener {
            startFragment(activity!!,TeamNameFragment::class.java, Bundle())
        }

    }

    override fun layoutID(): Int {
        return R.layout.fragment_create_jointeam
    }

    override fun createViewModel(): CreateJoinTeamViewModel {
        return ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(
            CreateJoinTeamViewModel::class.java
        )
    }

    override fun getVariable(): Int {
        return BR.viewModel
    }

    override fun send(data: Bundle?) {

    }
}