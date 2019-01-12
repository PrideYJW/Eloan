package com.eloan.pojo;

import java.io.Serializable;
/*
数据字典
 */
public class SystemDictionaryBean implements Serializable {

    private Integer id;
    private String sn;	//编码
    private String title; //名称
    private String intro; //简介

    public SystemDictionaryBean(){}

    public SystemDictionaryBean(Integer id, String sn, String title, String intro) {
        this.id=id;
        this.sn = sn;
        this.title = title;
        this.intro = intro;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    @Override
    public String toString() {
        return "SystemDictionaryBean{" +
                "sn='" + sn + '\'' +
                ", title='" + title + '\'' +
                ", intro='" + intro + '\'' +
                '}';
    }
}
