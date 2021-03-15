package com.wei.learncode.geekAlgorithm.day7;

import com.wei.learncode.geekAlgorithm.day6.TreeNode;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/3/1 15:26
 */
public class MaxDepth {

    public int maxDepth(TreeNode root) {

        return root  == null?0:Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }
}
