package com.wei.learncode.geekAlgorithm.day6;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/2/23 16:57
 */
public class TreeNode {

    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode() {}
    public TreeNode(int val) { this.val = val; }
    public TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
    }
}
