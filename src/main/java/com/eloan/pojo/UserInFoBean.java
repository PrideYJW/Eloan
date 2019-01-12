package com.eloan.pojo;

import java.io.Serializable;

/*
  用户个人信息
 */
public class UserInFoBean implements Serializable {
    private Integer id;  //版本号
    private Long bitState;  //用户状态值
    private String realName;  //用户实名值
    private String idNumber; //用户身份证号
    private String phoneNumber;  //用户电话
    private SystemDictionaryItemBean incomeGrade; // 月收入
    private SystemDictionaryItemBean marriage; // 婚姻情况
    private SystemDictionaryItemBean kidCount; // 子女情况
    private SystemDictionaryItemBean educationBackground; // 学历
    private SystemDictionaryItemBean houseCondition; // 住房条件

    public UserInFoBean(){}

    public UserInFoBean(Integer id, Long bitState, String realName, String idNumber, String phoneNumber, SystemDictionaryItemBean incomeGrade, SystemDictionaryItemBean marriage, SystemDictionaryItemBean kidCount, SystemDictionaryItemBean educationBackground, SystemDictionaryItemBean houseCondition) {
        this.id = id;
        this.bitState = bitState;
        this.realName = realName;
        this.idNumber = idNumber;
        this.phoneNumber = phoneNumber;
        this.incomeGrade = incomeGrade;
        this.marriage = marriage;
        this.kidCount = kidCount;
        this.educationBackground = educationBackground;
        this.houseCondition = houseCondition;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getBitState() {
        return bitState;
    }

    public void setBitState(Long bitState) {
        this.bitState = bitState;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public SystemDictionaryItemBean getIncomeGrade() {
        return incomeGrade;
    }

    public void setIncomeGrade(SystemDictionaryItemBean incomeGrade) {
        this.incomeGrade = incomeGrade;
    }

    public SystemDictionaryItemBean getMarriage() {
        return marriage;
    }

    public void setMarriage(SystemDictionaryItemBean marriage) {
        this.marriage = marriage;
    }

    public SystemDictionaryItemBean getKidCount() {
        return kidCount;
    }

    public void setKidCount(SystemDictionaryItemBean kidCount) {
        this.kidCount = kidCount;
    }

    public SystemDictionaryItemBean getEducationBackground() {
        return educationBackground;
    }

    public void setEducationBackground(SystemDictionaryItemBean educationBackground) {
        this.educationBackground = educationBackground;
    }

    public SystemDictionaryItemBean getHouseCondition() {
        return houseCondition;
    }

    public void setHouseCondition(SystemDictionaryItemBean houseCondition) {
        this.houseCondition = houseCondition;
    }
}
