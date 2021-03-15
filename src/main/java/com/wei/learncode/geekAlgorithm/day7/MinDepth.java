package com.wei.learncode.geekAlgorithm.day7;

import com.wei.learncode.geekAlgorithm.day6.TreeNode;

/**
 * @author skye
 * @version 1.0
 * @description: https://leetcode-cn.com/problems/minimum-depth-of-binary-tree/solution/li-jie-zhe-dao-ti-de-jie-shu-tiao-jian-by-user7208/
 * @date 2021/3/1 15:31
 */
public class MinDepth {

    public int minDepth(TreeNode root) {

        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return 1;
        }
        int m1 = minDepth(root.left);
        int m2 = minDepth(root.right);
        if(root.left == null || root.right == null){
            return m1+m2+1;
        }
        return Math.min(m1,m2)+1;
    }
}
