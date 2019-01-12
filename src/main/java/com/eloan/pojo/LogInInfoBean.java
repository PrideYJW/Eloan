package com.eloan.pojo;

import java.io.Serializable;

public class LogInInfoBean implements Serializable {
    private Integer id;
    private String username;
    private String password;
    private Integer state;
    private Integer usertype;
    private Boolean admin;

    public LogInInfoBean(){}

    public LogInInfoBean(Integer id, String username, String password, Integer state, Integer usertype, Boolean admin) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.state = state;
        this.usertype = usertype;
        this.admin = admin;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getUsertype() {
        return usertype;
    }

    public void setUsertype(Integer usertype) {
        this.usertype = usertype;
    }

    public Boolean getAdmin() {
        return admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }
}
