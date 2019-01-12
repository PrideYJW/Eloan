package com.eloan.pojo;

import java.io.Serializable;
import java.util.Date;

public class RealAuthBean implements Serializable {

    private Integer id;
    private String realname;
    private Integer sex;
    private String birthDate;
    private String idNumber;
    private String address;
    private Integer state;
    private String image1;
    private String image2;
    private String remark;
    private Date auditTime;
    private Date applyTime;

    public RealAuthBean(){}

    public RealAuthBean(Integer id, String realname, Integer sex, String birthDate, String idNumber, String address, Integer state, String image1, String image2, String remark, Date auditTime, Date applyTime) {
        this.id = id;
        this.realname = realname;
        this.sex = sex;
        this.birthDate = birthDate;
        this.idNumber = idNumber;
        this.address = address;
        this.state = state;
        this.image1 = image1;
        this.image2 = image2;
        this.remark = remark;
        this.auditTime = auditTime;
        this.applyTime = applyTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getImage1() {
        return image1;
    }

    public void setImage1(String image1) {
        this.image1 = image1;
    }

    public String getImage2() {
        return image2;
    }

    public void setImage2(String image2) {
        this.image2 = image2;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }
}
