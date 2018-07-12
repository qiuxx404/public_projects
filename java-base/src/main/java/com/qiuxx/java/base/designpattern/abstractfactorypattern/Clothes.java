package com.qiuxx.java.base.designpattern.abstractfactorypattern;

/**
 * @Description: 服装接口
 * @Author: qiuxx
 * @Date: 12:37 2018/6/18
 */
public interface Clothes {

    /**
     * 衣服名称
     */
    public void clothingCategory();

    /**
     * 适用场合
     */
    public void applicableOccasion();

    /**
     * 适用性别
     */
    public void applicableSex();
}
