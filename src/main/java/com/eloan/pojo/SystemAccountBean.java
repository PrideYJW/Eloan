package com.eloan.pojo;

import com.eloan.util.BidConst;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class SystemAccountBean implements Serializable {
    private Integer id;
    private Date beginDate;
    private Date endDate;
    private Date createdate;
    private BigDecimal totalbalanc= BidConst.ZERO;
    private BigDecimal freezedamount=BidConst.ZERO;

    public SystemAccountBean(){}

    public SystemAccountBean(Integer id, Date beginDate, Date endDate, Date createdate, BigDecimal totalbalanc, BigDecimal freezedamount) {
        this.id = id;
        this.beginDate = beginDate;
        this.endDate = endDate;
        this.createdate = createdate;
        this.totalbalanc = totalbalanc;
        this.freezedamount = freezedamount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public BigDecimal getTotalbalanc() {
        return totalbalanc;
    }

    public void setTotalbalanc(BigDecimal totalbalanc) {
        this.totalbalanc = totalbalanc;
    }

    public BigDecimal getFreezedamount() {
        return freezedamount;
    }

    public void setFreezedamount(BigDecimal freezedamount) {
        this.freezedamount = freezedamount;
    }
}
