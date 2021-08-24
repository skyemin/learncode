package com.wei.learncode.design.chainResponsibility;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/8/24 11:28
 */
public class AgeRuleHandler extends RuleHandler{
    @Override
    public void apply(User user) {
        if(user.getAge() > 20){
            if(this.getSuccessor() != null){
                this.getSuccessor().apply(user);
            }
        }else{
            throw new RuntimeException("年龄必须大于20");
        }
    }
}
