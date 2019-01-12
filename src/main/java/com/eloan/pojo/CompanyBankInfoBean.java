package com.eloan.pojo;

import java.io.Serializable;

public class CompanyBankInfoBean implements Serializable {
    private Integer id;
    private String bankname;
    private String accountname;
    private String banknumber;
    private String bankforkname;

    public CompanyBankInfoBean(){}

    public CompanyBankInfoBean(Integer id, String bankname, String accountname, String banknumber, String bankforkname) {
        this.id = id;
        this.bankname = bankname;
        this.accountname = accountname;
        this.banknumber = banknumber;
        this.bankforkname = bankforkname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    public String getAccountname() {
        return accountname;
    }

    public void setAccountname(String accountname) {
        this.accountname = accountname;
    }

    public String getBanknumber() {
        return banknumber;
    }

    public void setBanknumber(String banknumber) {
        this.banknumber = banknumber;
    }

    public String getBankforkname() {
        return bankforkname;
    }

    public void setBankforkname(String bankforkname) {
        this.bankforkname = bankforkname;
    }
}
