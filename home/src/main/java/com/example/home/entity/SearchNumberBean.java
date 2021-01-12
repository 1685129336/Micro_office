package com.example.home.entity;

public class SearchNumberBean {

    /**
     * code : 0
     * msg : 请求成功
     * data : {"id":121,"phonenumber":"222","pwd":null,"realname":null,"token":null,"headimg":null}
     */

    private int code;
    private String msg;
    private DataBean data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 121
         * phonenumber : 222
         * pwd : null
         * realname : null
         * token : null
         * headimg : null
         */

        private int id;
        private String phonenumber;
        private Object pwd;
        private Object realname;
        private Object token;
        private Object headimg;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getPhonenumber() {
            return phonenumber;
        }

        public void setPhonenumber(String phonenumber) {
            this.phonenumber = phonenumber;
        }

        public Object getPwd() {
            return pwd;
        }

        public void setPwd(Object pwd) {
            this.pwd = pwd;
        }

        public Object getRealname() {
            return realname;
        }

        public void setRealname(Object realname) {
            this.realname = realname;
        }

        public Object getToken() {
            return token;
        }

        public void setToken(Object token) {
            this.token = token;
        }

        public Object getHeadimg() {
            return headimg;
        }

        public void setHeadimg(Object headimg) {
            this.headimg = headimg;
        }
    }
}
