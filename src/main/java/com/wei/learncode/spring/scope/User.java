package com.wei.learncode.spring.scope;

import lombok.Data;

@Data
public class User {
    private Son son;
    @Data
    public static class Son{
        private String name;
    }
}
