package com.eloan.pojo;

import com.eloan.util.BidConst;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class PaymentScheduleDetailBean implements Serializable {

    private Integer id;
    private BigDecimal bidamount= BidConst.ZERO;
    private BigDecimal totalamount=BidConst.ZERO;
    private BigDecimal principal=BidConst.ZERO;
    private BigDecimal interest=BidConst.ZERO;
    private Integer monthindex;
    private Date deadline;
    private Date paydate;
    private Integer returntype;

    public PaymentScheduleDetailBean(){}

    public PaymentScheduleDetailBean(Integer id, BigDecimal bidamount, BigDecimal totalamount, BigDecimal principal, BigDecimal interest, Integer monthindex, Date deadline, Date paydate, Integer returntype) {
        this.id = id;
        this.bidamount = bidamount;
        this.totalamount = totalamount;
        this.principal = principal;
        this.interest = interest;
        this.monthindex = monthindex;
        this.deadline = deadline;
        this.paydate = paydate;
        this.returntype = returntype;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getBidamount() {
        return bidamount;
    }

    public void setBidamount(BigDecimal bidamount) {
        this.bidamount = bidamount;
    }

    public BigDecimal getTotalamount() {
        return totalamount;
    }

    public void setTotalamount(BigDecimal totalamount) {
        this.totalamount = totalamount;
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

    public Integer getMonthindex() {
        return monthindex;
    }

    public void setMonthindex(Integer monthindex) {
        this.monthindex = monthindex;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public Date getPaydate() {
        return paydate;
    }

    public void setPaydate(Date paydate) {
        this.paydate = paydate;
    }

    public Integer getReturntype() {
        return returntype;
    }

    public void setReturntype(Integer returntype) {
        this.returntype = returntype;
    }
}
