package com.wei.learncode.leetcode;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2020/11/24 16:21
 */
public class HahMapResize {


    //比如size=4,1%4=1,5%4=1,9%4=1,size扩容到8,1%8=1,5$8=5,9%8=1
    //如果hash&oldCap为0,不用动,放lo链表
    //如果hash&oldCap不为0,放hi链表
    //参考:https://www.codenong.com/jsa0e02fce06d2/
    //第一次遍历,loHead=e;loTail=e,两者指向同一块内存地址
    //第二次遍历,loTail.next=e;loTail=e;相当于先head.next=e,然后loTail和head.next指向同一个地址

    public static void main(String[] args) {
        ListNode tab = new ListNode(0);
        tab.next = new ListNode(1);
        tab.next.next = new ListNode(2);
        tab.next.next.next = new ListNode(3);
        tab.next.next.next.next = new ListNode(4);
        ListNode loHead = null, loTail = null;
        ListNode hiHead = null, hiTail = null;
        ListNode next;
        ListNode e = tab;
        do {
            next = e.next;
            if ((int)e.val % 2 == 0) { // 进入次判断的节点为 0,2,4,6,8
                if (loTail == null)
                    loHead = e;
                else
                    loTail.next = e;
                loTail = e;
            }
            if ((int)e.val % 2 == 1) {
                if (hiTail == null)
                    hiHead = e;
                else
                    hiTail.next = e;
                hiTail = e;
            }
        } while ((e = next) != null);
    }
}
