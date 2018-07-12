package com.qiuxx.java.base.designpattern.abstractfactorypattern.clothesfactoryimpl.sex;

import com.qiuxx.java.base.designpattern.abstractfactorypattern.Clothes;
import com.qiuxx.java.base.designpattern.abstractfactorypattern.ClothesEnum;
import com.qiuxx.java.base.designpattern.abstractfactorypattern.clothesfactoryimpl.AbstractClothesFactory;

/**
 * @Description: 男性服装制造工厂
 * @Author: qiuxx
 * @Date: 13:16 2018/6/18
 */
public class MaleClothesFactory extends AbstractClothesFactory {

    @Override
    public Clothes createSuit() {
        return super.createClothes(ClothesEnum.MaleSuit);
    }

    @Override
    public Clothes createDownJackets() {
        return super.createClothes(ClothesEnum.MaleDownJackets);
    }

    @Override
    public Clothes createSportwear() {
        return super.createClothes(ClothesEnum.MaleSportwear);
    }
}
