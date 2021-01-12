package com.example.home

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.home.adapter.InfoAdapter
import com.example.home.callback.ActivityToFragmentInfo
import com.example.home.databinding.ActivityInformationHomeBinding
import com.example.home.entity.AddInfoBodyBean
import com.example.home.entity.GetInfoBean
import com.example.home.entity.HomeCusTab
import com.example.home.entity.InfoCollect
import com.example.home.fragment.HomeFragment
import com.example.home.viewmodel.HomeGetInfoViewModel
import com.example.home.viewmodel.HomeViewModel
import com.example.net.RetrofitFactory
import com.flyco.tablayout.listener.CustomTabEntity
import core.ui.BaseMVVMActivity
import kotlinx.android.synthetic.main.activity_information_home.*

class HomeInformationActivity : BaseMVVMActivity<HomeGetInfoViewModel, ActivityInformationHomeBinding>() {
    var personchatcus= arrayListOf<CustomTabEntity>()
    var personchatfragments= arrayListOf<Fragment>()
    var gethomeinfolist= mutableListOf<GetInfoBean>()
    lateinit var infoAdapter:InfoAdapter
    lateinit var homeViewModel: HomeViewModel

    companion object{
        var activityToFragmentInfo: ActivityToFragmentInfo?=null

        fun setCall(activityToFragmentInfo: ActivityToFragmentInfo){
            this.activityToFragmentInfo=activityToFragmentInfo
        }
    }
    override fun initData() {
        //跳转Activity携带intent将intent配置赋值一下

        homeViewModel=ViewModelProvider(this,ViewModelProvider.NewInstanceFactory()).get(HomeViewModel::class.java)

        RetrofitFactory.setToken("eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJhdWQiOiIxMjAifQ.HABBsqKCfN4bFPTg3nuOT85qKztIFwO6bOVaSEMl7mU")

        viewModel.getinfodata("111","222")

        viewModel.netSuccess.observe(this, Observer {
            it.forEach {data->
                gethomeinfolist.add(data)
            }
            infoAdapter.notifyDataSetChanged()
        })

        viewModel.netFailure.observe(this, Observer {
            toast("没有得到消息")
        })

        infoAdapter= InfoAdapter(gethomeinfolist)
        home_info_recycler.adapter=infoAdapter
        home_info_recycler.layoutManager=LinearLayoutManager(this)

        home_bt_infosendmsg.setOnClickListener {
            val home_msg = home_et_msg.text.toString()

            val addInfoBodyBean = AddInfoBodyBean(
                home_msg,
                "2021-01-10 19:35:41",
                111, 0, 1, 222
            )
            homeViewModel.addinfo(addInfoBodyBean)
            home_et_msg.text.clear()
            val bundle = Bundle()
            val infoCollect = InfoCollect("","222",home_msg,"13:14")

            bundle.putSerializable("infocollect",infoCollect)

            activityToFragmentInfo?.getActivityInfo(bundle)
        }

        homeViewModel.netSuccess.observe(this, Observer {
            toast("${it}")
            gethomeinfolist.clear()
            viewModel.getinfodata("111","222")
            infoAdapter.notifyDataSetChanged()
        })

        homeViewModel.netFailure.observe(this, Observer {
            toast("${it}")
        })


    }

    override fun initView() {
        commitcomm()
    }

    private fun commitcomm() {
        personchatcus.add(
            HomeCusTab(
                "",
                R.drawable.ic_smeil,
                R.drawable.ic_smeil
            )
        )
        personchatcus.add(
            HomeCusTab(
                "",
                R.drawable.ic_image,
                R.drawable.ic_image
            )
        )
        personchatcus.add(
            HomeCusTab(
                "",
                R.drawable.ic_record,
                R.drawable.ic_record
            )
        )
        personchatcus.add(
            HomeCusTab(
                "",
                R.drawable.ic_camera,
                R.drawable.ic_camera
            )
        )
        personchatcus.add(
            HomeCusTab(
                "",
                R.drawable.ic_location,
                R.drawable.ic_location
            )
        )
        personchatcus.add(
            HomeCusTab(
                "",
                R.drawable.ic_baseline_add_circle_outline_24,
                R.drawable.ic_baseline_add_circle_outline_24
            )
        )

        home_info_comm.setTabData(personchatcus)
    }

    override fun layoutID(): Int {
        return R.layout.activity_information_home
    }

    override fun createViewModel(): HomeGetInfoViewModel {
        return ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(
            HomeGetInfoViewModel::class.java
        )
    }

    override fun getVariable(): Int {
        return BR.viewModel
    }

}
