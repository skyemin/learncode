package com.wei.learncode.design.decorator2;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/1/4 10:51
 */
public class Main {

    public static void main(String[] args) {

        Car benzCar = new BenzCar();
        Car teslaCar = new TeslaCar();

        CarDecorator autoCarDecorator = new AutoCarDecorator(teslaCar);
        CarDecorator flyCarDecorator = new FlyCarDecorator(benzCar);
        autoCarDecorator.run();
        flyCarDecorator.run();
    }
}
