package com.wei.learncode.geekAlgorithm.day3.time2;


import com.wei.learncode.geekAlgorithm.day3.time1.ListNode;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/1/26 17:42
 */
public class HasCycle {

   /* public boolean hasCycle(ListNode head) {
        Set set = new HashSet();
        //判断列表是否有环
        while (head != null){
            if(set.contains(head)){
                return true;
            }
            set.add(head);
            head = head.next;

        }
        return false;
    }*/

    //快慢指针
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null){
            return false;
        }
        ListNode slow = head;
        ListNode quick = head.next;
        while (slow != quick){
            if(quick == null || quick.next == null){
                return false;
            }
            slow = slow.next;
            quick = quick.next.next;
        }
        return true;
    }
}
