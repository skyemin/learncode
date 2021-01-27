package com.wei.learncode.geekAlgorithm.day3.time2;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/1/26 18:04
 */
public class MaxArea {

    //最大盛水面积
    /*public int maxArea(int[] height) {
        //穷举
        int max = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i+1; j < height.length; j++) {
                max = Math.max((j-i)*Math.min(height[i],height[j]),max);
            }
        }
        return max;
    }*/

    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int max = 0;
        while (i<j){
            max = height[i]<height[j]?Math.max(max,(j-i)*height[i++]):Math.max(max,(j-i)*height[j--]);
        }
        return max;
    }
}
