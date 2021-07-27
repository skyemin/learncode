package com.wei.learncode.optional;

import java.util.Optional;
import java.util.function.Consumer;

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
        optionalCompany.ifPresent(new Consumer<Company>() {
            @Override
            public void accept(Company company) {
                System.out.println(333);
            }
        });
        optionalCompany.ifPresent(lang -> System.out.println());
    }
}
