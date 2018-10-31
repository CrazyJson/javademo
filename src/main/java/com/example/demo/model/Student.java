package com.example.demo.model;

import com.example.demo.annotation.ConfigAttribute;

public class Student {
    /*

     */
    @ConfigAttribute(key="123",name="456")
    private String name;

    private Integer age;

    /**
     * @return
     */
    public String getName() {
        return name;
    }


    /**
     * @param name
     */
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
