package com.bhf.learning.mapstruct.targetpropertyexample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTargetPropertyTest {

    @Test
    void mapsEntityToPropertyDto() {
        PersonEntity entity = new PersonEntity("Laura", "Blue", 28);

        PersonDTO dto = PersonMapper.INSTANCE.toDto(entity);

        assertEquals("Laura Blue", dto.fullName());
        assertEquals(28, dto.age());
        assertEquals("Laura", dto.firstName());
        assertEquals("Blue", dto.lastName());
    }
}
