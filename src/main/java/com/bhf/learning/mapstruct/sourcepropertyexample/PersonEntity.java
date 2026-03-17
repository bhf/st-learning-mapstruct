package com.bhf.learning.mapstruct.sourcepropertyexample;

public class PersonEntity {
    private String firstName;
    private String lastName;
    private int age;

    public PersonEntity() {
    }

    public PersonEntity(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // Property-style getter
    public String firstName() {
        return firstName;
    }

    // Property-style setter
    public void firstName(String firstName) {
        this.firstName = firstName;
    }

    public String lastName() {
        return lastName;
    }

    public void lastName(String lastName) {
        this.lastName = lastName;
    }

    public int age() {
        return age;
    }

    public void age(int age) {
        this.age = age;
    }
}
