package com.wei.learncode.design.decorator2;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/1/4 10:51
 */
public class FlyCarDecorator extends CarDecorator{
    public FlyCarDecorator(Car car) {
        super(car);
    }
    @Override
    public void run() {
        car.run();
        flyRun();
    }

    private void flyRun() {
        System.out.println("开启飞行模式");
    }
}
