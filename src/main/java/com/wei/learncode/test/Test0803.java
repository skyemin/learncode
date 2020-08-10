package com.wei.learncode.test;

/**
 * @Author: skye
 * @Date: 2020/8/3 17:44
 * @Description:
 * @Version:1.0
 */
public class Test0803 {

    public static void main(String[] args) {

        char[] a = {'a','c','d','f','g'};
        char[] b = {'a','c','d','g'};

        if(b.length == 0){
            System.out.println(a[0]);
        }
        for (int i = 0; i < b.length; i++) {
            if(a[i] != b[i]){
                System.out.println(a[i]);
                break;
            }
        }
        /*Map map = new HashMap();
        for (int i = 0; i < b.length; i++) {
            map.put(b[i],0);
        }
        for (int i = 0; i < a.length; i++) {
            if(map.get(a[i]) == null){
                System.out.println(a[i]);
                break;
            }
        }*/
    }
}
