package com.wei.learncode.design.inter;

/**
 * @Author: skye
 * @Date: 2020/2/21 11:29
 * @Description:
 * @Version:1.0
 */
public class Main {

    public static void main(String[] args) {

        IdGenerator generator = new SequenceGenerator();
        System.out.println(generator.generate());
    }
}
