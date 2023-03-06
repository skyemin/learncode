package com.wei.learncode.lazylambda;

import java.util.Arrays;
import java.util.List;

/*public class UserFactory {

    public User buildUser(){
        User user = new User();
        user.setUid(1L);
        Lazy<List<String>> permission = Lazy.of(() -> {
            return getUserPermission(user.getUid());
        });
        user.setPermission(permission);
        return user;
    }

    List<String> getUserPermission(Integer uid) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("invoke getUserPermission...");
        return Arrays.asList("新增","修改");
    }

    public static void main(String[] args) {
        UserFactory factory = new UserFactory();
        User user = factory.buildUser();
        System.out.println(user.getPermissions().get());

    }
}*/
