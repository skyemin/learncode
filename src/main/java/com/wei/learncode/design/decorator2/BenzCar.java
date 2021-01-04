package com.wei.learncode.design.decorator2;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/1/4 10:41
 */
public class BenzCar implements Car{
    @Override
    public void run() {
        System.out.println("奔驰开车了!!!");
    }
}
