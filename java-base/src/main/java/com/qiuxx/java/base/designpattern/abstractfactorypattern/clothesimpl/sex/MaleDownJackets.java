package com.qiuxx.java.base.designpattern.abstractfactorypattern.clothesimpl.sex;

import com.qiuxx.java.base.designpattern.abstractfactorypattern.clothesimpl.AbstractDownJackets;

/**
 * @Description: 男性羽绒服
 * @Author: qiuxx
 * @Date: 12:43 2018/6/18
 */
public class MaleDownJackets extends AbstractDownJackets {

    @Override
    public void applicableSex() {
        System.out.println("适用人群--男性");
    }
}
