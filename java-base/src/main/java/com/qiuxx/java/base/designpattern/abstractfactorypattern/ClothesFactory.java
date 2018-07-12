package com.qiuxx.java.base.designpattern.abstractfactorypattern;

/**
 * @Description: 制衣工厂
 * @Author: qiuxx
 * @Date: 12:49 2018/6/18
 */
public interface ClothesFactory {

    /**
     * 制造西装
     */
    public Clothes createSuit();

    /**
     * 制造羽绒服
     */
    public Clothes createDownJackets();

    /**
     * 制造运动衣
     */
    public Clothes createSportwear();
}
