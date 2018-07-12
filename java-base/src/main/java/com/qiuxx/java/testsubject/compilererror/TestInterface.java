package com.qiuxx.java.testsubject.compilererror;

/**
 * @Description:
 * @Author: qiuxx
 * @Date: 10:32 2018/6/25
 */
public interface TestInterface {

   // private int getArea();//编译失败，不允许private 默认都只能为public abstract

    public float getVol(float x);

    public void main(String[] args);

    //public static void main(String[] args);//不能有静态方法，（静态方法必须实现）

    boolean setFlag(Boolean[] test);
}
