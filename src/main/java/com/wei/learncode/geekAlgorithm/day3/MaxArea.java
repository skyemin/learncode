package com.wei.learncode.geekAlgorithm.day3;

/**
 * @author skye
 * @version 1.0
 * @description:  https://leetcode-cn.com/problems/container-with-most-water/
 * @date 2021/1/25 12:47
 */
public class MaxArea {

    //[1,8,6,2,5,4,8,3,7]
    //穷举法
    /*public int maxArea(int[] height) {
        int max = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i+1; j < height.length; j++) {
                max = Math.max((j-i)*Math.min(height[i],height[j]),max);
            }
        }
        return max;
    }*/

    //双指针
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length-1;
        int max = 0;
        while(i<j){
            max = height[i]<height[j]?Math.max(max,(j-i)*height[i++]):Math.max(max,(j-i)*height[j--]);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] height = {4,3,2,1,4};
        MaxArea maxArea = new MaxArea();
        System.out.println(maxArea.maxArea(height));
    }
}
