package com.qiuxx.java.base.byteshortcharint;

/**
 * @Description: short隐式转换
 * @Author: qiuxx
 * @Date: 13:06 2018/6/2
 */
public class ShortImplicitConversion {

    public static void main(String[] args){
        short s1 = 1;
        //s1 = s1+1;//编译时错误
        s1+=1;
        System.out.println("s1+=1后s1值为： "+s1);
    }

    /**
     *     对于short s1=1;s1=s1+1;由于s1+1运算时会自动提神表达式的类型，所以结果是int型，
     * 再赋值给short类型s1时，编译器将报告需要强制转换类型的错误
     *      对于short s1=1；s1+=1；由于+=是java语言规定的运算符，java编译器对它会进行特殊处理，所以是正确编译
     */
}
