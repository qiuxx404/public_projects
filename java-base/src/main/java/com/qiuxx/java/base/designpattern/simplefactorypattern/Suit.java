package com.qiuxx.java.base.designpattern.simplefactorypattern;

/**
 * @Description: 西装
 * @Author: qiuxx
 * @Date: 22:16 2018/6/17
 */
public class Suit implements Clothes {

    @Override
    public void clothingCategory() {
        System.out.println("类别：西装");
    }

    @Override
    public void applicableOccasion() {
        System.out.println("适合商务洽谈、重要会议等");
    }
}
