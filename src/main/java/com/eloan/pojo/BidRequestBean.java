package com.eloan.pojo;

import com.eloan.util.BidConst;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class BidRequestBean implements Serializable {
    private Integer id;
    private Integer bidRequestType;
    private Integer bidRequestState;
    private Integer bidRequestAmount;
    private BigDecimal currentRate= BidConst.ZERO;
    private Integer monthes2Return;
    private Integer bidCount;
    private Integer totalRewardAmount;
    private BigDecimal currentSum;
    private String title;
    private String description;
    private String note;
    private Date disableDate;
    private Integer disableDays;
    private BigDecimal minBidAmount;
    private Date applyTime;
    private Date publishTime;

    public BidRequestBean(){}

    public BidRequestBean(Integer id, Integer bidRequestType, Integer bidRequestState, Integer bidRequestAmount, BigDecimal currentRate, Integer monthes2Return, Integer bidCount, Integer totalRewardAmount, BigDecimal currentSum, String title, String description, String note, Date disableDate, Integer disableDays, BigDecimal minBidAmount, Date applyTime, Date publishTime) {
        this.id = id;
        this.bidRequestType = bidRequestType;
        this.bidRequestState = bidRequestState;
        this.bidRequestAmount = bidRequestAmount;
        this.currentRate = currentRate;
        this.monthes2Return = monthes2Return;
        this.bidCount = bidCount;
        this.totalRewardAmount = totalRewardAmount;
        this.currentSum = currentSum;
        this.title = title;
        this.description = description;
        this.note = note;
        this.disableDate = disableDate;
        this.disableDays = disableDays;
        this.minBidAmount = minBidAmount;
        this.applyTime = applyTime;
        this.publishTime = publishTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBidRequestType() {
        return bidRequestType;
    }

    public void setBidRequestType(Integer bidRequestType) {
        this.bidRequestType = bidRequestType;
    }

    public Integer getBidRequestState() {
        return bidRequestState;
    }

    public void setBidRequestState(Integer bidRequestState) {
        this.bidRequestState = bidRequestState;
    }

    public Integer getBidRequestAmount() {
        return bidRequestAmount;
    }

    public void setBidRequestAmount(Integer bidRequestAmount) {
        this.bidRequestAmount = bidRequestAmount;
    }

    public BigDecimal getCurrentRate() {
        return currentRate;
    }

    public void setCurrentRate(BigDecimal currentRate) {
        this.currentRate = currentRate;
    }

    public Integer getMonthes2Return() {
        return monthes2Return;
    }

    public void setMonthes2Return(Integer monthes2Return) {
        this.monthes2Return = monthes2Return;
    }

    public Integer getBidCount() {
        return bidCount;
    }

    public void setBidCount(Integer bidCount) {
        this.bidCount = bidCount;
    }

    public Integer getTotalRewardAmount() {
        return totalRewardAmount;
    }

    public void setTotalRewardAmount(Integer totalRewardAmount) {
        this.totalRewardAmount = totalRewardAmount;
    }

    public BigDecimal getCurrentSum() {
        return currentSum;
    }

    public void setCurrentSum(BigDecimal currentSum) {
        this.currentSum = currentSum;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Date getDisableDate() {
        return disableDate;
    }

    public void setDisableDate(Date disableDate) {
        this.disableDate = disableDate;
    }

    public Integer getDisableDays() {
        return disableDays;
    }

    public void setDisableDays(Integer disableDays) {
        this.disableDays = disableDays;
    }

    public BigDecimal getMinBidAmount() {
        return minBidAmount;
    }

    public void setMinBidAmount(BigDecimal minBidAmount) {
        this.minBidAmount = minBidAmount;
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }
}
