package com.wei.learncode.geektime;

/**
 * @Author: skye
 * @Date: 2019/11/10 10:53
 * @Description:
 * @Version:1.0
 */
public class Test {
    public static void main(String[] args) {
        String str1= "abc";
        String str2= new String("abc");
        String str3= str2.intern();
        System.out.println(str1==str2);
        System.out.println(str2==str3);
        System.out.println(str1==str3);
        str1.split(",");
    }
}
