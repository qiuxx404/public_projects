package com.qiuxx.java.base.designpattern.abstractfactorypattern.clothesfactoryimpl.sex;

import com.qiuxx.java.base.designpattern.abstractfactorypattern.Clothes;
import com.qiuxx.java.base.designpattern.abstractfactorypattern.ClothesEnum;
import com.qiuxx.java.base.designpattern.abstractfactorypattern.clothesfactoryimpl.AbstractClothesFactory;

/**
 * @Description: 女性服装制造厂
 * @Author: qiuxx
 * @Date: 13:18 2018/6/18
 */
public class FemaleClothesFactory extends AbstractClothesFactory {

    @Override
    public Clothes createSuit() {
        return super.createClothes(ClothesEnum.FemaleSuit);
    }

    @Override
    public Clothes createDownJackets() {
        return super.createClothes(ClothesEnum.FemaleDownJackets);
    }

    @Override
    public Clothes createSportwear() {
        return super.createClothes(ClothesEnum.FemaleSportwear);
    }
}
