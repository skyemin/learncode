package com.wei.learncode;

import java.util.Optional;

/**
 * @Author: skye
 * @Date: 2020/6/3 10:07
 * @Description:
 * @Version:1.0
 */
public class Test {


    public static boolean test(){
        Test test = new Test();
        Optional.ofNullable(test).ifPresent(c -> {
            for (int i = 0; i < 5; i++) {
                if(i == 1){
                    return;
                }
            }
        });
        System.out.println(3333);
        return true;
    }

    public static void main(String[] args) {
        System.out.println(test());
    }
}
