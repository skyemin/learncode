package com.wei.learncode.geekAlgorithm.day6;

import java.util.ArrayList;
import java.util.List;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/2/24 17:02
 */
public class Postorder {

    List<Integer> res = new ArrayList<>();
    public List<Integer> postorder(Node root) {

        if(root == null){
            return res;
        }
        for (Node child : root.children) {
            postorder(child);
        }
        res.add(root.val);
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
