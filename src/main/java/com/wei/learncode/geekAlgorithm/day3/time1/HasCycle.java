package com.wei.learncode.geekAlgorithm.day3.time1;

/**
 * @author skye
 * @version 1.0
 * @description:  https://leetcode-cn.com/problems/linked-list-cycle/
 * @date 2021/1/25 15:15
 */
public class HasCycle {

    //用hash表解决
    /*public boolean hasCycle(ListNode head) {
        Set<ListNode> seen = new HashSet<ListNode>();
        while (head != null) {
            if (!seen.add(head)) {
                return true;
            }
            head = head.next;
        }
        return false;
    }*/
    //龟兔赛跑(双指针)
    public boolean hasCycle(ListNode head) {

        if(head == null || head.next == null){
            return false;
        }
        ListNode slow = head;
        ListNode quick = head.next;
        while(slow != quick){
            if(quick == null || quick.next == null){
                return false;
            }
            slow = slow.next;
            quick = quick.next.next;
        }
        return true;
    }
}
