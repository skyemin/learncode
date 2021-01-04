package com.wei.learncode.design.decorator2;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/1/4 10:46
 */
public class CarDecorator implements Car{
    protected Car car;
    public CarDecorator(Car car){
        this.car = car;
    }
    @Override
    public void run() {
        car.run();
    }
}
