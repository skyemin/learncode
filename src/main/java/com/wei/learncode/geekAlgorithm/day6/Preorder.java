package com.wei.learncode.geekAlgorithm.day6;

import java.util.ArrayList;
import java.util.List;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/2/24 16:54
 */
public class Preorder {

    List<Integer> res = new ArrayList<Integer>();
    public List<Integer> preorder(Node root) {
        if(root == null){
            return res;
        }
        res.add(root.val);
        for (Node child : root.children) {
            preorder(child);
        }
        return res;
    }

    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };
}
