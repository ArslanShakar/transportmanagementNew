package com.climesoftt.transportmanagement.model;

/**
 * Created by AtoZ on 3/20/2018.
 */

public class Person {
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String id = "";
    private String name = "";
    private String phone = "";
    private String address = "";

    public Person()
    {

    }

    public Person(String id, String name,String phone,String address)
    {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
