package com.wei.learncode.design.chainResponsibility;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/8/24 11:26
 */
public class NameRuleHandler extends RuleHandler{

    @Override
    public void apply(User user) {

        if("张三".equals(user.getName())){
            if(this.getSuccessor() != null){
                this.getSuccessor().apply(user);
            }
        }else{
            throw new RuntimeException("name必须是张三");
        }
    }
}
