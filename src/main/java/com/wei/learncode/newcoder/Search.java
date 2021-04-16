package com.wei.learncode.newcoder;

/**
 * @author skye
 * @version 1.0
 * @description:  [1,2,2,4]  https://segmentfault.com/a/1190000016825704
 * @date 2021/4/16 16:57
 */
public class Search {

    public int search (int[] nums, int target) {

        int left = 0,right = nums.length-1;
        int mid;
        while (left < right){
            mid = (right-left)/2+left+1;
            if(target >= nums[mid]){
                left = mid;
            }else{
                right = mid - 1;
            }
        }
        return nums[right] == target?right:-1;
    }

    public static void main(String[] args) {

        Search search = new Search();
        System.out.println(search.search(new int[]{1, 2,2,2,2,2,2, 2, 4}, 2));
    }
}
