package com.driver;

public class User {
    private String name;
    private String mobile;

    //default constructor
    public User() {
    }

    //all agrs constructor
    public User(String name, String mobile) {
        this.name = name;
        this.mobile = mobile;
    }

    //setters and getters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
