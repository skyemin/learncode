package com.wei.learncode.classloard;

/**
 * @Author: weizz
 * @Date: 2019/4/29 9:55
 * @Description:
 * @Version:1.0
 */
public class Test {
    private static Test test = new Test();
    private static int a = 0;
    private static int b;
    private Test(){
        a++;
        b++;
    }

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(b);
    }
}
