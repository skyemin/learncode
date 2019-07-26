package com.wei.learncode.algorithm;

/**
 * @Author: weizz
 * @Date: 2019/7/25 17:38
 * @Description:
 * @Version:1.0
 */
public class ReverseLink {

    private static Node head;

    public static void reverse(){
        if(head == null || head.next == null){
            return;
        }
        Node p1 = head;
        Node p2 = head.next;
        Node p3 = null;
        while (p2 != null){
            p3 = p2.next;
            p2.next = p1;
            p1 = p2;
            p2 = p3;
        }
        head.next = null;
        head = p1;
    }
    private class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }
}
