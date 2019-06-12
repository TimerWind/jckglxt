package com.yb.jckglxt.domain;

/**
 * Created by Administrator on 2019-06-12.
 */
public class User {
    //用户id
    private String id;
    //用户昵称
    private String username;
    //用户登录名
    private String loginName;
    //密码
    private String password;
    //角色
    private String role;
    //状态
    private String state;
    //头像
    private String headPic;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getHeadPic() {
        return headPic;
    }

    public void setHeadPic(String headPic) {
        this.headPic = headPic;
    }
}
