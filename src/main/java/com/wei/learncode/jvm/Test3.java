package com.wei.learncode.jvm;

/**
 * @Author: weizz
 * @Date: 2019/7/8 9:41
 * @Description:
 * @Version:1.0
 */
public class Test3 {

    private static int num;
    private static int num2;

    static {
        num = 10;
    }

    public void test(){
        System.out.println(num2);
    }
    public static void main(String[] args) {
        Test3 test3 = new Test3();
        test3.test();
    }
}
