package com.wei.learncode.begin;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author: skye
 * @Date: 2020/8/25 10:01
 * @Description: 翻转一棵二叉树
 * @Version:1.
 */
public class InvertTree {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    //递归方式
    public TreeNode invertTree1(TreeNode root) {

        if(root == null){
            return null;
        }
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }
    //迭代方式
    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return null;
        }
        Queue<TreeNode> queue = new LinkedList();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode treeNode = queue.poll();
            TreeNode tmp = treeNode.left;
            treeNode.left = treeNode.right;
            treeNode.right = tmp;
            if(treeNode.left != null) queue.add(treeNode.left);
            if(treeNode.right != null) queue.add(treeNode.right);
        }
        return root;
    }
}
