package com.example.home.entity;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

public class InfoCollect implements Serializable {
    private String imgurl;
    private String infofromname;
    private String msg;
    private String infofromtime;

    public InfoCollect(String imgurl, String infofromname, String msg, String infofromtime) {
        this.imgurl = imgurl;
        this.infofromname = infofromname;
        this.msg = msg;
        this.infofromtime = infofromtime;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public String getInfofromname() {
        return infofromname;
    }

    public void setInfofromname(String infofromname) {
        this.infofromname = infofromname;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getInfofromtime() {
        return infofromtime;
    }

    public void setInfofromtime(String infofromtime) {
        this.infofromtime = infofromtime;
    }

    @Override
    public String toString() {
        return "InfoCollect{" +
                "imgurl='" + imgurl + '\'' +
                ", infofromname='" + infofromname + '\'' +
                ", msg='" + msg + '\'' +
                ", infofromtime='" + infofromtime + '\'' +
                '}';
    }



}
