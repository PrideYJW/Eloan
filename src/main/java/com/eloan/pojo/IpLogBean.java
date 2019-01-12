package com.eloan.pojo;

import java.io.Serializable;

public class IpLogBean implements Serializable {
    private Integer id;
    private String ip;
    private Integer loginStatel;
    private String username;
    private Integer loginInfoId;
    private Integer loginType;
    private String loginTime;

    public IpLogBean(){}

    public IpLogBean(Integer id, String ip, Integer loginStatel, String username, Integer loginInfoId, Integer loginType, String loginTime) {
        this.id = id;
        this.ip = ip;
        this.loginStatel = loginStatel;
        this.username = username;
        this.loginInfoId = loginInfoId;
        this.loginType = loginType;
        this.loginTime = loginTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Integer getLoginStatel() {
        return loginStatel;
    }

    public void setLoginStatel(Integer loginStatel) {
        this.loginStatel = loginStatel;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getLoginInfoId() {
        return loginInfoId;
    }

    public void setLoginInfoId(Integer loginInfoId) {
        this.loginInfoId = loginInfoId;
    }

    public Integer getLoginType() {
        return loginType;
    }

    public void setLoginType(Integer loginType) {
        this.loginType = loginType;
    }

    public String getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(String loginTime) {
        this.loginTime = loginTime;
    }
}
