package com.qiuxx.java.base.designpattern.abstractfactorypattern.clothesimpl.sex;

import com.qiuxx.java.base.designpattern.abstractfactorypattern.clothesimpl.AbstractSuit;

/**
 * @Description: 女性西装
 * @Author: qiuxx
 * @Date: 12:43 2018/6/18
 */
public class FemaleSuit extends AbstractSuit {

    @Override
    public void applicableSex() {
        System.out.println("适用人群--女性");
    }
}
