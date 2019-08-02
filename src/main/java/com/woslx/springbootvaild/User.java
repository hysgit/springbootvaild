package com.woslx.springbootvaild;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author hy
 * @create 2019-08-02 09:31
 **/

@CheckAge
public class User {

    private String phone;

    @NotBlank
    private String name;

    @NotNull(message = "age不能为null")
    private Integer age;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
