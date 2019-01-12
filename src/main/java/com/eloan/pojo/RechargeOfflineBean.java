package com.eloan.pojo;

import com.eloan.util.BidConst;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class RechargeOfflineBean implements Serializable {
    private Integer id;
    private Integer state;
    private String remark;
    private Date auditTime;
    private Date applyTime;
    private String tradeCode;
    private Date tradeTime;
    private BigDecimal amount= BidConst.ZERO;
    private String note;

    public RechargeOfflineBean(){}

    public RechargeOfflineBean(Integer id, Integer state, String remark, Date auditTime, Date applyTime, String tradeCode, Date tradeTime, BigDecimal amount, String note) {
        this.id = id;
        this.state = state;
        this.remark = remark;
        this.auditTime = auditTime;
        this.applyTime = applyTime;
        this.tradeCode = tradeCode;
        this.tradeTime = tradeTime;
        this.amount = amount;
        this.note = note;
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

    public String getTradeCode() {
        return tradeCode;
    }

    public void setTradeCode(String tradeCode) {
        this.tradeCode = tradeCode;
    }

    public Date getTradeTime() {
        return tradeTime;
    }

    public void setTradeTime(Date tradeTime) {
        this.tradeTime = tradeTime;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
