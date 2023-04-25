package com.wei.learncode;

import com.google.common.collect.Range;
import com.google.common.collect.RangeMap;
import com.google.common.collect.TreeRangeMap;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;
import java.util.StringJoiner;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/3/17 15:40
 */
public class TestFee {


    public int calculate(int num){
        int price = 0;
        int[] degree = {0,5,20,50,100,500,1000,2000,3000,4000,5000,6000};
        int[] fee = {30,15,10,9,8,7,6,5,4,3,2,1};

        for (int i = 1; i < degree.length; i++) {
            if(num <= degree[i]){
                price += (num-degree[i-1])*fee[i-1];
                break;
            }else{
                price += ((degree[i]-degree[i-1])*fee[i-1]);
            }
        }
        return price;
    }
    public static void main(String[] args) {

        Double a = 1.0;
        Double b = 1.0;
        System.out.println(a==b);
        BigDecimal rentPrice = BigDecimal.valueOf(1299);
        Integer waveValue = null;
        //rentPrice.multiply(BigDecimal.valueOf(waveValue)).divide(BigDecimal.valueOf(1E2), RoundingMode.HALF_UP);


        RangeMap<Integer, Integer> waveMap = TreeRangeMap.create();
        waveMap.put(Range.closed(0, 1), 2);
        System.out.println(waveMap.get(0));
        System.out.println(waveMap.get(1));
        System.out.println(waveMap.get(3));
       /* TestFee testFee = new TestFee();
        System.out.println(testFee.calculate(30));*/
       /* StringJoiner stringJoiner = new StringJoiner(" | ");
        stringJoiner.add("朝阳区");
        stringJoiner.add("酒仙桥自如寓");
        stringJoiner.add("距14号线将台地铁站2146米");
        System.out.println(stringJoiner.toString());*/
    }
}
