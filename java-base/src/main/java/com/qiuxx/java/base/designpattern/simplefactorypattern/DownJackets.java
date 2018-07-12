package com.qiuxx.java.base.designpattern.simplefactorypattern;

/**
 * @Description: 羽绒服
 * @Author: qiuxx
 * @Date: 22:16 2018/6/17
 */
public class DownJackets implements Clothes {

    @Override
    public void clothingCategory() {
        System.out.println("类别：羽绒服");
    }

    @Override
    public void applicableOccasion() {
        System.out.println("适合寒冷的冬季，保暖、抗寒");
    }
}
