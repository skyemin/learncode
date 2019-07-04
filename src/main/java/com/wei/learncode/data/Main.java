package com.wei.learncode.data;

import java.util.LinkedList;

/**
 * @Author: weizz
 * @Date: 2019/6/6 9:37
 * @Description:
 * @Version:1.0
 */
public class Main {

    public static void main(String[] args) {
        int [][] a = {{1,2,3,4},{5,6,7}};
        int [] b = new int[0];
        int [] c = new int[10];
        b = c;
        b[2] = 10;
        System.out.println(b.length);
        /*for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.println(a[i][j]);
            }
        }*/
    }
}
