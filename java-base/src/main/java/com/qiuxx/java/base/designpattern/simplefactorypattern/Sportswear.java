package com.qiuxx.java.base.designpattern.simplefactorypattern;

/**
 * @Description: 运动衣
 * @Author: qiuxx
 * @Date: 22:16 2018/6/17
 */
public class Sportswear implements Clothes {

    @Override
    public void clothingCategory() {
        System.out.println("类别：运动衣");
    }

    @Override
    public void applicableOccasion() {
        System.out.println("适合运动时间穿着");
    }
}
