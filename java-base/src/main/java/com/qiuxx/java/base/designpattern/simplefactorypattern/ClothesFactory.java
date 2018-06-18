package com.qiuxx.java.base.designpattern.simplefactorypattern;

/**
 * @Description: 服装工厂
 * @Author: qiuxx
 * @Date: 22:25 2018/6/17
 */
public class ClothesFactory {

    //定义一个制衣厂，将衣服类型传入，便制造出了衣服
    public static Clothes createClothes(Class c) {
        Clothes clothes = null;
        try {
            clothes = (Clothes) Class.forName(c.getName()).newInstance();//制造一件衣服
            return clothes;
        } catch (InstantiationException e) {
            System.out.println("必须指定好衣服类型");
        } catch (IllegalAccessException e) {
            System.out.println("衣服类型指定有误");
        } catch (ClassNotFoundException e) {
            System.out.println("指定衣服类型找不到");
        }
        return clothes;
    }
}
