package com.wei.learncode.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: weizz
 * @Date: 2019/8/8 10:19
 * @Description:
 * @Version:1.0
 */
public class Solution {
    public static class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) {
              val = x;
          }
    }
    /*static List<List<Integer>> levels = new ArrayList<List<Integer>>();
    public static void helper(TreeNode node, int level) {
        if (levels.size() == level){
            levels.add(new ArrayList<Integer>());
        }
        levels.get(level).add(node.val);
        // process child nodes for the next level
        if (node.left != null) {
            helper(node.left, level + 1);
        }
        if (node.right != null){
            helper(node.right, level + 1);
        }
    }*/

    /*public static List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return levels;
        helper(root, 0);
        return levels;
    }*/

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(3);
        treeNode.left.left = new TreeNode(4);
        treeNode.right.left = new TreeNode(5);
        test(treeNode);
    }
    public static void test(TreeNode treeNode){
        if(treeNode == null){
            return;
        }
        System.out.println(treeNode.val);
        test(treeNode.left);
        test(treeNode.right);
    }
}
