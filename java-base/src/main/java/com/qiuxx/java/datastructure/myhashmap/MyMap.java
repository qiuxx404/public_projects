package com.qiuxx.java.datastructure.myhashmap;

/**
 * @Description: 定义Map接口
 *              定义一个接口，对外暴露快速存取ude方法。
 *              注意MyMap接口内部定义了一个接口接口Entry。
 * @Author: qiuxx
 * @Date: 20:39 2018/6/27
 */
public interface MyMap<K,V> {

    public V put(K k,V v);
    public V get(K k);

    interface Entry<K,V>{
        public K getKey();
        public V getValue();
    }

}
