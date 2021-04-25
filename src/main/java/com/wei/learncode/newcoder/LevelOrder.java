package com.wei.learncode.newcoder;

import com.wei.learncode.geekAlgorithm.day6.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/4/25 10:17
 */
public class LevelOrder {

    public ArrayList<ArrayList<Integer>> levelOrder (TreeNode root) {
        // write code here
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque();
        if(root != null){
            queue.add(root);
        }
        while (!queue.isEmpty()){
            int n = queue.size();
            ArrayList<Integer> level = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                TreeNode node = queue.poll();
                level.add(node.val);
                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }
            }
            res.add(level);
        }
        return res;
    }
}
