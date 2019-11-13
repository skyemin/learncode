package com.wei.learncode.geektime.three;

/**
 * @Author: skye
 * @Date: 2019/11/1 16:23
 * @Description:
 * @Version:1.0
 */
public class Account {
    private int balance;
    // 转账
     public void transfer(Account target, int amt){
        synchronized (this){
            synchronized (target){
                if (this.balance > amt) {
                    this.balance -= amt;
                    target.balance += amt;
                }
            }
        }
    }
}
