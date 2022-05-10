package com.wei.learncode;

import java.math.BigDecimal;

public class Test2 {

    public static void main(String[] args) {
        int a = 1555;
        BigDecimal b = new BigDecimal(a);
        double v = b.divide(new BigDecimal(1000)).setScale(1, BigDecimal.ROUND_HALF_UP).doubleValue();
        System.out.println(v);
    }
}
