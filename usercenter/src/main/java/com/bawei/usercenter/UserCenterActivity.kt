package com.bawei.usercenter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.KeyEvent
import androidx.fragment.app.Fragment
import com.bawei.usercenter.fragment.*
import com.bawei.usercenter.fragment.api.FragmentPassByValue
import core.ui.BaseActivity
import kotlinx.android.synthetic.main.fragment_login.view.*
import java.util.*

class UserCenterActivity : BaseActivity() {
    var fragments = mutableListOf<Fragment>()
    var pageStack = mutableListOf<Fragment>()
    val loginFragment:LoginFragment=LoginFragment()
    val phoneNumberFragment:PhoneNumberFragment=PhoneNumberFragment()
    val authCodeFragment:AuthCodeFragment=AuthCodeFragment()
    val userNameFragment:UserNameFragment=UserNameFragment()
    val passwordFragment:PasswordFragment=PasswordFragment()
    override fun initData() {

        fragments.add(loginFragment)
        fragments.add(phoneNumberFragment)
        fragments.add(authCodeFragment)
        fragments.add(userNameFragment)
        fragments.add(passwordFragment)
    }

    override fun initView() {
        pageChange(0, fragments,true)
    }

    override fun layoutID(): Int {
        return R.layout.activity_user_center
    }
    //页面切换
    private fun pageChange(pos: Int, fs: MutableList<Fragment>, flag: Boolean) {
        val transaction = supportFragmentManager.beginTransaction()
        if(flag){

            transaction.setCustomAnimations(
                R.anim.slide_right_in,
                R.anim.slide_left_out
            )
        }else{
            transaction.setCustomAnimations(
                R.anim.slide_right_out,
                R.anim.slide_left_in
            )
        }

        if (pos < fs.size && pos >= 0 && fs.size > 0) {
            fs.forEach { if (it.isAdded) transaction.hide(it) }
            if (fs.get(pos).isAdded) {
                transaction.show(fs.get(pos))
            } else {
                transaction.add(R.id.frame_layout, fs.get(pos))
            }
            if (flag) {
                pageStack.add(fragments.get(pos))
            }
            transaction.commit()
        }
    }
    //查询指定的fragment
    private fun queryFragment(fragment: Class<*>, fragments: MutableList<Fragment>): Int {
        for (i in 0 until fragments.size) {
            val f = fragments.get(i)
            if (f::class.java == fragment && f is FragmentPassByValue) {
                return i
            }
        }
        return -1
    }
    //fragment 跳转 外部调用
    fun startFragment(fragment: Class<*>, data: Bundle?) {
        val queryFragment = queryFragment(fragment, fragments)
        val f = fragments.get(queryFragment) as FragmentPassByValue
        pageChange(queryFragment, fragments, true)
        f.send(data)
    }

    //返回上一页
    fun goBack(): Boolean {
        if (pageStack.size > 1) {
            val removeAt = pageStack.removeAt(pageStack.size - 1)
            val queryFragment =
                queryFragment(pageStack.get(pageStack.size - 1).javaClass, fragments)
            pageChange(queryFragment,fragments,false)
            return true
        }
        return false
    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        if (!goBack()) {
            finish()
        }
        return false
    }



}