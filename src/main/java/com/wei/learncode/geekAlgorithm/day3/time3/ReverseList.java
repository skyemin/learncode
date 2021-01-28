package com.wei.learncode.geekAlgorithm.day3.time3;

import com.wei.learncode.geekAlgorithm.day3.time1.ListNode;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/1/28 16:41
 */
public class ReverseList {

    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        while (curr != null){
            ListNode tmp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tmp;
        }
        return prev;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        ListNode listNode = createList(arr);
        ReverseList reverseList = new ReverseList();
        ListNode listNode1 = reverseList.reverseList(listNode);
        printList(listNode1);
    }
    //创建链表(尾插法)
    public static ListNode createList(int[] arr)
    {
        if(arr.length == 0){
            return null;
        }
        ListNode head = new ListNode(arr[0]); // 头结点
        ListNode tail = head;
        for (int i = 1; i < arr.length; i++)
        {
            ListNode newNode = new ListNode(arr[i]);
            tail.next = newNode;
            tail = newNode;
        }
        return head;
    }
    //打印链表
    public static void printList(ListNode head)
    {
        while (head != null)
        {
            if (head.next == null)
                System.out.println(head.val);
            else
                System.out.print(head.val + " --> ");

            head = head.next;
        }
    }
}
