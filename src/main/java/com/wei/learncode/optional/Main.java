package com.wei.learncode.optional;

import jdk.nashorn.internal.runtime.options.Option;

import java.util.Optional;

/**
 * @Author: skye
 * @Date: 2019/10/25 16:49
 * @Description:
 * @Version:1.0
 */
public class Main {

    public static void main(String[] args) {
        Company company = new Company();
        company.setName("张三");
        Optional<Company> optionalCompany = Optional.ofNullable(company);
        optionalCompany.ifPresent(lang -> System.out.println(lang.getName()));
    }
}
