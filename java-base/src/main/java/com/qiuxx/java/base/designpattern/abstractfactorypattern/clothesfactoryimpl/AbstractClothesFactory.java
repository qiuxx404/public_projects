package com.qiuxx.java.base.designpattern.abstractfactorypattern.clothesfactoryimpl;

import com.qiuxx.java.base.designpattern.abstractfactorypattern.Clothes;
import com.qiuxx.java.base.designpattern.abstractfactorypattern.ClothesEnum;
import com.qiuxx.java.base.designpattern.abstractfactorypattern.ClothesFactory;

/**
 * @Description: 抽象制衣厂
 * @Author: qiuxx
 * @Date: 12:55 2018/6/18
 */
public abstract class AbstractClothesFactory implements ClothesFactory {

    public Clothes createClothes(ClothesEnum clothesEnum) {

        Clothes clothes = null;

        //如果传递不是一个Enum中具体的Element的话，则不处理
        if (!clothesEnum.getValue().equals("")){
            try {
                //直接产生一个实例
                clothes = (Clothes) Class.forName(clothesEnum.getValue()).newInstance();
            } catch (Exception e) {
                //以为使用了enum，这种异常请款是不会发生的，除非enum有问题
                e.printStackTrace();
            }
        }
        return clothes;
    }
}
