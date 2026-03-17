package com.bhf.learning.mapstruct.sourcepropertyexample;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersonMapper {
    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    @Mapping(target = "fullName", expression = "java(entity.firstName() + \" \" + entity.lastName())")
    @Mapping(target = "age", expression = "java(entity.age())")
    @Mapping(target = "firstName", expression = "java(entity.firstName())")
    @Mapping(target = "lastName", expression = "java(entity.lastName())")
    PersonDTO toDto(PersonEntity entity);
}
