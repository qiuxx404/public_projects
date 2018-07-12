package com.qiuxx.java.base.designpattern.abstractfactorypattern.clothesimpl;

import com.qiuxx.java.base.designpattern.abstractfactorypattern.Clothes;

/**
 * @Description: 羽绒服--抽象实现类
 * @Author: qiuxx
 * @Date: 12:39 2018/6/18
 */
public abstract class AbstractDownJackets implements Clothes {

    @Override
    public void clothingCategory() {
        System.out.println("类别：羽绒服");
    }

    @Override
    public void applicableOccasion() {
        System.out.println("适合寒冷的冬季，保暖、抗寒");
    }
}
