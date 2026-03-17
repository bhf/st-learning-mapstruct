package com.bhf.learning.mapstruct.basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonMapperTest {

    @Test
    void mapsEntityToDto() {
        PersonEntity entity = new PersonEntity("Jane", "Smith", 25);

        PersonDTO dto = PersonMapper.INSTANCE.toDto(entity);

        assertEquals("Jane Smith", dto.getFullName());
        assertEquals(25, dto.getAge());
    }
}
