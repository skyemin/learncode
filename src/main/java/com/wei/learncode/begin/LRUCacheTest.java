package com.wei.learncode.begin;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: skye
 * @Date: 2020/8/15 15:05
 * @Description:
 * @Version:1.0
 */
public class LRUCacheTest {

    //双向链表
    class DoubleLinkNode{

        int key;
        int value;
        DoubleLinkNode prev,next;
        public DoubleLinkNode(){};
        public DoubleLinkNode(int key,int value){
            this.key = key;
            this.value = value;
        }
    }


    private int size;
    private int capacity;
    private Map<Integer,DoubleLinkNode> cache = new HashMap<>();
    private DoubleLinkNode head,tail;

    //初始化
    public LRUCacheTest(int capacity){
        this.size = 0;
        this.capacity = capacity;
        this.head = new DoubleLinkNode();
        this.tail = new DoubleLinkNode();
    }

    public int get(int key){
        if(cache.get(key) == null){
            return -1;
        }else{
            moveToHead(cache.get(key));
            return cache.get(key).value;
        }
    }
    public void set(int key,int value){

        if(cache.get(key) == null){
            //缓存中没有,创建节点,把当前元素放到最前面
            DoubleLinkNode node = new DoubleLinkNode(key,value);
            //TODO:放在队列最前
            addToHead(node);
            cache.put(key,node);
            size++;
            if(size > capacity){
                //超过容量,移除队尾元素
                //TODO:移除队列最尾并返回key
                DoubleLinkNode tail = removeTail();
                cache.remove(tail.key);
                size--;
            }
        }else{
            DoubleLinkNode node = cache.get(key);
            node.value = value;
            //TODO:将节点移至队列头部
            moveToHead(node);
        }
    }

    private void removeNode(DoubleLinkNode node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
    private void moveToHead(DoubleLinkNode node) {
        removeNode(node);
        addToHead(node);
    }

    private DoubleLinkNode removeTail() {
        removeNode(tail.prev);
        return tail.prev;
    }

    private void addToHead(DoubleLinkNode node) {

        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
    }

    public void get(){

    }
}
