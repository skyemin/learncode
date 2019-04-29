package com.wei.learncode.classloard;

import java.util.Random;

/**
 * @Author: weizz
 * @Date: 2019/4/29 9:10
 * @Description:
 * @Version:1.0
 */
public class Simple {
    static{
        System.out.println("我被初始化了");
    }
    public final static  int a = 10;
    public static final int b = new Random().nextInt(10);
    public static void test(){

    }
    public static void main(String[] args) {

    }
}
