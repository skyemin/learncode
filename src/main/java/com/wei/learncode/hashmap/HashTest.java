package com.wei.learncode.hashmap;

/**
 * @Author: skye
 * @Date: 2020/7/28 17:43
 * @Description:
 * @Version:1.0lru
 */
public class HashTest {

    public static void main(String[] args) {
        int hash = 5;
        //当数组长度为2^n时,直接取模和对长度减1取与结果一样,位运算效率比较高
        int n = 8;
        System.out.println(hash % n);
        System.out.println(hash & (n-1));
        //int为4字节32位,hash值与hash值右移16位做异或,得到的值能充分体现出高16位和低16位的特征,避免hash冲突
        System.out.println(hash ^ hash >>> 16);

        //resize操作
    }
}
