package com.wei.learncode.design.chainResponsibility;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/8/24 11:25
 */
public abstract class RuleHandler {

    protected RuleHandler successor;

    public abstract void apply(User user);

    public RuleHandler getSuccessor() {
        return successor;
    }

    public void setSuccessor(RuleHandler successor) {
        this.successor = successor;
    }
}
