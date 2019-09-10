package com.wei.learncode.leetcode;

import sun.reflect.generics.tree.Tree;

/**
 * @Author: weizz
 * @Date: 2019/9/10 15:21
 * @Description:
 * @Version:1.0
 */
public class InvertTree {

    public TreeNode invertTree(TreeNode root){
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
