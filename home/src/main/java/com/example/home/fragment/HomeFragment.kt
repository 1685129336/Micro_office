package com.example.home.fragment

import android.view.View
import android.view.ViewGroup
import android.widget.PopupWindow
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.example.home.BR
import com.example.home.R
import com.example.home.databinding.FragmentHomeBinding
import com.example.home.viewmodel.HomeViewModel
import core.ui.BaseMVVMFragment
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment: BaseMVVMFragment<HomeViewModel, FragmentHomeBinding>() {
    lateinit var popupWindow: PopupWindow
    lateinit var menuView:View
    override fun initData() {
        home_img_somesetting.setOnClickListener {
            popupWindow = PopupWindow(menuView,
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT,false)
            popupWindow.isOutsideTouchable=true
            popupWindow.showAsDropDown(home_img_somesetting)
            home_view.visibility= View.VISIBLE
            val homemenu_sao = menuView.findViewById<View>(R.id.homemenu_sao)
            val homemenu_createflock = menuView.findViewById<View>(R.id.homemenu_createflock)
            val homemenu_createdocument = menuView.findViewById<View>(R.id.homemenu_createdocument)
            val homemenu_invite = menuView.findViewById<View>(R.id.homemenu_invite)
            val homemenu_joinmeeting = menuView.findViewById<View>(R.id.homemenu_joinmeeting)

            homemenu_sao.setOnClickListener {
                toast("homemenu_sao")
                popupWindow.dismiss()
            }
            homemenu_createflock.setOnClickListener {
                toast("homemenu_createflock")
                popupWindow.dismiss()
            }
            homemenu_createdocument.setOnClickListener {
                toast("homemenu_createdocument")
                popupWindow.dismiss()
            }

            homemenu_invite.setOnClickListener {
                toast("homemenu_invite")
                popupWindow.dismiss()
            }
            homemenu_joinmeeting.setOnClickListener {
                toast("homemenu_joinmeeting")
                popupWindow.dismiss()
            }

            popupWindow.setOnDismissListener {
                home_view.visibility= View.GONE
            }

        }
    }

    override fun initView() {
        menuView = layoutInflater.inflate(R.layout.layout_menu, null)

    }

    override fun layoutID(): Int {
        return R.layout.fragment_home
    }

    override fun createViewModel(): HomeViewModel {
        return ViewModelProvider(this,ViewModelProvider.NewInstanceFactory()).get(HomeViewModel::class.java)
    }

    override fun getVariable(): Int {
        return BR.viewModel
    }

}