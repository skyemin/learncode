package com.wei.learncode.test0810;

/**
 * @Author: skye
 * @Date: 2020/8/10 17:23
 * @Description:
 * @Version:1.0
 */
public class MyInteger {


    public static Integer parseInt(String s,int radix){

        int i = 0;
        int result = 0;
        int len = s.length();
        int digit;
        boolean negative = false;
        if(len < 0){
            return null;
        }else{
            char c = s.charAt(0);
            if(c<'0'){
                if(c == '-'){
                    negative = true;
                }else if(c != '+'){
                    return null;
                }
                i++;
            }
            while(i<len){
                digit = Character.digit(s.charAt(i++), radix);
                result *= radix;
                result -= digit;
            }
            return negative?result:-result;
        }
    }

    public static void main(String[] args) {

        System.out.println(parseInt("-0",10));
    }
}
