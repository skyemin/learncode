package com.wei.learncode.basic;

/**
 * @Author: weizz
 * @Date: 2019/7/8 17:58
 * @Description:
 * @Version:1.0
 */
public class BasicType {

    public static void main(String[] args) {
        //byte(8 bit) char(16) short(16) int(32) long(64) float(64) double(64) boolean(-)
        Integer x = 2;  //装箱
        int y = x;      //拆箱

        Integer a = new Integer(123);
        Integer b = new Integer(123);
        System.out.println(a == b);
        // -128到127   Integer.valueOf()会放到缓存池
        Integer c = Integer.valueOf(129);
        Integer d = Integer.valueOf(129);
        System.out.println(c == d);

        //自动装箱会调用valueOf()
        Integer e = 121;
        Integer f = 121;
        System.out.println(e ==f);

        String str1 = "123";
        String str2 = "123456";
        String str3 = str1+"456";
        System.out.println(str2 == str3);
    }

    public void test(){
    }
}
