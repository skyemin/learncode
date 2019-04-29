package com.wei.learncode.classloard;

/**
 * @Author: weizz
 * @Date: 2019/4/29 9:18
 * @Description:
 * @Version:1.0
 */
public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        //new对象
        //Simple s = new Simple();
        //调用静态变量(final修饰不会初始化)
        //System.out.println(Simple.a);
        //调用静态方法
        //test();
        //反射
        //Class.forName("com.wei.learncode.classloard.Simple");
        System.out.println(Simple.b);
    }
}
