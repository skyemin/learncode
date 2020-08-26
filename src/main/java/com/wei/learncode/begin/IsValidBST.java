package com.wei.learncode.begin;

/**
 * @Author: skye
 * @Date: 2020/8/25 10:35
 * @Description:
 * @Version:1.0
 */
public class IsValidBST {

    long pre = Long.MIN_VALUE;
    public boolean isValidBST(TreeNode root) {

        if(root == null) return true;

        if(!isValidBST(root.left)){
            return false;
        }
        if(root.val <= pre){
            return false;
        }
        pre = root.val;
        return isValidBST(root.right);
    }
}
