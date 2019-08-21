package com.wei.learncode.algorithm;

import javax.print.event.PrintJobListener;
import java.security.PrivateKey;

/**
 * @Author: weizz
 * @Date: 2019/8/13 17:13
 * @Description:
 * @Version:1.0
 */
public class Link {

   class Node{
       public int value;
       public Node next;
       public Node(int value){
           this.value = value;
       }
    }

    public Node reverseNode(Node head){
        Node next = null;
        Node pre = null;
        while (head != null){
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
}
