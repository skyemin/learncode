package com.wei.learncode.design.templatemethod;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/7/27 11:38
 */
public class Process extends AbstractTemplate{
    @Override
    protected void apply(String type) {
        System.out.println("修改"+type);
    }
    @Override
    public void init() {
        System.out.println("init process ...");
    }

    public static void main(String[] args) {

        AbstractTemplate template = new Process();
        template.templateMethod("测试类型");
    }
}
