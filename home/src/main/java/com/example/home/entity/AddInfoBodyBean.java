package com.example.home.entity;

public class AddInfoBodyBean {

    /**
     * content : 我是哈哈哈
     * ctime : 2020-12-15 12:30
     * fromuser : 111
     * id : 0
     * msgtype : 1
     * touser : 222
     */

    private String content;
    private String ctime;
    private int fromuser;
    private int id;
    private int msgtype;
    private int touser;

    public AddInfoBodyBean(String content, String ctime, int fromuser, int id, int msgtype, int touser) {
        this.content = content;
        this.ctime = ctime;
        this.fromuser = fromuser;
        this.id = id;
        this.msgtype = msgtype;
        this.touser = touser;
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

    public int getTouser() {
        return touser;
    }

    public void setTouser(int touser) {
        this.touser = touser;
    }
}
