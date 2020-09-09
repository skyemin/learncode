package com.wei.learncode.newcoder;

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(reverse(s));
    }

    /**
     * 反转句子
     *
     * @param sentence 原句子    I am a boy   boy a am I
     * @return 反转后的句子
     */
    public static String reverse(String sentence){
        String[] s = sentence.split(" ");
        String str = "";
        for (int i = s.length-1; i >= 0; i--) {
            str+=s[i]+" ";
        }
        return str;
    }
}
