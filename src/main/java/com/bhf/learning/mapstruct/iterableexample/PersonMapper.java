package com.bhf.learning.mapstruct.iterableexample;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface PersonMapper {
    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    PersonDTO toDto(PersonEntity entity);

    List<ItemDTO> mapItems(Iterable<Item> items);
}
