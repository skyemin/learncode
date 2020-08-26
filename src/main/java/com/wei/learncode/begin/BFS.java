package com.wei.learncode.begin;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Author: skye
 * @Date: 2020/8/26 14:51
 * @Description: 广度优先
 * @Version:1.0
 */
public class BFS {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> allResults = new ArrayList<>();
        if (root == null) {
            return allResults;
        }
        Queue<TreeNode> nodes = new LinkedList<>();
        nodes.add(root);
        while (!nodes.isEmpty()) {

            int size = nodes.size();
            List<Integer> results = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = nodes.poll();
                results.add(node.val);
                if(node.left != null){
                    nodes.add(node.left);
                }
                if(node.right != null){
                    nodes.add(node.right);
                }
            }
            allResults.add(results);
            /*int size = nodes.size();
            List<Integer> results = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = nodes.poll();
                results.add(node.val);
                if (node.left != null) {
                    nodes.add(node.left);
                }
                if (node.right != null) {
                    nodes.add(node.right);
                }
            }
            allResults.add(results);*/
        }
        return allResults;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode root1 = new TreeNode(9);
        TreeNode root2 = new TreeNode(20);
        TreeNode root3 = new TreeNode(15);
        root.left = root1;
        root.right = root2;
        root.right.left = root3;
        BFS bfs = new BFS();
        bfs.levelOrder(root).forEach(lang -> System.out.println(lang));
    }

}
