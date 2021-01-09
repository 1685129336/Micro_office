package com.example.linkman;

import com.chad.library.adapter.base.entity.MultiItemEntity;

public class LinkMan implements MultiItemEntity,SortByString {
    //联系人
    public static final int ISLINKMAN = 0;
    //字母
    public static final int ISLETTER = 1;

    private String name;
    private String phoneNum;
    //默认为联系人
    private int type = ISLINKMAN;

    public LinkMan(String name, String phoneNum) {
        this.name = name;
        this.phoneNum = phoneNum;
    }

    public LinkMan(String name, int type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public int getItemType() {
        return type;
    }


    @Override
    public String getSortByString() {
        return name;
    }
}
