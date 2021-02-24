package com.wei.learncode.geekAlgorithm.day6;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/2/23 16:57
 */
public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
    }
}
