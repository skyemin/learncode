package com.wei.learncode.design.adapt.begin;

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

        int m = text1.length();
        int n = text2.length();
        int[][] dp = new int[m+1][n+1];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                char c1 = text1.charAt(i);
                char c2 = text2.charAt(j);
                if(c1 == c2){
                    dp[i+1][j+1] = dp[i][j]+1;
                }else{
                    dp[i+1][j+1] = Math.max(dp[i][j+1],(dp[i+1][j]));
                }
            }
        }
        return dp[m][n];
    }
}
