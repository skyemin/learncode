package com.wei.learncode;

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

       /* TestFee testFee = new TestFee();
        System.out.println(testFee.calculate(30));*/
        StringJoiner stringJoiner = new StringJoiner(" | ");
        stringJoiner.add("朝阳区");
        stringJoiner.add("酒仙桥自如寓");
        stringJoiner.add("距14号线将台地铁站2146米");
        System.out.println(stringJoiner.toString());
    }
}
