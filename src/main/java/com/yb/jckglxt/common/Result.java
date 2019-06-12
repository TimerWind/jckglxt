package com.yb.jckglxt.common;

import java.util.List;

/**
 * Created by Administrator on 2019-06-12.
 */
public class Result {

    private String code;
    private String msg;
    private Object obj;
    private List List;


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public java.util.List getList() {
        return List;
    }

    public void setList(java.util.List list) {
        List = list;
    }
}
