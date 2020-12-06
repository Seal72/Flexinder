package com.flexapp.entity.user;

import java.util.List;

public class UserPairBean {

    private String firstName;

    private String lastName;

    private int age;

    private List<String> intrests;

    public UserPairBean(String firstName, String lastName, int age, List<String> intrests) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.intrests = intrests;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getIntrests() {
        return intrests;
    }

    public void setIntrests(List<String> intrests) {
        this.intrests = intrests;
    }
}
