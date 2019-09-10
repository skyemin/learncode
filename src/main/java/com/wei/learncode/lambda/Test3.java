package com.wei.learncode.lambda;

import java.util.function.Function;

/**
 * @Author: weizz
 * @Date: 2019/8/29 9:44
 * @Description:
 * @Version:1.0
 */
public class Test3 {
    public static void main(String[] args) {
        String newStr = strHandler("abc",(str)->str.toUpperCase());
        System.out.println(newStr);
        newStr = strHandler("  abc  ",(str)->str.trim());
        System.out.println(newStr);
    }
    //Function 函数式接口：R apply(T t);
    public static String strHandler(String str, Function<String,String> fun){ // 欢迎关注订阅号 Web项目聚集地
        return fun.apply(str);
    }
}