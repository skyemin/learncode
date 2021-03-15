package com.wei.learncode.geekAlgorithm.day7;

import java.util.ArrayList;
import java.util.List;

/**
 * @author skye
 * @version 1.0
 * @description: https://leetcode-cn.com/problems/generate-parentheses/
 * @date 2021/3/1 11:44
 */
public class GenerateParenthesis {

    List<String> res = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        if(n <= 0){
            return res;
        }
        getParenthesis("",n,n);
        return res;
    }

    private void getParenthesis(String str,int left, int right) {
        if(left == 0 && right == 0 ){
            res.add(str);
            return;
        }
        if(left>0){
            getParenthesis(str+"(",left-1,right);
        }
        if(right>0){
            getParenthesis(str+")",left,right-1);
        }
    }
    public static void main(String[] args) {
        GenerateParenthesis g = new GenerateParenthesis();
        g.generateParenthesis(3).forEach(lang -> System.out.println(lang));
    }
}
