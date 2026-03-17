package com.bhf.learning.mapstruct.sourcepropertyexample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonPropertyAccessorTest {

    @Test
    void mapsEntityWithPropertyAccessors() {
        PersonEntity entity = new PersonEntity();
        entity.firstName("Sam");
        entity.lastName("Green");
        entity.age(55);

        PersonDTO dto = PersonMapper.INSTANCE.toDto(entity);

        assertEquals("Sam Green", dto.getFullName());
        assertEquals(55, dto.getAge());
        assertEquals("Sam", dto.getFirstName());
        assertEquals("Green", dto.getLastName());
    }
}
