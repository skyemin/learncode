package com.wei.learncode.design.adapt.begin;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: skye
 * @Date: 2020/8/19 14:20
 * @Description: 树的中序遍历
 * @Version:1.0
 */
public class InOrderTraversal {

      class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode(int x) { val = x; }
      }
    public List<Integer> inorderTraversal(TreeNode root) {

          List<Integer> result = new ArrayList<>();
          helper(root,result);
          return result;
    }

    private void helper(TreeNode root, List<Integer> result) {
        //中序遍历:左根右
        if(root != null){
            if(root.left != null){
                helper(root.left,result);
            }
            result.add(root.val);
            if(root.right != null){
                helper(root.right,result);
            }
        }
    }
}
