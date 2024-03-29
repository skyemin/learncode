package com.wei.learncode.design.adapt.begin;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: skye
 * @Date: 2020/8/26 15:34
 * @Description: 生成合法括号
 * @Version:1.0
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
        if(left == right){
            //剩余左右括号数相等，下一个只能用左括号
            getParenthesis(str+"(",left-1,right);
        }else if(left < right){
            //剩余左括号小于右括号，下一个可以用左括号也可以用右括号
            if(left > 0){
                getParenthesis(str+"(",left-1,right);
            }
            if(right > 0){
                getParenthesis(str+")",left,right-1);
            }
        }
    }

    public static void main(String[] args) {
        GenerateParenthesis g = new GenerateParenthesis();
        g.generateParenthesis(3).forEach(lang -> System.out.println(lang));
    }
}
