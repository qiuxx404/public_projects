package com.qiuxx.java.base.designpattern.singletonpattern;

/**
 * @Description: 饱汉式,非线程安全
 *               优点是：写起来比较简单，当类SingletonTest被加载的时候，静态变量static的instance未被创建并分配内存空间
 *               ，当getInstance方法第一次被调用时，初始化instance变量，并分配内存，因此在某些特定条件下会节约了内存；
                 缺点是：并发环境下很可能出现多个SingletonTest实例。
 * @Author: qiuxx
 * @Date: 0:06 2018/6/6
 */
public class SatietySingleton {

    //定义私有构造方法（防止通过new SatietySingleton()去实例化
    private SatietySingleton() {
    }

    //定义一个SatietySingleton类型的变量（不初始化，注意这里没有使用final关键字）
    private static SatietySingleton instance;

    //定义一个静态的方法（调用时再初始化SatietySingleton，但是多线程访问时，可能造成重复初始化问题）
    public  static /**synchronized*/ SatietySingleton getInstance(){
        if (instance == null){
            instance = new SatietySingleton();
        }
        return instance;
    }
}
