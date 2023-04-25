package com.wei.learncode.leetcode;

public class IsPalindrome {

    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        int cur = 0;
        int num = x;
        while (num != 0){
            cur = cur * 10 + num%10;
            num = num / 10;
        }
        return x == cur;
    }

    public static void main(String[] args) {

        IsPalindrome isPalindrome = new IsPalindrome();
        System.out.println(isPalindrome.isPalindrome(123));
    }
}
