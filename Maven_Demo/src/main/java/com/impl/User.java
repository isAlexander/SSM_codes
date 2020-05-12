package com.impl;

public class User {

    private String name;
    private String age;

    public User(){

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public User(String name,String age){
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }
}
