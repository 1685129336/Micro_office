package com.bw.microoffice



import android.os.Bundle
import com.bawei.resource.arouter.ActivitySwitch

import com.example.home.fragment.HomeFragment
import core.ui.BaseActivityPageChangeFragment
//@Route(path = ActivitySwitch.APP.MAIN_ACT)
class MainActivity : BaseActivityPageChangeFragment() {
    override fun frameLayoutId(): Int {
        return R.id.main_fram
    }

    override fun initData() {
//        ARouter.getInstance().inject(this)

        //设置fragment进入场动画
        nextPageInAnimation = R.anim.main_left_in
        nextPageOutAnimation = R.anim.main_right_in
        lastPageInAnimation = R.anim.main_left_out
        lastPageOutAnimation = R.anim.main_right_out

        //添加一个fragment
        val registerFragment = registerFragment(HomeFragment())


        startFragment(HomeFragment::class.java, Bundle())

    }

    override fun initView() {
    }

    override fun layoutID(): Int {
        return R.layout.activity_main
    }
    fun pageChange(pos:Int){
        pageChange(pos,fragments,true,nextPageInAnimation,nextPageOutAnimation,lastPageInAnimation,lastPageOutAnimation)
    }

}