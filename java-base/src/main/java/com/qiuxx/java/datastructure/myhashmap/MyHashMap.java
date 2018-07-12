package com.qiuxx.java.datastructure.myhashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @Description: MyMap接口实现
 * @Author: qiuxx
 * @Date: 20:46 2018/6/27
 */
public class MyHashMap<K, V> implements MyMap<K,V> {

    //数组的默认初始化长度
    private static final int DEFAULT_INITIAL_CAPACITY = 1 << 4;
    //阙值比例
    private static final float DEFAULT_LOAD_FACTOR = 0.75f;

    private int defaultInitSize;
    private float defaultLoadFactor;

    //MAP当中entry的数量
    private int entryUseSize;

    //数组
    private Entry<K,V>[] table = null;

    /**
     * HashMap的要素之一，就是数组，自然在这里，我们要定义数组，
     * 数组的初始化大小，还要考虑到扩容的阙值
     */

    //=================================构造器 start=============================
    public MyHashMap(){
        this(DEFAULT_INITIAL_CAPACITY, DEFAULT_LOAD_FACTOR);
    }

    public MyHashMap(int defaultInitialCapacity, float defaultLoadFactor){

        if (defaultInitialCapacity < 0) {
            throw new IllegalArgumentException("Illegal initial capacity: "+defaultInitialCapacity);
        }

        if (defaultLoadFactor <= 0 || Float.isNaN(defaultLoadFactor)) {
            throw new IllegalArgumentException("Illegal load factor: "+defaultLoadFactor);
        }

        this.defaultInitSize = defaultInitialCapacity;
        this.defaultLoadFactor = defaultLoadFactor;

        table = new Entry[this.defaultInitSize];
    }

    /**
     * 仔细观察下发现，其实这里是用到了”门面模式“。
     * 这里的2个构造方法其实只想的是同一个，但是对外却暴露了2个”门面“！
     */

    //=================================构造器 end=============================

    /**
     * put实现
     */
    @Override
    public V put(K k, V v) {
        V oldValue = null;
        //是否需要扩容
        //扩容完毕 肯定需要重新散列
        if (entryUseSize >= defaultInitSize * defaultLoadFactor) {
            //resize(2 * defaultInitSize);
        }
        //得到HASH值，计算出数组中的位置
        int index = hash(k) & (defaultInitSize - 1);
        if (table[index] == null){
            table[index] = new Entry<>(k,v,null);
            ++entryUseSize;
        } else {//需要遍历单链表
            Entry<K,V> entry = table[index];
            Entry<K,V> e = entry;
            while (e != null){
                if (k == e.getKey() || k.equals(e.getKey())){
                    oldValue = e.value;
                    e.value = v;
                    return oldValue;
                }
                e = e.next;
            }
            table[index] = new Entry<K,V>(k,v,entry);
        }
        return oldValue;
    }

    /**
     * get 实现
     */
    @Override
    public V get(K k) {
        int index = hash(k) & (defaultInitSize - 1);
        if (table[index] == null){
            return null;
        } else {
            Entry<K,V> entry = table[index];
            do{
                if (k == entry.getKey() || k.equals(entry.getKey())){
                    return entry.value;
                }
                entry = entry.next;
            } while (entry != null);
        }
        return null;
    }

    //==================================Entry 实现 start ============================
    class Entry<K,V> implements MyMap.Entry<K,V> {

        private K key;
        private V value;
        private Entry<K,V> next;

        public Entry(){

        }

        public Entry(K key, V value, Entry<K,V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }

        @Override
        public K getKey() {
            return key;
        }

        @Override
        public V getValue() {
            return value;
        }
    }
    //==================================Entry 实现 end ============================
    /**
     * 扩容与hash实现
     * 第一、要考虑是否扩容？
     *     HashMap中的Entry的数量（数组以及单链表中的所有Entry）是否达到阙值？
     *
     * 第二、如果扩容，意味着新生成一个Entry[],不仅如此还得重新散列。
     *
     * 第三、要根据key计算出在Entry[]中的位置，定位后，入股Entry[]中的元素为null，
     *      那么可以直接放入其中，如果不为空，那么得先遍历单链表，对key进行 == 与 equals()的匹配
     *      如何匹配上了，则更新value，否则形成一个新的Entry”挤压：单链表！
     *
     * 注释：这里参考JDK的HashMap的hash函数的实现，这里也再次说明，要想散列均匀，
     *      就得进行二进制的位运算
     */

    /**
     * hash函数
     */
    private int hash(K k){
        int hashCode = k.hashCode();
        hashCode ^= (hashCode >>> 20) ^ (hashCode >>> 12);
        return hashCode ^ (hashCode >>> 7) ^ (hashCode >>> 4);
    }
    //JDK的HashMap提供的hash函数
    /*final int hash(Object k){
        int h = hashSeed;
        if (0 != h && k instanceof String) {
            return sun.misc.Hashing.stringHash32((String) k);
        }
        h ^= k.hashCode();
        //This function ensures that hashCodes that differ only by
        // constant multiples at each bit position have a bounded
        // number of collisions (approximately 8 at default load factor).
        h ^= (h >>> 20) ^ (h >>> 12);
        return h ^ (h >>> 7) ^ (h >>> 4);
    }*/

    /**
     * resize 方法
     */
    private void resize(int i) {
        Entry[] newTable = new Entry[i];
        //改变了数组的大小
        defaultInitSize = i;
        entryUseSize = 0;
        rehash(newTable);
    }

    /**
     * rehash方法
     */
    private void rehash(Entry<K,V>[] newTable){
        //得到原来老的Entry集合，注意遍历单链表
        List<Entry<K, V>> entryList = new ArrayList<Entry<K,V>>();
        for (Entry<K, V> entry : table){
            if (entry != null){
                do{
                    entryList.add(entry);
                    entry = entry.next;
                } while (entry != null);
            }
        }

        //覆盖旧的引用
        if (newTable.length > 0){
            table = newTable;
        }

        // 所谓的重新hash，就是重新put Entry到HashMap
        for (Entry<K,V> entry : entryList){
            put(entry.getKey(), entry.getValue());
        }
    }

    /**
     * 从这里可以看出，对于HashMap而言，如果频繁进行resize/rehash操作，实惠影响性能的。
     *
     * resize/rehash的过程，就是数组变大，原来数组中的entry元素一个个的put到新数组的
     * 过程，需要注意的是一些状态变量的改变。
     */
}
