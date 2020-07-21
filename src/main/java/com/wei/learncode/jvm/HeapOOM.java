package com.wei.learncode.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: skye
 * @Date: 2020/7/20 16:50
 * @Description:
 * @Version:1.0
 */
public class HeapOOM {

    static class OOMObject {
    }
    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<OOMObject>();
        while (true) {
            list.add(new OOMObject());
        }
    }
}
