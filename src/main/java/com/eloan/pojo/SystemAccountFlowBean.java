package com.eloan.pojo;

import com.eloan.util.BidConst;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class SystemAccountFlowBean implements Serializable {

    private Integer id;
    private Date createdDate;
    private Integer accountactiontype;
    private BigDecimal amount= BidConst.ZERO;
    private String note;
    private BigDecimal alance=BidConst.ZERO;
    private BigDecimal freezedAmount=BidConst.ZERO;

    public SystemAccountFlowBean(){}

    public SystemAccountFlowBean(Integer id, Date createdDate, Integer accountactiontype, BigDecimal amount, String note, BigDecimal alance, BigDecimal freezedAmount) {
        this.id = id;
        this.createdDate = createdDate;
        this.accountactiontype = accountactiontype;
        this.amount = amount;
        this.note = note;
        this.alance = alance;
        this.freezedAmount = freezedAmount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Integer getAccountactiontype() {
        return accountactiontype;
    }

    public void setAccountactiontype(Integer accountactiontype) {
        this.accountactiontype = accountactiontype;
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

    public BigDecimal getAlance() {
        return alance;
    }

    public void setAlance(BigDecimal alance) {
        this.alance = alance;
    }

    public BigDecimal getFreezedAmount() {
        return freezedAmount;
    }

    public void setFreezedAmount(BigDecimal freezedAmount) {
        this.freezedAmount = freezedAmount;
    }
}
