package com.wei.learncode.geekAlgorithm.day0715;

import org.apache.commons.digester.StackAction;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        Stack<ColocTreeNode> stack = new Stack<>();
        stack.push(new ColocTreeNode("white",root));
        while (!stack.empty()){
            ColocTreeNode pop = stack.pop();
            if("white".equals(pop.color)){
                if(pop.treeNode.right != null){
                    stack.push(new ColocTreeNode("white",pop.treeNode.right));
                }
                stack.push(new ColocTreeNode("gray",pop.treeNode));
                if(pop.treeNode.left != null){
                    stack.push(new ColocTreeNode("white",pop.treeNode.left));
                }
            }else{
                result.add(pop.treeNode.val);
            }
        }
        return result;
    }


    class ColocTreeNode{
        String color;
        TreeNode treeNode;

        public ColocTreeNode(String color, TreeNode treeNode) {
            this.color = color;
            this.treeNode = treeNode;
        }
    }
}
