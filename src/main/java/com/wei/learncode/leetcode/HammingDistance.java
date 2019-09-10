package com.wei.learncode.leetcode;

/**
 * @Author: weizz
 * @Date: 2019/9/10 15:05
 * @Description: 两个整数之间的汉明距离指的是这两个数字对应二进制位不同的位置的数目。
 * @Version:1.0
 */
public class HammingDistance {

    /*先将两个数异或运算得到n，那么n里面1的个数就是结果，如果n不为0，那么n至少有一位是1。
    如果n减1，那么原来处在整数最右边的1就会变为0，原来在1后面的所有的0都会变成1。其余所有位将不会受到影响。
    这样右边这部分的&运算结果就为0，然后循环*/
    public int hammingDistance(int x, int y) {
        int n=x^y;
        int count=0;
        while(n!=0){
            count++;
            n=n&(n-1);
        }
        return count;
    }
}
