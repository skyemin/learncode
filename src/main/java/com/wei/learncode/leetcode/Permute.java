package com.wei.learncode.leetcode;

import java.util.ArrayList;
import java.util.List;

/*https://leetcode.cn/problems/permutations/
给定一个不含重复数字的数组 nums ，返回其 所有可能的全排列 。你可以 按任意顺序 返回答案。
输入：nums = [1,2,3]
        输出：[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]*/
public class Permute {

    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> tmp = new ArrayList<>();
        traverse(tmp,nums);
        return res;
    }
    public void traverse(List<Integer> tmp,int[] nums){
        if(tmp.size() == nums.length){
            res.add(new ArrayList<Integer>(tmp));
            return;
        }

        for(int i: nums){
            //做选择
            if(!tmp.contains(i)){
                tmp.add(i);
                traverse(tmp,nums);
                tmp.remove(tmp.size()-1);
            }
        }
    }

    public static void main(String[] args) {
        Permute permute = new Permute();
        List<List<Integer>> list = permute.permute(new int[]{1, 2, 3});
        System.out.println("end...");
    }
}
