package com.wei.learncode.newcoder;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/4/16 17:56
 */
public class GetLongestPalindrome {

    //判断字符串是否回文
    public boolean isPalindromic(String s) {
        int len = s.length();
        for (int i = 0; i < len / 2; i++) {
            if (s.charAt(i) != s.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public int getLongestPalindrome(String A, int n) {

        int max = 0;
        String v;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j <= n ; j++) {
                String tmp = A.substring(i,j);
                if(isPalindromic(tmp) && tmp.length()>max){
                    max = tmp.length();
                }
            }
        }
        return max;
    }
}
