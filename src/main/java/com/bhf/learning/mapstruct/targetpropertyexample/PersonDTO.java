package com.bhf.learning.mapstruct.targetpropertyexample;

public class PersonDTO {
    private String fullName;
    private String firstName;
    private String lastName;
    private int age;

    public PersonDTO() {
    }

    // Property-style getter/setter pairs
    public String fullName() {
        return fullName;
    }

    public void fullName(String fullName) {
        this.fullName = fullName;
    }

    public String firstName() {
        return firstName;
    }

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
