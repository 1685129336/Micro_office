package com.example.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.PopupWindow
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.layout_menu.*

class HomeActivity : AppCompatActivity() {
    lateinit var popupWindow:PopupWindow

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_home)

        //获取布局
        val menuView = layoutInflater.inflate(R.layout.layout_menu, null)

        //弹出pop
        home_img_somesetting.setOnClickListener {
            popupWindow = PopupWindow(menuView,ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT,false)
            popupWindow.isOutsideTouchable=true
            popupWindow.showAsDropDown(home_img_somesetting)
            home_view.visibility=View.VISIBLE
            val homemenu_sao = menuView.findViewById<View>(R.id.homemenu_sao)
            val homemenu_createflock = menuView.findViewById<View>(R.id.homemenu_createflock)
            val homemenu_createdocument = menuView.findViewById<View>(R.id.homemenu_createdocument)
            val homemenu_invite = menuView.findViewById<View>(R.id.homemenu_invite)
            val homemenu_joinmeeting = menuView.findViewById<View>(R.id.homemenu_joinmeeting)

            homemenu_sao.setOnClickListener {

                Toast.makeText(this, "homemenu_sao", Toast.LENGTH_SHORT).show()
                popupWindow.dismiss()
            }
            homemenu_createflock.setOnClickListener {
                Toast.makeText(this, "homemenu_createflock", Toast.LENGTH_SHORT).show()
                popupWindow.dismiss()
            }
            homemenu_createdocument.setOnClickListener {
                Toast.makeText(this, "homemenu_createdocument", Toast.LENGTH_SHORT).show()
                popupWindow.dismiss()
            }

            homemenu_invite.setOnClickListener {
                Toast.makeText(this, "homemenu_invite", Toast.LENGTH_SHORT).show()
                popupWindow.dismiss()
            }
            homemenu_joinmeeting.setOnClickListener {
                Toast.makeText(this, "homemenu_joinmeeting", Toast.LENGTH_SHORT).show()
                popupWindow.dismiss()
            }

            popupWindow.setOnDismissListener {
                home_view.visibility=View.GONE
            }

        }



    }
}
