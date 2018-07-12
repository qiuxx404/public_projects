package com.qiuxx.java.base.designpattern.abstractfactorypattern;

import com.qiuxx.java.base.designpattern.abstractfactorypattern.clothesfactoryimpl.sex.FemaleClothesFactory;
import com.qiuxx.java.base.designpattern.abstractfactorypattern.clothesfactoryimpl.sex.MaleClothesFactory;

/**
 * @Description: 调用方（main方法）
 * @Author: qiuxx
 * @Date: 13:21 2018/6/18
 */
public class Caller {

    public static void main(String[] args){
        //男性服装工厂
        ClothesFactory maleClothesFactory = new MaleClothesFactory();
        //女性服装工厂
        ClothesFactory femaleClothesFactory = new FemaleClothesFactory();

        //制造男性服装
        System.out.println("-------------制造男性西装-----------");
        Clothes maleSuit = maleClothesFactory.createSuit();
        maleSuit.clothingCategory();
        maleSuit.applicableOccasion();
        maleSuit.applicableSex();

        //制造女性服装
        System.out.println("-------------制造女性西装-----------");
        Clothes femaleSuit = femaleClothesFactory.createSuit();
        femaleSuit.clothingCategory();
        femaleSuit.applicableOccasion();
        femaleSuit.applicableSex();
    }
}
