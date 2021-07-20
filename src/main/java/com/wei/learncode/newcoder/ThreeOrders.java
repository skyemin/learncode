package com.wei.learncode.newcoder;


import java.util.ArrayList;
import java.util.List;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/7/12 16:48
 */
public class ThreeOrders {

    List<Integer> pre = new ArrayList<>();
    List<Integer> in = new ArrayList<>();
    List<Integer> post = new ArrayList<>();

    public int[][] threeOrders (TreeNode root) {
        // write code here
        if(root == null) return null;
        List<List<Integer>> res = new ArrayList<>();
        preOrder(root);
        inOrder(root);
        postOrder(root);
        res.add(pre);
        res.add(in);
        res.add(post);
        int[][] resArray = new int[res.size()][res.get(0).size()];
        for (int i = 0; i < res.size(); i++) {
            for (int j = 0; j < res.get(0).size(); j++) {
                resArray[i][j] = res.get(i).get(j);
            }
        }
        return resArray;
    }

    private void preOrder(TreeNode root){
        if(root == null) return;
        pre.add(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }
    private void inOrder(TreeNode root){
        if(root == null) return;
        inOrder(root.left);
        in.add(root.val);
        inOrder(root.right);
    }
    private void postOrder(TreeNode root){
        if(root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        post.add(root.val);
    }

      class TreeNode {
       int val = 0;
       TreeNode left = null;
       TreeNode right = null;
     }
}
