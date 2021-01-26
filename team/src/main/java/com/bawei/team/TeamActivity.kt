package com.bawei.team

import android.os.Bundle
import android.util.Log
import android.widget.Switch
import com.alibaba.android.arouter.facade.annotation.Autowired
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.bawei.resource.arouter.ActivitySwitch
import com.bawei.team.fragment.*
import com.example.net.RetrofitFactory
import core.ui.BaseActivityPageChangeFragment
import kotlinx.android.synthetic.main.activity_sao.*
@Route(path = ActivitySwitch.Team.TEAM_ACT)
class TeamActivity : BaseActivityPageChangeFragment() {

    override fun frameLayoutId(): Int {
        return R.id.team_framelayout
    }

    override fun initData() {
//        ARouter.getInstance().inject(this)
        RetrofitFactory.setToken("eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJhdWQiOiIxMjAifQ.HABBsqKCfN4bFPTg3nuOT85qKztIFwO6bOVaSEMl7mU")

        nextPageInAnimation =R.anim.slide_right_in
        nextPageOutAnimation =  R.anim.slide_left_out
        lastPageInAnimation = R.anim.slide_right_out
        lastPageOutAnimation = R.anim.slide_left_in
        val createJoinTeamFragment = CreateJoinTeamFragment()
        val bundle = Bundle()
        bundle.putInt("skip",1)
        createJoinTeamFragment.arguments=bundle
        val registerFragment1 = registerFragment(createJoinTeamFragment)
        registerFragment(SelectJoinTeamFragment())
        registerFragment(TeamCodeFragment())
        registerFragment(TeamNameFragment())
        val registerFragment = registerFragment(AddMemberFragment())
        registerFragment(AddMemberInfoFragment())

    }

    override fun initView() {
        pageChange(0, fragments,true,nextPageInAnimation,nextPageOutAnimation,lastPageInAnimation,lastPageOutAnimation)

    }

    override fun layoutID(): Int {
        return R.layout.activity_team
    }


}
