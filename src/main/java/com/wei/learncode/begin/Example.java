package com.wei.learncode.begin;

/**
 * @Author: skye
 * @Date: 2020/10/15 16:39
 * @Description:
 * @Version:1.0
 */
public class Example {
    String str = new String("good");
    char[] ch = {'a','b','c'};

    public static void main(String[] args) {
        Example ex = new Example();
        ex.change(ex.str,ex.ch);
        System.out.print(ex.str+" and");
        System.out.print(ex.ch);
    }

    private void change(String str, char[] ch) {
        str = "test ok";
        ch[0] = 'g';
    }


}
