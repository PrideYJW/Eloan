package com.eloan.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class PaymentScheduleBean implements Serializable {
    private Integer id;
    private Date deadLine;
    private Date payDate;
    private BigDecimal totalAmount;
    private BigDecimal principal;
    private BigDecimal interest;
    private Integer monthIndex;
    private Integer state;
    private Integer bidRequestType;
    private Integer returnType;
    private String bidRequestTitle;

    public PaymentScheduleBean(){}

    public PaymentScheduleBean(Integer id, Date deadLine, Date payDate, BigDecimal totalAmount, BigDecimal principal, BigDecimal interest, Integer monthIndex, Integer state, Integer bidRequestType, Integer returnType, String bidRequestTitle) {
        this.id = id;
        this.deadLine = deadLine;
        this.payDate = payDate;
        this.totalAmount = totalAmount;
        this.principal = principal;
        this.interest = interest;
        this.monthIndex = monthIndex;
        this.state = state;
        this.bidRequestType = bidRequestType;
        this.returnType = returnType;
        this.bidRequestTitle = bidRequestTitle;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(Date deadLine) {
        this.deadLine = deadLine;
    }

    public Date getPayDate() {
        return payDate;
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public BigDecimal getPrincipal() {
        return principal;
    }

    public void setPrincipal(BigDecimal principal) {
        this.principal = principal;
    }

    public BigDecimal getInterest() {
        return interest;
    }

    public void setInterest(BigDecimal interest) {
        this.interest = interest;
    }

    public Integer getMonthIndex() {
        return monthIndex;
    }

    public void setMonthIndex(Integer monthIndex) {
        this.monthIndex = monthIndex;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getBidRequestType() {
        return bidRequestType;
    }

    public void setBidRequestType(Integer bidRequestType) {
        this.bidRequestType = bidRequestType;
    }

    public Integer getReturnType() {
        return returnType;
    }

    public void setReturnType(Integer returnType) {
        this.returnType = returnType;
    }

    public String getBidRequestTitle() {
        return bidRequestTitle;
    }

    public void setBidRequestTitle(String bidRequestTitle) {
        this.bidRequestTitle = bidRequestTitle;
    }
}
