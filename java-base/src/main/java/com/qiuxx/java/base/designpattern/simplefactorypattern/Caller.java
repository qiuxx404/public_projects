package com.qiuxx.java.base.designpattern.simplefactorypattern;

/**
 * @Description:  调用方（main方法）
 * @Author: qiuxx
 * @Date: 22:04 2018/6/17
 */
public class Caller {

    public static void main(String[] args){
        System.out.println("------------生产西装--------");
        Clothes suit = ClothesFactory.createClothes(Suit.class);
        suit.clothingCategory();
        suit.applicableOccasion();

        System.out.println("------------生产羽绒服--------");
        Clothes downJackets = ClothesFactory.createClothes(DownJackets.class);
        downJackets.clothingCategory();
        downJackets.applicableOccasion();

        System.out.println("------------生产运动衫--------");
        Clothes sportswear = ClothesFactory.createClothes(Sportswear.class);
        sportswear.clothingCategory();
        sportswear.applicableOccasion();
    }
}
