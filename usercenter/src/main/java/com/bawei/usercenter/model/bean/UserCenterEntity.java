package com.bawei.usercenter.model.bean;
public class UserCenterEntity {

    /**
     * id : 123
     * phonenumber : 15619766027
     * pwd : 123456
     * realname : null
     * token : eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJhdWQiOiIxMjMifQ.hGF75Ls9GrdHu1_qxgob4sTO9OGGCq4HV0g6boHJpk8
     * headimg : null
     */

    private Integer id;
    private String phonenumber;
    private String pwd;
    private Object realname;
    private String token;
    private Object headimg;

    @Override
    public String toString() {
        return "UserCenterEntity{" +
                "id=" + id +
                ", phonenumber='" + phonenumber + '\'' +
                ", pwd='" + pwd + '\'' +
                ", realname=" + realname +
                ", token='" + token + '\'' +
                ", headimg=" + headimg +
                '}';
    }

    public UserCenterEntity() {
    }

    public UserCenterEntity(Integer id, String phonenumber, String pwd, Object realname, String token, Object headimg) {
        this.id = id;
        this.phonenumber = phonenumber;
        this.pwd = pwd;
        this.realname = realname;
        this.token = token;
        this.headimg = headimg;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Object getRealname() {
        return realname;
    }

    public void setRealname(Object realname) {
        this.realname = realname;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Object getHeadimg() {
        return headimg;
    }

    public void setHeadimg(Object headimg) {
        this.headimg = headimg;
    }
}
