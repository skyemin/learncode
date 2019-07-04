package com.wei.learncode.data;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

/**
 * @Author: weizz
 * @Date: 2019/6/6 10:25
 * @Description:
 * @Version:1.0
 */
public class LRU {
    static LinkedList<String> linkedList = new LinkedList();
    static ArrayList<String> arrayList = new ArrayList<>();
    //链表实现
    public static void testLink(String name){
        //遍历链表,如果该值存在,删除该值,将新值插入到首部
        for (String o : linkedList) {
            if(o.equals(name)){
                linkedList.remove(o);
            }
        }
        linkedList.addFirst(name);
    }
    // 基于数组实现的顺序栈
    public class ArrayStack {
        private String[] items; // 数组
        private int count; // 栈中元素个数
        private int n; //栈的大小
        // 初始化数组，申请一个大小为n的数组空间
        public ArrayStack(int n) {
            this.items = new String[n];
            this.n = n;
            this.count = 0;
        }
        // 入栈操作
        public boolean push(String item) {
// 数组空间不够了，直接返回false，入栈失败。
            if (count == n) return false;
// 将item放到下标为count的位置，并且count加一
            items[count] = item;
            ++count;
            return true;
        }
        // 出栈操作
        public String pop() {
// 栈为空，则直接返回null
            if (count == 0) return null;
// 返回下标为count-1的数组元素，并且栈中元素个数count减一
            String tmp = items[count-1];
            --count;
            return tmp;
        }
    }

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("");
        testLink("张三");
        testLink("李四");
        testLink("张三");
        for (String o : linkedList) {
            System.out.println(o);
        }
    }
}
