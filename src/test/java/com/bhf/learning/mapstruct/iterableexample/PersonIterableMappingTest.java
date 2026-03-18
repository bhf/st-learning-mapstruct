package com.bhf.learning.mapstruct.iterableexample;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PersonIterableMappingTest {

    @Test
    void mapsIterableToList() {
        Item i1 = new Item("one");
        Item i2 = new Item("two");

        PersonEntity entity = new PersonEntity();
        entity.setName("Alice");
        entity.setItems(Arrays.asList(i1, i2));

        PersonDTO dto = PersonMapper.INSTANCE.toDto(entity);

        assertEquals("Alice", dto.getName());
        assertNotNull(dto.getItems());
        assertEquals(2, dto.getItems().size());
        List<ItemDTO> items = dto.getItems();
        assertEquals("one", items.get(0).getValue());
        assertEquals("two", items.get(1).getValue());
    }
}
