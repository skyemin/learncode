package com.wei.learncode.newcoder;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/4/28 10:13
 */
public class MaxsumofSubarray {

    public int maxsumofSubarray (int[] arr) {

       int n = arr.length;
       if(n == 0){
           return 0;
       }
       int[] res = new int[n];
       res[0] = arr[0];
       int max  = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(res[i-1]>0){
                res[i] = res[i-1]+arr[i];
            }else{
                res[i] = arr[i];
            }
            max = Math.max(max,res[i]);
        }
        return max;
    }
}
