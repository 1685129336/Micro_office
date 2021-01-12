package com.bw.microoffice

import com.example.home.fragment.HomeFragment
//import com.example.home.fragment.HomeFragment
//import com.example.home.fragment.ZijiFragg
//import com.example.home.fragment.HomeFragment
//import com.example.home.fragment.ZijiFragg
//import com.example.home.fragment.HomeFragment

//import com.example.home.fragment.HomeFragment
import core.ui.BaseActivityPageChangeFragment

class MainActivity : BaseActivityPageChangeFragment() {
    override fun frameLayoutId(): Int {
        return R.id.main_fram
    }

    override fun initData() {
        nextPageInAnimation = R.anim.main_left_in
        nextPageOutAnimation = R.anim.main_right_in
        lastPageInAnimation = R.anim.main_left_out
        lastPageOutAnimation = R.anim.main_right_out
        val registerFragment = registerFragment(HomeFragment())
//        val zijiFragg = registerFragment(ZijiFragg())

//        startFragment(HomeFragment::class.java,Bundle())
        pageChange(registerFragment)
//        pageChange(zijiFragg)


//        registerFragment()
//        registerFragment()
//        registerFragment()
//        registerFragment()

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