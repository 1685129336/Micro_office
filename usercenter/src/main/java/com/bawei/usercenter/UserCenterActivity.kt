package com.bawei.usercenter

import com.bawei.usercenter.fragment.*
import core.ui.BaseActivityPageChangeFragment

class UserCenterActivity : BaseActivityPageChangeFragment() {
    override fun frameLayoutId(): Int {
        return R.id.frame_layout
    }

    override fun initData() {

        nextPageInAnimation =R.anim.slide_right_in
        nextPageOutAnimation =  R.anim.slide_left_out
        lastPageInAnimation = R.anim.slide_right_out
        lastPageOutAnimation = R.anim.slide_left_in
        registerFragment(LoginFragment())
        registerFragment(PhoneNumberFragment())
        registerFragment(AuthCodeFragment())
        registerFragment(UserNameFragment())
        registerFragment(PasswordFragment())
    }

    override fun initView() {
        pageChange(0, fragments,true,nextPageInAnimation,nextPageOutAnimation,lastPageInAnimation,lastPageOutAnimation)
    }

    override fun layoutID(): Int {
        return R.layout.activity_user_center
    }

}