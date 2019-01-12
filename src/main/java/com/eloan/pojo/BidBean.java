package com.eloan.pojo;

import com.eloan.util.BidConst;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/*
 投标
 */
public class BidBean implements Serializable {
    private Integer id;
    private BigDecimal actualRate= BidConst.ZERO; //实际汇率
    private BigDecimal vailableAmount= BidConst.ZERO; //可获得金额
    private Date bidTime; //时间
    private String bidRequestTitle; //返回信息

    public  BidBean(){}

    public BidBean(Integer id, BigDecimal actualRate, BigDecimal vailableAmount, Date bidTime, String bidRequestTitle) {
        this.id = id;
        this.actualRate = actualRate;
        this.vailableAmount = vailableAmount;
        this.bidTime = bidTime;
        this.bidRequestTitle = bidRequestTitle;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getActualRate() {
        return actualRate;
    }

    public void setActualRate(BigDecimal actualRate) {
        this.actualRate = actualRate;
    }

    public BigDecimal getVailableAmount() {
        return vailableAmount;
    }

    public void setVailableAmount(BigDecimal vailableAmount) {
        this.vailableAmount = vailableAmount;
    }

    public Date getBidTime() {
        return bidTime;
    }

    public void setBidTime(Date bidTime) {
        this.bidTime = bidTime;
    }

    public String getBidRequestTitle() {
        return bidRequestTitle;
    }

    public void setBidRequestTitle(String bidRequestTitle) {
        this.bidRequestTitle = bidRequestTitle;
    }
}
