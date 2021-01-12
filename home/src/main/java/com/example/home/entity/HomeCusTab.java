package com.example.home.entity;

import com.flyco.tablayout.listener.CustomTabEntity;

public class HomeCusTab implements CustomTabEntity {
    private String string;
    private int selecticon;
    private int unselecticon;

    public HomeCusTab(String string, int selecticon, int unselecticon) {
        this.string = string;
        this.selecticon = selecticon;
        this.unselecticon = unselecticon;
    }

    @Override
    public String getTabTitle() {
        return string;
    }

    @Override
    public int getTabSelectedIcon() {
        return selecticon;
    }

    @Override
    public int getTabUnselectedIcon() {
        return unselecticon;
    }
}
