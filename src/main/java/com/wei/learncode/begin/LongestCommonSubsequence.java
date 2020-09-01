package com.wei.learncode.begin;

/**
 * @Author: skye
 * @Date: 2020/8/28 16:41
 * @Description: 输入：text1 = "abcde", text2 = "ace"
                 * 输出：3
                 * 解释：最长公共子序列是 "ace"，它的长度为 3。
 * @Version:1.0
 */
public class LongestCommonSubsequence {

    public static void main(String[] args) {
        LongestCommonSubsequence l = new LongestCommonSubsequence();
        System.out.println(l.longestCommonSubsequence("pqrsvwf", "sqrypy"));
    }
    public int longestCommonSubsequence(String text1, String text2) {

        int num = 0;
        int tmp = 0;
        for (int i = 0; i < text2.length(); i++) {
            for (int j = 0; j < text1.length(); j++) {
                if(text2.charAt(i) == text1.charAt(j) && j>=tmp){
                    num++;
                    //在第几位
                    tmp = j;
                    break;
                }
            }
        }
        return num;
    }
}
