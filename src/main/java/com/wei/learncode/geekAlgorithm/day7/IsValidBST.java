package com.wei.learncode.geekAlgorithm.day7;

import com.wei.learncode.geekAlgorithm.day6.TreeNode;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/3/1 15:13
 */
public class IsValidBST {

    Long pre = Long.MIN_VALUE;
    public boolean isValidBST(TreeNode root) {

        if(root == null){
            return true;
        }
        if(!isValidBST(root.left)){
            return false;
        }
        if(root.val <= pre){
            return false;
        }
        pre = Long.valueOf(root.val);
        return isValidBST(root.right);
    }
}
