package com.eloan.pojo;

import com.eloan.util.BidConst;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/*
账户账单
 */
public class AccountFlowBean implements Serializable {
    private Integer id;
    private Integer accountActionType; //账户账单类型
    private BigDecimal amount= BidConst.ZERO; //可用余额
    private String note; //备注
    private BigDecimal balance; //授信额度
    private BigDecimal freezed; //冻结金额
    private Date actionTime; //时间

    public AccountFlowBean(){}

    public AccountFlowBean(Integer id, Integer accountActionType, BigDecimal amount, String note, BigDecimal balance, BigDecimal freezed, Date actionTime) {
        this.id = id;
        this.accountActionType = accountActionType;
        this.amount = amount;
        this.note = note;
        this.balance = balance;
        this.freezed = freezed;
        this.actionTime = actionTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAccountActionType() {
        return accountActionType;
    }

    public void setAccountActionType(Integer accountActionType) {
        this.accountActionType = accountActionType;
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

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getFreezed() {
        return freezed;
    }

    public void setFreezed(BigDecimal freezed) {
        this.freezed = freezed;
    }

    public Date getActionTime() {
        return actionTime;
    }

    public void setActionTime(Date actionTime) {
        this.actionTime = actionTime;
    }
}
