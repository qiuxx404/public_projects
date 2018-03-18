package com.qiuxx.common.web.entity;

import java.io.Serializable;

/**
 * @Description: 枚举表实体
 * @Author: qiuxx
 * @Date: 16:37 2018/3/18
 */
public class CfgEnumDict implements Serializable {
    private static final long serialVersionUID = -4035766134392453000L;

    /**
     * 枚举主键id
     */
    private Long enumId;
    /**
     * 枚举名称
     */
    private String enumName;
    /**
     * 枚举类型
     */
    private String enumType;
    /**
     * 枚举值
     */
    private String enumValue;
    /**
     * 枚举显示值
     */
    private String enumTxt;
    /**
     * 枚举排序字段
     */
    private Integer enumSort;
    /**
     * 枚举备注
     */
    private String remake;
    /**
     * 枚举有效状态 -1删除 0冻结 1有效
     */
    private Integer state;
    /**
     * 删除标志 N未删除 Y已删除
     */
    private String isDeleted;
    /**
     * 最后修改管理员ID
     */
    private Long mngId;
    /**
     * 最后操作人
     */
    private String operator;
    /**
     * 博客url请求数，每请求一次，加1
     */
    private Long statisticsNum;

    public Long getEnumId() {
        return enumId;
    }

    public void setEnumId(Long enumId) {
        this.enumId = enumId;
    }

    public String getEnumName() {
        return enumName;
    }

    public void setEnumName(String enumName) {
        this.enumName = enumName;
    }

    public String getEnumType() {
        return enumType;
    }

    public void setEnumType(String enumType) {
        this.enumType = enumType;
    }

    public String getEnumValue() {
        return enumValue;
    }

    public void setEnumValue(String enumValue) {
        this.enumValue = enumValue;
    }

    public String getEnumTxt() {
        return enumTxt;
    }

    public void setEnumTxt(String enumTxt) {
        this.enumTxt = enumTxt;
    }

    public Integer getEnumSort() {
        return enumSort;
    }

    public void setEnumSort(Integer enumSort) {
        this.enumSort = enumSort;
    }

    public String getRemake() {
        return remake;
    }

    public void setRemake(String remake) {
        this.remake = remake;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Long getMngId() {
        return mngId;
    }

    public void setMngId(Long mngId) {
        this.mngId = mngId;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Long getStatisticsNum() {
        return statisticsNum;
    }

    public void setStatisticsNum(Long statisticsNum) {
        this.statisticsNum = statisticsNum;
    }
}
