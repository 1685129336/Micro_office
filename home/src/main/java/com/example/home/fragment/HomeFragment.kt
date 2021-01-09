package com.example.home.fragment

import androidx.lifecycle.ViewModelProvider
import com.example.home.BR
import com.example.home.R
import com.example.home.databinding.FragmentHomeBinding
import com.example.home.viewmodel.HomeViewModel
import core.ui.BaseMVVMFragment

class HomeFragment: BaseMVVMFragment<HomeViewModel, FragmentHomeBinding>() {
    override fun initData() {
    }

    override fun initView() {
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