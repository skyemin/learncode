package com.wei.learncode.leetcode;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2020/12/28 18:31
 */
public class Str {

    public int String(String a,String b){

        int s1 = a.length();
        int s2 = b.length();
        for (int i = 0; i < s1-s2+1; i++) {
            int j;
            for (j = 0; j < s2; j++) {
                if(a.charAt(i+j) != b.charAt(j)){
                    break;
                }
            }
            if(j == i){
                return i;
            }
        }
        return -1;
    }
}
