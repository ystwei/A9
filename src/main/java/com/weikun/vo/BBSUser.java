package com.weikun.vo;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/10/9.
 */
public class BBSUser implements Serializable{
    private int id;
    private String path;//头像地址

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    private String username;
    private String password;
    private int pagenum;

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public int getPagenum() {
        return pagenum;
    }

    public void setPagenum(int pagenum) {
        this.pagenum = pagenum;
    }
    public BBSUser() {}
    public BBSUser(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
