package com.qiuxx.java.base.designpattern.abstractfactorypattern.clothesimpl;

import com.qiuxx.java.base.designpattern.abstractfactorypattern.Clothes;

/**
 * @Description: 西装--抽象实现类
 * @Author: qiuxx
 * @Date: 12:39 2018/6/18
 */
public abstract class AbstractSuit implements Clothes {

    @Override
    public void clothingCategory() {
        System.out.println("类别：西装");
    }

    @Override
    public void applicableOccasion() {
        System.out.println("适合商务洽谈、重要会议等");
    }
}
