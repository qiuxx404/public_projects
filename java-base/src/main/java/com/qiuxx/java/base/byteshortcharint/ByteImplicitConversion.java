package com.qiuxx.java.base.byteshortcharint;

/**
 * @Description: byte隐式转换为Int
 * @Author: qiuxx
 * @Date: 12:59 2018/6/2
 */
public class ByteImplicitConversion {

    public static void main(String[] arg){
        byte a=1;
        byte b=3;
        byte c = (byte)(a+b);//byte c=a+b;//编译便报错
        byte d=1+3;
        //byte f=127+1;//编译时报错，byte型的变量，共占8个2进制位，其值的范围是：－128～127
        System.out.println("结果c ==> "+c);
        System.out.println("结果d ==> "+d);
    }

    /**
     * byte a=1;
     byte b=3;
     byte c=a+b;
     byte d=1+3;
     为什么byte c=a+b;这个不对。byte d=1+3;这个却没有错误

     解答：

     +操作会将变量转成int
     1+3编译器会自动转成4
     -做加法运算的时候，数据类型是首先转变成int,这样就对了：byte c=(byte)(a+b);
     Java中涉及byte、short和char类型的运算操作首先会把这些值转换为int类型，然后对int类型值进行运算，最后得到int类型的结果。
     因此，如果把两个byte类型值相加，最后会得到一个int类型的结果。如果需要得到byte类型结果，必须将这个int类型的结果显式转换为byte类型。
     计算机中数值进行运算的时候可能会发生溢出错误。例如，byte型的变量，共占8个2进制位，其值的范围是：－128～127，
     如果两个值为127的byte型变量相乘，结果会怎么样呢?所以，像byte这种值域很小的变量类型，要限制保存结果用的变量的类型。
     byte a=1;
     byte b=3;
     byte c=(byte)a+b;
     1+3的结果在－128～127之间，所以没有溢出，也就没有发生错误，如果改成byte d＝127＋127；
     就会发生错误了，空间不能容下这么大的数。其实这个与相关的编译器有关的。
     */
}
