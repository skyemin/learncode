package com.wei.learncode.optional;

import java.util.Optional;

/**
 * @Author: skye
 * @Date: 2019/10/25 16:47
 * @Description:
 * @Version:1.0
 */
public class Staff {
    private Department department;
    public Optional<Department> getDepartment() {
        return Optional.ofNullable(department);
    }
}

class Department {
    private Company company;
    public Optional<Company> getCompany() {
        return Optional.ofNullable(company);
    }
}
class Company {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}