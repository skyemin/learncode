package com.wei.learncode.testenum;

import lombok.Data;

@Data
public class Test {

    private TestTnum testTnum;

    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.getTestTnum());
        test.setTestTnum(TestTnum.TEST);
        System.out.println(test.getTestTnum());
    }
}
