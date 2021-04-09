package com.wei.learncode.begin;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/3/30 14:44
 */
public class ReverseString {

    public void reverseString(char[] s) {

        int left = 0;
        int right = s.length-1;
        while(left < right){
            char tmp = s[left];
            s[left] = s[right];
            s[right] = tmp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        ReverseString reverseString = new ReverseString();
        reverseString.reverseString(s);
        System.out.println(new String(s));
    }
}
