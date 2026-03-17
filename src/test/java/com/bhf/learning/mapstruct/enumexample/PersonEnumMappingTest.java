package com.bhf.learning.mapstruct.enumexample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonEnumMappingTest {

    @Test
    void mapsEntitySexToDtoGender() {
        PersonEntity entity = new PersonEntity("Alex", "Doe", 40, PersonEntity.Sex.MALE);

        PersonDTO dto = PersonMapper.INSTANCE.toDto(entity);

        assertEquals("Alex Doe", dto.getFullName());
        assertEquals(40, dto.getAge());
        assertEquals(PersonDTO.Gender.M, dto.getSex());
    }
}
