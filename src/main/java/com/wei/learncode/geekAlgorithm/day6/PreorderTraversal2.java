package com.wei.learncode.geekAlgorithm.day6;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/2/23 17:54
 */
public class PreorderTraversal2 {

    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.isEmpty()){
            while (root != null){
                res.add(root.val);
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            root = root.right;
        }
        return res;
    }
}