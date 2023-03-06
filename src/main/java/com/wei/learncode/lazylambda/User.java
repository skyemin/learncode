package com.wei.learncode.lazylambda;

import com.mysql.cj.util.LazyString;
import lombok.Data;

import java.util.List;
import java.util.Set;

@Data
public class User {

    // 用户 id
    private Long uid;
    // 用户的部门，为了保持示例简单，这里就用普通的字符串
    // 需要远程调用 通讯录系统 获得
    private String department;
    // 用户的主管，为了保持示例简单，这里就用一个 id 表示
    // 需要远程调用 通讯录系统 获得
    private Long supervisor;
    // 用户所持有的权限
    // 需要远程调用 权限系统 获得
    private Set<String> permission;
}
