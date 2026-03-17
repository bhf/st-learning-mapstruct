package com.bhf.learning.mapstruct.enumexample;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersonMapper {
    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    @Mapping(target = "fullName", expression = "java(entity.getFirstName() + \" \" + entity.getLastName())")
    PersonDTO toDto(PersonEntity entity);

    default PersonDTO.Gender map(PersonEntity.Sex sex) {
        if (sex == null) return null;
        switch (sex) {
            case MALE:
                return PersonDTO.Gender.M;
            case FEMALE:
                return PersonDTO.Gender.F;
            default:
                return PersonDTO.Gender.X;
        }
    }
}
