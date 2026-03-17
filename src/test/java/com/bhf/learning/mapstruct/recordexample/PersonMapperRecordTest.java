package com.bhf.learning.mapstruct.recordexample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonMapperRecordTest {

    @Test
    void mapsEntityToRecordDto() {
        PersonEntity entity = new PersonEntity("Jane", "Smith", 25);

        PersonDTO dto = PersonMapper.INSTANCE.toDto(entity);

        assertEquals("Jane Smith", dto.fullName());
        assertEquals(25, dto.age());
    }
}
