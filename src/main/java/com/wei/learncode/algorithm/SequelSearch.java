/*
 * Copyright 2018 Shanxi Lu'an Taihang Laihui Net Tech co.,LTD.
 */
package com.wei.learncode.algorithm;

/**
 * Description:
 *
 * @author wzz
 * @since: 1.0
 * Create Date Time: 2018/11/26 11:14
 * Update Date Time:
 */
public class SequelSearch {
    public static void main(String[] arg) {
    }
    public static int search(int[] a, int num) {
        for(int i = 0; i < a.length; i++) {
            if(a[i] == num){//如果数据存在
                return i;//返回数据所在的下标，也就是位置
            }
        }
        return -1;//不存在的话返回-1
    }
}
