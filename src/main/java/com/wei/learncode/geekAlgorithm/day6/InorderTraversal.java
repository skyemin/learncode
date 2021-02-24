package com.wei.learncode.geekAlgorithm.day6;

import java.util.ArrayList;
import java.util.List;

/**
 * @author skye
 * @version 1.0
 * @description: https://leetcode-cn.com/problems/binary-tree-inorder-traversal/solution/er-cha-shu-de-zhong-xu-bian-li-by-leetcode-solutio/
 * @date 2021/2/23 16:56
 */
public class InorderTraversal {

    //中序遍历 左-根-右
    public List<Integer> inorderTraversal(TreeNode root) {

       List<Integer> res = new ArrayList<>();
       inorder(root,res);
       return res;
    }

    public void inorder(TreeNode root, List<Integer> res) {

       if(root == null){
           return;
       }
       inorder(root.left,res);
       res.add(root.val);
       inorder(root.right,res);
    }
}
