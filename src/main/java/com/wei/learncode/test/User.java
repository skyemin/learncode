package com.wei.learncode.test;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @Author: weizz
 * @Date: 2019/7/3 15:00
 * @Description:
 * @Version:1.0
 */
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Data
@Component
@Scope
public class User {
    private String name;
    private Integer age;
}
