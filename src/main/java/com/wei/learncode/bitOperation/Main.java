package com.wei.learncode.bitOperation;

/**
 * @Author: weizz
 * @Date: 2019/5/30 14:19
 * @Description:
 * @Version:1.0
 */
public class Main {

    public static  String testNum(int i){
        /*if(i%2==0){
            return "偶数";
        }else{
            return  "奇数";
        }*/

        //&与操作.两个都为1才为1,其余情况为0
        if((100 & 1) == 0){
            return "偶数";
        }else{
            return "奇数";
        }
    }
    //^异或操作,相同为0.不同为1
    public static void testChange(){
        int x = 300;
        int y = 300;
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println(x);
        System.out.println(y);
    }
    //任何数与其本身异或结果为0,任何数与0异或结果为1
    public static void find(){
        int[] array = {1,2,3,4,5,4,3,2,1};
        int num = array[0];
        for (int i = 1; i < array.length; i++) {
            num ^= array[i];
        }
        System.out.println(num);
    }
    public static void main(String[] args) {
        testChange();
    }
}
