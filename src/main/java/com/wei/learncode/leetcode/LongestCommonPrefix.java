package com.wei.learncode.leetcode;


/*https://leetcode.cn/problems/longest-common-prefix/
输入：strs = ["flower","flow","flight"]
        输出："fl"

输入：strs = ["dog","racecar","car"]
        输出：""
*/
public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        String str = strs[0];
        for (int i = 1; i < strs.length; i++) {
            int j = 0;
            while(j < str.length() && j < strs[i].length() && strs[i].charAt(j) == str.charAt(j)){
                j++;
            }
            str = str.substring(0,j);
        }
        return str;
    }
}
