package com.wei.learncode.begin;

/**
 * @Author: skye
 * @Date: 2020/9/14 20:00
 * @Description: 最长回文子串
 * @Version:1.0
 */
public class LongestPalindrome {

    public boolean isPalindromic(String s) {
        int len = s.length();
        for (int i = 0; i < len / 2; i++) {
            if (s.charAt(i) != s.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }

    // 暴力解法
    public String longestPalindrome(String s) {
        String ans = "";
        int max = 0;
        int len = s.length();
        for (int i = 0; i < len; i++)
            for (int j = i + 1; j <= len; j++) {
                String test = s.substring(i, j);
                if (isPalindromic(test) && test.length() > max) {
                    ans = test;
                    max = test.length();
                }
            }
        return ans;
    }
}
