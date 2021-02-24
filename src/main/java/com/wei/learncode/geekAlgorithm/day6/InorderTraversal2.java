package com.wei.learncode.geekAlgorithm.day6;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/2/23 17:16
 */
public class InorderTraversal2 {

    //迭代
    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.isEmpty()){
            while (root != null){
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            res.add(root.val);
            root = root.right;
        }
        return res;
    }
}
