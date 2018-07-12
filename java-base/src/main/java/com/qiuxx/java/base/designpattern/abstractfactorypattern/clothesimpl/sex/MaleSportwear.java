package com.qiuxx.java.base.designpattern.abstractfactorypattern.clothesimpl.sex;

import com.qiuxx.java.base.designpattern.abstractfactorypattern.clothesimpl.AbstractSportwear;

/**
 * @Description: 男性运动衣
 * @Author: qiuxx
 * @Date: 12:43 2018/6/18
 */
public class MaleSportwear extends AbstractSportwear {

    @Override
    public void applicableSex() {
        System.out.println("适用人群--男性");
    }
}
