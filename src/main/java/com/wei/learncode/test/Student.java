package com.wei.learncode.test;

import lombok.Data;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author: weizz
 * @Date: 2019/7/3 19:18
 * @Description:
 * @Version:1.0
 */
@Data
@Setter
public class Student extends Person{
    @Override
    public void test() {
        System.out.println("nihao");
    }
    public void test2() {
        System.out.println("nihao222");
    }
}
