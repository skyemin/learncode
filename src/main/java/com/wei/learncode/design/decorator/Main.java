package com.wei.learncode.design.decorator;

/**
 * @Author: weizz
 * @Date: 2019/3/20 16:58
 * @Description:
 * @Version:1.0
 */
public class Main {

    public static void main(String[] args) {
        Bread bread = new Bread(new Cream(new Food("香肠")));
        System.out.println(bread.make());
    }
}
