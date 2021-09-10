package com.wei.learncode.markword;

import org.openjdk.jol.info.ClassLayout;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/8/24 17:10
 */
public class Test {

    public static void main(String[] args) {

        Test test = new Test();
        System.out.println(ClassLayout.parseInstance(test).toPrintable());
    }
}
