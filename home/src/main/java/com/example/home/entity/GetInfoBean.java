package com.example.home.entity;

import com.chad.library.adapter.base.entity.MultiItemEntity;

import java.util.List;

public class GetInfoBean implements MultiItemEntity {
    /**
     * id : 3
     * msgtype : 1
     * content : 我是哈哈哈
     * ctime : 2021-01-10 19:35:41
     * fromuser : 111
     * touser : 222
     */

    private int id;
    private int msgtype;
    private String content;
    private String ctime;
    private int fromuser;
    private int touser;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMsgtype() {
        return msgtype;
    }

    public void setMsgtype(int msgtype) {
        this.msgtype = msgtype;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCtime() {
        return ctime;
    }

    public void setCtime(String ctime) {
        this.ctime = ctime;
    }

    public int getFromuser() {
        return fromuser;
    }

    public void setFromuser(int fromuser) {
        this.fromuser = fromuser;
    }

    public int getTouser() {
        return touser;
    }

    public void setTouser(int touser) {
        this.touser = touser;
    }

    @Override
    public String toString() {
        return "DataBean{" +
                "id=" + id +
                ", msgtype=" + msgtype +
                ", content='" + content + '\'' +
                ", ctime='" + ctime + '\'' +
                ", fromuser=" + fromuser +
                ", touser=" + touser +
                '}';
    }

    @Override
    public int getItemType() {
        return msgtype;
    }
}
