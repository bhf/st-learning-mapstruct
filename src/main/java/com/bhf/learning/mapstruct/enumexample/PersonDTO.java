package com.bhf.learning.mapstruct.enumexample;

public class PersonDTO {
    private String fullName;
    private int age;
    private Gender sex;

    public PersonDTO() {
    }

    public PersonDTO(String fullName, int age, Gender sex) {
        this.fullName = fullName;
        this.age = age;
        this.sex = sex;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getSex() {
        return sex;
    }

    public void setSex(Gender sex) {
        this.sex = sex;
    }

    public enum Gender {
        M,
        F,
        X
    }
}
