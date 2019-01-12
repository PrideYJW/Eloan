package com.eloan.pojo;


import com.eloan.util.BidConst;

import java.io.Serializable;
import java.math.BigDecimal;

/*
 用户的帐户
 */
public class AccountBean implements Serializable {
    private Integer id;
    private String tradePassword; //交易密码
    private BigDecimal usableAmount=BidConst.ZERO; //可用余额
    private BigDecimal freezedAmount=BidConst.ZERO; //冻结金额
    private BigDecimal borrowLimitAmount=BidConst.ZERO; //授信额度
    private BigDecimal unReceiveInterest=BidConst.ZERO;	  //账户待收利息
    private BigDecimal unReceivePrincipal=BidConst.ZERO;  //账户待收本金
    private BigDecimal unReturnAmount=BidConst.ZERO;	  //账户待还金额
    private BigDecimal remainBorrowLimit=BidConst.ZERO;	  //账户剩余授信额度

    public AccountBean(){}

    public AccountBean(Integer id, String tradePassword, BigDecimal usableAmount, BigDecimal freezedAmount, BigDecimal borrowLimitAmount, BigDecimal unReceiveInterest, BigDecimal unReceivePrincipal, BigDecimal unReturnAmount, BigDecimal remainBorrowLimit) {
        this.id = id;
        this.tradePassword = tradePassword;
        this.usableAmount = usableAmount;
        this.freezedAmount = freezedAmount;
        this.borrowLimitAmount = borrowLimitAmount;
        this.unReceiveInterest = unReceiveInterest;
        this.unReceivePrincipal = unReceivePrincipal;
        this.unReturnAmount = unReturnAmount;
        this.remainBorrowLimit = remainBorrowLimit;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTradePassword() {
        return tradePassword;
    }

    public void setTradePassword(String tradePassword) {
        this.tradePassword = tradePassword;
    }

    public BigDecimal getUsableAmount() {
        return usableAmount;
    }

    public void setUsableAmount(BigDecimal usableAmount) {
        this.usableAmount = usableAmount;
    }

    public BigDecimal getFreezedAmount() {
        return freezedAmount;
    }

    public void setFreezedAmount(BigDecimal freezedAmount) {
        this.freezedAmount = freezedAmount;
    }

    public BigDecimal getBorrowLimitAmount() {
        return borrowLimitAmount;
    }

    public void setBorrowLimitAmount(BigDecimal borrowLimitAmount) {
        this.borrowLimitAmount = borrowLimitAmount;
    }

    public BigDecimal getUnReceiveInterest() {
        return unReceiveInterest;
    }

    public void setUnReceiveInterest(BigDecimal unReceiveInterest) {
        this.unReceiveInterest = unReceiveInterest;
    }

    public BigDecimal getUnReceivePrincipal() {
        return unReceivePrincipal;
    }

    public void setUnReceivePrincipal(BigDecimal unReceivePrincipal) {
        this.unReceivePrincipal = unReceivePrincipal;
    }

    public BigDecimal getUnReturnAmount() {
        return unReturnAmount;
    }

    public void setUnReturnAmount(BigDecimal unReturnAmount) {
        this.unReturnAmount = unReturnAmount;
    }

    public BigDecimal getRemainBorrowLimit() {
        return remainBorrowLimit;
    }

    public void setRemainBorrowLimit(BigDecimal remainBorrowLimit) {
        this.remainBorrowLimit = remainBorrowLimit;
    }
}
