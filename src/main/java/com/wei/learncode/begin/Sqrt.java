package com.wei.learncode.begin;

/**
 * @Author: skye
 * @Date: 2020/8/13 19:17
 * @Description:  求平方根
 * @Version:1.0
 */
public class Sqrt {

    public static void main(String[] args) {
        System.out.println(sqrt(8));
    }

    public static int sqrt(int num){

        int start = 0;
        int end = num;
        int middle;
        while(start < end){
            middle = start + (end -1)/2;
            if(middle * middle == num){
                return middle;
            }
            if((middle * middle) > num){
                end = middle - 1 ;
            }else{
                start = middle + 1;
            }
        }
        return start;
    }
}
