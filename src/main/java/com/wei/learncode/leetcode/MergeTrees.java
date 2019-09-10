package com.wei.learncode.leetcode;

/**
 * @Author: weizz
 * @Date: 2019/9/10 11:28
 * @Description: 617. 合并二叉树
 * @Version:1.0
 */
public class MergeTrees {


    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1 == null )
            return t2;
        if(t2==null)
            return t1;
        t1.val+=t2.val;
        t1.left = mergeTrees(t1.left,t2.left);
        t1.right = mergeTrees(t1.right,t2.right);
        return t1;
    }
}
