package com.wei.learncode.design.inter;

import java.util.Random;

/**
 * @Author: skye
 * @Date: 2020/2/21 11:27
 * @Description:
 * @Version:1.0
 */
public class RandomGenerator implements IdGenerator{
    @Override
    public Integer generate() {
        Random random = new Random();
        return random.nextInt();
    }
}
