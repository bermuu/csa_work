package com.mu.entity;
/*
* User实体类
* */
public class User {
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    private Integer userId;
    private String userName;
    private String userPassword;

}
