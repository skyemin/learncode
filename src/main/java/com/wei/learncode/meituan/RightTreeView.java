package com.wei.learncode.meituan;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RightTreeView {

    public static void main(String[] args) {


        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(5);

        RightTreeView view = new RightTreeView();
        List<Integer> list = view.rightTreeView(root);
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }



    static class TreeNode{
        TreeNode left;
        TreeNode right;
        int val;
        TreeNode(int val){
            this.val = val;
        }
    }

    public List<Integer> rightTreeView(TreeNode root){
        List<Integer> result = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int level = queue.size();
            for(int i=0;i<level;i++){
                TreeNode node = queue.poll();
                //check当前层最后一个节点
                if(i == level-1){
                    result.add(node.val);
                }
                //放入左右子树
                if(node.left != null){
                    queue.offer(node.left);
                }
                if(node.right != null){
                    queue.offer(node.right);
                }
            }
        }
        return result;
    }
}
