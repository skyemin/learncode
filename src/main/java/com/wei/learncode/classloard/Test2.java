package com.wei.learncode.classloard;

/**
 * @Author: weizz
 * @Date: 2019/5/12 18:17
 * @Description:
 * @Version:1.0
 */
public class Test2 {

    private int a;
    private static int b;

    public void test(){
        System.out.println(this.a);
        System.out.println(this.b);
    }

    public static void main(String[] args) {
        Test2 t = new Test2();
        t.test();
    }
}
