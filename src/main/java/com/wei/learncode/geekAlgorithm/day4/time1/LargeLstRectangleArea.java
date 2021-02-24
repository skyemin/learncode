package com.wei.learncode.geekAlgorithm.day4.time1;

/**
 * @author skye
 * @version 1.0
 * @description:  https://leetcode-cn.com/problems/largest-rectangle-in-histogram/
 * @date 2021/2/2 14:01
 */
public class LargeLstRectangleArea {

    public int largestRectangleArea(int[] heights) {

        if(heights.length == 0){
            return 0;
        }
        int max = 0;
        for (int i = 0; i < heights.length; i++) {
            //找左边最后一个大于等于height[i]的下标
            int left = i;
            int current = heights[i];
            while(left>0 && heights[left-1] >= current){
                left--;
            }
            //找右边最后一个大于等于height[i]的下标
            int right = i;
            while(right<heights.length-1 && heights[right+1]>=current){
                right++;
            }
            max = Math.max(max,(right-left+1)*heights[i]);
        }
        return max;
    }
}
