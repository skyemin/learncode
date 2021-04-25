package com.wei.learncode.newcoder;

import com.wei.learncode.geekAlgorithm.day6.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/4/25 10:29
 */
public class ZigzagLevelOrder {

    public ArrayList<ArrayList<Integer>> zigzagLevelOrder (TreeNode root) {
        // write code here
        // write code here
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque();
        if(root != null){
            queue.add(root);
        }
        while (!queue.isEmpty()){
            int n = queue.size();
            LinkedList<Integer> level = new LinkedList<>();
            for (int i = 0; i < n; i++) {
                TreeNode node = queue.poll();
                if(res.size() % 2 == 0){
                    level.addLast(node.val);
                }else{
                    level.addFirst(node.val);
                }
                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }
            }
            res.add(new ArrayList<>(level));
        }
        return res;
    }
}
