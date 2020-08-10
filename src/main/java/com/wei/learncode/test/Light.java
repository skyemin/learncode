package com.wei.learncode.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: skye
 * @Date: 2020/7/22 12:02
 * @Description:
 * @Version:1.0
 */
public class Light {

    public static void main(String[] args) {
        boolean isOpen = true;
        List<Boolean> lightList = new ArrayList<>(101);
        for (int i = 0; i < 101; i++) {
            lightList.add(isOpen);
        }
        for (int i = 1; i <=100 ; i++) {
            for(int j = i;j<=100;j+=i){
                lightList.set(j,lightList.get(j)?false:true);
            }
        }
        List<Boolean> resultList = lightList.stream().filter(x -> x).collect(Collectors.toList());
        System.out.println(isOpen?resultList.size()-1:resultList.size());
    }
}
