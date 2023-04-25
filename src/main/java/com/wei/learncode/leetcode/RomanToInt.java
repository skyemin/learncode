package com.wei.learncode.leetcode;


/*字符          数值
        I             1
        V             5
        X             10
        L             50
        C             100
        D             500
        M             1000

        来源：力扣（LeetCode）
        链接：https://leetcode.cn/problems/roman-to-integer
        著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/

public class RomanToInt {
    public int romanToInt(String s) {
        int sum = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            //和后面的比较大小
            if(i < chars.length-1){
                if(getValue(s.charAt(i)) < getValue(s.charAt(i+1))) {
                    sum -= getValue(s.charAt(i));
                }else{
                    sum += getValue(s.charAt(i));
                }
            }else{
                sum += getValue(s.charAt(i));
            }
        }
        return sum;
    }

    public int getValue(char s){
        switch (s){
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        RomanToInt romanToInt = new RomanToInt();
        System.out.println(romanToInt.romanToInt(""));
    }
}
