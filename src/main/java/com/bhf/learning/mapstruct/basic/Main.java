package com.bhf.learning.mapstruct.basic;

public class Main {
    public static void main(String[] args) {
        PersonEntity entity = new PersonEntity("John", "Doe", 30);

        PersonDTO dto = PersonMapper.INSTANCE.toDto(entity);
        System.out.println("Mapped DTO: fullName=" + dto.getFullName() + ", age=" + dto.getAge());
    }
}
