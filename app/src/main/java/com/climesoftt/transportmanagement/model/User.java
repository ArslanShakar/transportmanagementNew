package com.climesoftt.transportmanagement.model;

import java.util.Date;

/**
 * Created by AtoZ on 3/19/2018.
 */

public class User {

    private String id;
    private String name;
    private String email;
    private String password;
    private String accountType;
    public User()
    {

    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

}
