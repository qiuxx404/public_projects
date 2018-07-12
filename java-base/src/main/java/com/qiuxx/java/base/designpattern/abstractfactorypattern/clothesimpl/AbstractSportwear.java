package com.qiuxx.java.base.designpattern.abstractfactorypattern.clothesimpl;

import com.qiuxx.java.base.designpattern.abstractfactorypattern.Clothes;

/**
 * @Description: 运动衣--抽象实现类
 * @Author: qiuxx
 * @Date: 12:39 2018/6/18
 */
public abstract class AbstractSportwear implements Clothes {

    @Override
    public void clothingCategory() {
        System.out.println("类别：运动衣");
    }

    @Override
    public void applicableOccasion() {
        System.out.println("适合运动时间穿着");
    }
}
