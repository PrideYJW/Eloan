package com.eloan.pojo;

import java.io.Serializable;
import java.util.Date;

public class EmailActiveBean implements Serializable {
    private Integer id;
    private String email;
    private Date sendDate;
    private String uuidcode;

    public EmailActiveBean(){}

    public EmailActiveBean(Integer id, String email, Date sendDate, String uuidcode) {
        this.id = id;
        this.email = email;
        this.sendDate = sendDate;
        this.uuidcode = uuidcode;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getSendDate() {
        return sendDate;
    }

    public void setSendDate(Date sendDate) {
        this.sendDate = sendDate;
    }

    public String getUuidcode() {
        return uuidcode;
    }

    public void setUuidcode(String uuidcode) {
        this.uuidcode = uuidcode;
    }
}
