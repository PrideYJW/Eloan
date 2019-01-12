package com.eloan.pojo;

import java.io.Serializable;
import java.util.Date;

public class VedioAuthBean implements Serializable {

    private  Integer id;
    private  Integer state;
    private  String remark;
    private Date auditTime;
    private Date applyTime;

    public VedioAuthBean(){}

    public VedioAuthBean(Integer id, Integer state, String remark, Date auditTime, Date applyTime) {
        this.id = id;
        this.state = state;
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

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
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
