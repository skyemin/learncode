package com.wei.learncode.begin;

/**
 * @Author: skye
 * @Date: 2020/9/1 16:41
 * @Description:  打家劫舍   输入：[1,2,3,1]  输出：4
 * @Version:1.0
 */
public class Rob {

   /* public int rob(int[] nums) {

        if(nums.length == 0){
            return 0;
        }
        //数组标识每一步的最大值
        int[][] datas = new int[nums.length][2];
        //1.找重复性
        //2.定义状态
        //3.dp方程
        //0:不偷  1:偷
        datas[0][0] = 0;
        datas[0][1] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            //不偷第i个
            datas[i][0] = Math.max(datas[i-1][0],datas[i-1][1]);
            //偷第i个
            datas[i][1] = datas[i-1][0] + nums[i];
        }
        return Math.max(datas[nums.length-1][0],datas[nums.length-1][1]);
    }*/
   public int rob(int[] nums) {


       //定义状态
       //a[i] 从0到第i天必偷的最大值
       int n = nums.length;
       if(n == 0){
           return 0;
       }
       if(n == 1){
           return nums[0];
       }
       int[] a = new int[n];
       a[0] = nums[0];
       a[1] =  Math.max(nums[0],nums[1]);
       int res = a[1];
       for (int i = 2; i < n; i++) {
           a[i] = Math.max(a[i-1],a[i-2]+nums[i]);
            res = Math.max(a[i],res);
       }
       return res;
   }

}
