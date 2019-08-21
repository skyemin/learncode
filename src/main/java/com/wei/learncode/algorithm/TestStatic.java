package com.wei.learncode.algorithm;

/**
 * @Author: weizz
 * @Date: 2019/8/21 14:39
 * @Description:
 * @Version:1.0
 */
public class TestStatic {

    public  static Test test = new Test();
    public static class Test{
        public Test(){
            System.out.println("Test初始化...");
        }
        public void test(){
            System.out.println(111);
        }
    }

    public static void main(String[] args) {
        test.test();
        test.test();
    }
}
