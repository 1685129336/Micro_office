package com.bw.microoffice

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
//import com.example.home.fragment.HomeFragment
import com.flyco.tablayout.listener.CustomTabEntity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    private var maincusList = ArrayList<CustomTabEntity>()
    private var mainfragmentList = ArrayList<Fragment>()
//    lateinit var  homeFragment:HomeFragment
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        homeFragment = HomeFragment()
//
//
//        mainfragmentList.add(homeFragment)
//        mainfragmentList.add(homeFragment)
//        mainfragmentList.add(homeFragment)
//        mainfragmentList.add(homeFragment)
//        mainfragmentList.add(homeFragment)
//
//        maincusList.add(MainCuBean("消息", 0, 0))
//        maincusList.add(MainCuBean("日历", 0, 0))
//        maincusList.add(MainCuBean("工作台", 0, 0))
//        maincusList.add(MainCuBean("云空间", 0, 0))
//        maincusList.add(MainCuBean("联系人", 0, 0))
//
//        main_commtab.setTabData(maincusList, this, R.id.main_fram, mainfragmentList)

    }


}