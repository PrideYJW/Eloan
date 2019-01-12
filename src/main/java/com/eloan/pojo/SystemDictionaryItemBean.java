package com.eloan.pojo;

import java.io.Serializable;

/*
 数据字典明细
 */
public class SystemDictionaryItemBean implements Serializable {
    private Integer id;
    private Long parentId;		// 系统目录
    private String title;		// 名称
    private String tvalue;		// 值
    private Integer sequence;	// 序列
    private String intro;		// 说明

    public SystemDictionaryItemBean(){}

    public SystemDictionaryItemBean(Integer id, Long parentId, String title, String tvalue, Integer sequence, String intro) {
        this.id=id;
        this.parentId = parentId;
        this.title = title;
        this.tvalue = tvalue;
        this.sequence = sequence;
        this.intro = intro;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTvalue() {
        return tvalue;
    }

    public void setTvalue(String tvalue) {
        this.tvalue = tvalue;
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }
}
