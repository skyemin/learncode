package com.wei.learncode.design.decorator2;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/1/4 10:48
 */
public class AutoCarDecorator extends CarDecorator{

    public AutoCarDecorator(Car car) {
        super(car);
    }

    @Override
    public void run() {
        car.run();
        autoRun();
    }

    private void autoRun() {
        System.out.println("开启自动驾驶");
    }
}
