package com.wei.learncode.lambda;

import java.util.ArrayList;
import java.util.function.Supplier;

/**
 * @Author: weizz
 * @Date: 2019/8/29 9:42
 * @Description:
 * @Version:1.0
 */
public class Test2 {
    public static void main(String[] args) {
        ArrayList<Integer> res = getNumList(10,()->(int)(Math.random()*100));
        System.out.println(res);
    }
    //Supplier供给型接口：T get();
    public static ArrayList<Integer> getNumList(int num, Supplier<Integer> sup){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            Integer e = sup.get();
            list.add(e);
        }
        return list;
    }
}
