package com.wei.learncode.algorithm;

/**
 * @Author: weizz
 * @Date: 2019/7/25 10:43
 * @Description:输出1-100之间的素数(只能被1和自己本身整除的数  1  3  5  7  11)
 * @Version:1.0
 */
public class SuShu {

    public static void main(String[] args) {

        for(int i = 3;i <= 100;i++){
            boolean flag = true;
            //16   只需要判断4能否被除就行了
            for(int j = 2;j <= Math.sqrt(i);j++){
                //可以整除,说明不是素数
                if(i % j == 0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println(i);
            }
        }
    }
}
