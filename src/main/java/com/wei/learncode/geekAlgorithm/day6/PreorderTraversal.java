package com.wei.learncode.geekAlgorithm.day6;

import java.util.ArrayList;
import java.util.List;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/2/23 17:51
 */
public class PreorderTraversal {

    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> res = new ArrayList<>();
        preorder(root,res);
        return res;
    }
    //前序遍历:根-左-右
    private void preorder(TreeNode root, List<Integer> res) {

        if(root == null){
            return;
        }
        res.add(root.val);
        preorder(root.left,res);
        preorder(root.right,res);
    }
}
