package com.wei.learncode.jvm;

/**
 * @Author: weizz
 * @Date: 2019/4/21 17:40
 * @Description:
 * @Version:1.0
 */
public class Test {

    static int a;
    public static void count(){
        try {
            a++;
            count();
        } catch (Exception e) {
            System.out.println("最大深度:"+a);
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
       count();
    }
}
