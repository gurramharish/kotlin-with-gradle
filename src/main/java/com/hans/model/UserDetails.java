package com.hans.model;

import org.jetbrains.annotations.Nullable;

public class UserDetails {

    private String name;
    private int age;
    private UserDetails partner;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null || name.trim().equals("")) throw new IllegalArgumentException("Name cannot be empty");
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Nullable
    public UserDetails getPartner() {
        return partner;
    }

    public void setPartner(UserDetails partner) {
        this.partner = partner;
    }
}
