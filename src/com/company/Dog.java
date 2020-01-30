package com.company;

public class Dog  extends Animals{
    private String name;
    private Integer age;

    public Dog(){

    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog(int i, String fsdf) {
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

