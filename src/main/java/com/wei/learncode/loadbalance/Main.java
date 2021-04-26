package com.wei.learncode.loadbalance;

/**
 * @author skye
 * @version 1.0
 * @description:  https://www.jianshu.com/p/159fb7805147
 * @date 2021/4/25 17:52
 */
public class Main {
    public static void main(String[] args) {
        /**
         * 假设有三个服务器权重配置如下：
         * server A  weight = 4 ;
         * server B  weight = 3 ;
         * server C  weight = 2 ;
         */
        Node serverA = new Node("serverA", 4);
        Node serverB = new Node("serverB", 3);
        Node serverC = new Node("serverC", 2);

        SmoothWeightedRoundRobin smoothWeightedRoundRobin = new SmoothWeightedRoundRobin(serverA,serverB ,serverC);
        for (int i = 0; i < 7; i++) {
            Node i1 = smoothWeightedRoundRobin.select();
            System.out.println(i1.getServerName());
        }
    }
}
