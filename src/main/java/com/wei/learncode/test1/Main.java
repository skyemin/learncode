package com.wei.learncode.test1;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: skye
 * @Date: 2020/9/9 20:52
 * @Description:
 * @Version:1.0
 */
public class Main {

    List<String> result = new ArrayList<>();
    public List<String> getThesis(int n){
        if(n <= 0){
            return result;
        }
        getV("",n,n);
        return result;
    }
    private void getV(String str,int left,int right){
        //end
        if(left ==0 && right == 0){
            result.add(str);
            return;
        }
        if(left == right){
            getV(str+"(",left-1,right);
        }else if(left < right){
            //左右都可选
            if(left>0){
                getV(str+"(",left-1,right);
            }
            getV(str+")",left,right-1);
        }
    }
    public static void main(String[] args) {
        Main main = new Main();
        List<String> thesis = main.getThesis(3);
        thesis.forEach(lang -> System.out.println(lang));
    }
}
