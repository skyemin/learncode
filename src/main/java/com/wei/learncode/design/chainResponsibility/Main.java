package com.wei.learncode.design.chainResponsibility;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/8/24 11:30
 */
public class Main {

    public static void main(String[] args) {

        User user = new User("张三",1,10);
        RuleHandler nameRule = new NameRuleHandler();
        RuleHandler ageRule = new AgeRuleHandler();
        nameRule.setSuccessor(ageRule);
        nameRule.apply(user);
    }
}
