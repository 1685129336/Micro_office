package com.example.home.fragment

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.widget.PopupWindow
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.home.BR
import com.example.home.HomeInformationActivity
import com.example.home.R
import com.example.home.adapter.InfoItemAdapter
import com.example.home.callback.ActivityToFragmentInfo
import com.example.home.databinding.FragmentHomeBinding
import com.example.home.entity.InfoCollect
import com.example.home.viewmodel.HomeViewModel
import core.api.FragmentPassByValue
import core.ui.BaseMVVMFragment
import kotlinx.android.synthetic.main.fragment_home.*

open class HomeFragment: BaseMVVMFragment<HomeViewModel, FragmentHomeBinding>(),FragmentPassByValue,ActivityToFragmentInfo{
    lateinit var popupWindow: PopupWindow
    lateinit var menuView:View
    var infoCollectlist= mutableListOf<InfoCollect>()
    lateinit var infoItemadapter: InfoItemAdapter
    var lostone:Boolean=true
    override fun initData() {
        //接口实例化
        HomeInformationActivity.setCall(this)

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
                startActivity(Intent(context,HomeInformationActivity::class.java))
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

        infoItemadapter= InfoItemAdapter(R.layout.layout_infoitem,infoCollectlist)
        home_recycler.adapter=infoItemadapter
        home_recycler.layoutManager=LinearLayoutManager(context)

        infoItemadapter.setOnItemClickListener { adapter, view, position ->
            startActivity(Intent(context,HomeInformationActivity::class.java))
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

    override fun send(data: Bundle?) {
        //这里拿到主界面的一些信息

        //对home_tv_name赋值

        home_tv_name.setText("张")

    }

    override fun getActivityInfo(bundle: Bundle?) {
        //接口回调时刻接收那边发的消息生成列表
        val parcelable = bundle!!.getSerializable("infocollect") as InfoCollect
        //判空
        if (parcelable!=null){
            if (lostone){
                infoCollectlist.add(parcelable)
                lostone=false
            }
            for (i in infoCollectlist.indices){
                //判断是不是一个人发的否则不添加新的
                if (infoCollectlist.get(i).infofromname!=parcelable.infofromname){
                    infoCollectlist.add(parcelable)
                    //判断是不是一个是就修改信息即可
                }else if (infoCollectlist.get(i).infofromname==parcelable.infofromname){
                    infoCollectlist.get(i).msg=parcelable.msg
                    infoCollectlist.get(i).infofromtime=parcelable.infofromtime
                }
            }

            if (infoCollectlist.size==0){
                lostone=true
            }

            infoItemadapter.notifyDataSetChanged()

        }


    }


}