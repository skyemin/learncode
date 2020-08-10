package com.wei.learncode.test;

/**
 * @Author: skye
 * @Date: 2020/8/3 17:27
 * @Description:
 * @Version:1.0
 */
public class TestParseInt {

    public static void main(String[] args) {
        System.out.println(parse("456",10));
    }

   public static Integer parse(String s,int radix){

       int result = 0;
       boolean negative = false;
       int i = 0, len = s.length();
       int digit;
       if (len > 0) {
           char firstChar = s.charAt(0);
           if (firstChar < '0') {
               //判断正负
               if (firstChar == '-') {
                   negative = true;
                   i++;
               } else if (firstChar != '+'){
                    return null;
               }
               //只包含符号
               if (len == 1){
                   return null;
               }
               i++;
           }
           while (i < len) {
               //获取char的int值
               digit = Character.digit(s.charAt(i++),radix);
               result *= radix;
               result -= digit;
           }
       } else {
           return null;
       }
       return negative ? result : -result;
   }
}
