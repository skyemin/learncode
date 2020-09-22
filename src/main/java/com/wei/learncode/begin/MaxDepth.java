package com.wei.learncode.begin;

/**
 * @Author: skye
 * @Date: 2020/8/25 10:52
 * @Description: 树的最大深度
 * @Version:1.0
 */
public class MaxDepth {

    public static int maxDepth(TreeNode root) {

        if(root == null) {
            return 0;
        } else {
            int left = maxDepth(root.left);
            int right = maxDepth(root.right);
            return Math.max(left, right) + 1;
        }
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(3);
        TreeNode root1 = new TreeNode(9);
        TreeNode root2 = new TreeNode(20);
        TreeNode root3 = new TreeNode(15);
        root.left = root1;
        root.right = root2;
        root.right.left = root3;
        System.out.println(maxDepth(root));
    }
}
