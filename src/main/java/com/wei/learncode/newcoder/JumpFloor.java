package com.wei.learncode.newcoder;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/4/29 11:08
 */
public class JumpFloor {

    public int jumpFloor(int target) {
        if(target <= 2){
            return target;
        }
        int a = 1,b = 2,c = 0;
        for (int i = 3; i <= target; i++) {
                c = a+b;
                a = b;
                b = c;
        }
        return c;
    }
}
