package com.wei.learncode.newcoder;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/5/17 13:52
 */
public class Solve {

    public String solve (String str) {
        // write code here
        char[] res = str.toCharArray();
        for (int i = 0; i < str.length()/2; i++) {
            char tmp = res[i];
            res[i] = res[str.length()-1-i];
            res[str.length()-1-i]  = tmp;
        }
        return new String(res);
    }
}
