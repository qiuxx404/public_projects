package com.qiuxx.java.base.designpattern.abstractfactorypattern;

/**
 * 衣服枚举类--将所有的衣服类别列举出来
 * JDK1.5开始引入enum类型，目的在于吸引程序员转过来
 */
public enum ClothesEnum {

    MaleSuit("com.qiuxx.java.base.designpattern.abstractfactorypattern.clothesimpl.sex.MaleSuit"),

    FemaleSuit("com.qiuxx.java.base.designpattern.abstractfactorypattern.clothesimpl.sex.FemaleSuit"),

    MaleDownJackets("com.qiuxx.java.base.designpattern.abstractfactorypattern.clothesimpl.sex.MaleDownJackets"),

    FemaleDownJackets("com.qiuxx.java.base.designpattern.abstractfactorypattern.clothesimpl.sex.FemaleDownJackets"),

    MaleSportwear("com.qiuxx.java.base.designpattern.abstractfactorypattern.clothesimpl.sex.MaleSportwear"),

    FemaleSportwear("com.qiuxx.java.base.designpattern.abstractfactorypattern.clothesimpl.sex.FemaleSportwear");

    private String value = "";

    private ClothesEnum(String value){
        this.value = value;
    }

    public String getValue(){
        return this.value;
    }
}
