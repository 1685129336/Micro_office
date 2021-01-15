package com.bawei.team

import android.os.Bundle
import android.util.Log
import android.widget.Switch
import com.alibaba.android.arouter.facade.annotation.Route
import com.bawei.team.fragment.*
import com.example.net.RetrofitFactory
import core.ui.BaseActivityPageChangeFragment
import kotlinx.android.synthetic.main.activity_sao.*

class TeamActivity : BaseActivityPageChangeFragment() {
    override fun frameLayoutId(): Int {
        return R.id.team_framelayout
    }

    override fun initData() {
        RetrofitFactory.setToken("eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJhdWQiOiIxMjAifQ.HABBsqKCfN4bFPTg3nuOT85qKztIFwO6bOVaSEMl7mU")

        nextPageInAnimation =R.anim.slide_right_in
        nextPageOutAnimation =  R.anim.slide_left_out
        lastPageInAnimation = R.anim.slide_right_out
        lastPageOutAnimation = R.anim.slide_left_in

        val registerFragment1 = registerFragment(CreateJoinTeamFragment())
        registerFragment(SelectJoinTeamFragment())
        registerFragment(TeamCodeFragment())
        registerFragment(TeamNameFragment())
        val registerFragment = registerFragment(AddMemberFragment())
        registerFragment(AddMemberInfoFragment())

        val count = intent!!.getIntExtra("count",-1)
        Log.i("===","我成功拿到了我要进行跳转我的Fragment${count}")
        when(count){
            1->{
                pageChange(registerFragment,fragments,false,nextPageInAnimation,nextPageOutAnimation,lastPageInAnimation,lastPageOutAnimation)
            }
        }

    }

    override fun initView() {
        pageChange(0, fragments,true,nextPageInAnimation,nextPageOutAnimation,lastPageInAnimation,lastPageOutAnimation)

    }

    override fun layoutID(): Int {
        return R.layout.activity_team
    }


}
