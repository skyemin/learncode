package com.wei.learncode.basic;

/**
 * @Author: skye
 * @Date: 2019/11/22 11:43
 * @Description:
 * @Version:1.0
 */
public class Out {
    private int a;
    public class In{
        public int b;
        public void test(){
            System.out.println(this.b);
            System.out.println(Out.this.a);
        }
    }

    public static void main(String[] args) {
        Out out = new Out();
        In in = out.new In();
        in.test();
    }
}
