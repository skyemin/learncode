package com.wei.learncode.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @Author: weizz
 * @Date: 2019/8/29 9:45
 * @Description:
 * @Version:1.0
 */
public class Test4 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello","jiangshuying","lambda","www","ok","q");
        List<String> ret = filterStr(list,(str)->str.length()>2);
        System.out.println(ret);
    }
    //Predicate 断言式接口：boolean test(T t);
    public static List<String> filterStr(List<String> list, Predicate<String> pre){
        ArrayList<String> arrayList = new ArrayList<>();
        for(String str:list){
            if(pre.test(str)) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }
}
