package com.eloan.pojo;

import java.io.Serializable;
import java.util.Date;

public class UserFileBean implements Serializable {
    private Integer id;
    private Integer state;
    private String remark;
    private Date auditTime;
    private Date aapplyTime;
    private Integer score;
    private String file;

    public UserFileBean(){}

    public UserFileBean(Integer id, Integer state, String remark, Date auditTime, Date aapplyTime, Integer score, String file) {
        this.id = id;
        this.state = state;
        this.remark = remark;
        this.auditTime = auditTime;
        this.aapplyTime = aapplyTime;
        this.score = score;
        this.file = file;
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

    public Date getAapplyTime() {
        return aapplyTime;
    }

    public void setAapplyTime(Date aapplyTime) {
        this.aapplyTime = aapplyTime;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }
}
