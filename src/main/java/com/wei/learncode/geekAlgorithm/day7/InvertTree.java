package com.wei.learncode.geekAlgorithm.day7;

import com.wei.learncode.geekAlgorithm.day6.TreeNode;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/3/1 15:00
 */
public class InvertTree {

    public TreeNode invertTree(TreeNode root) {

        if(root == null){
            return null;
        }
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }
}
