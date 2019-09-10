package com.wei.learncode.leetcode;

/**
 * @Author: weizz
 * @Date: 2019/9/10 15:43
 * @Description:
 * @Version:1.0
 */
public class MaxDepth {

    public int maxDepth(TreeNode root){

        if(root == null){
            return 0;
        }
        int left_height = maxDepth(root.left);
        int right_height = maxDepth(root.right);
        return Math.max(left_height,right_height);
    }
}
