package com.bhf.learning.mapstruct.targetpropertyexample;

import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PersonMapper {
    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    PersonDTO toDto(PersonEntity entity);

    @AfterMapping
    default void populateProperties(PersonEntity src, @MappingTarget PersonDTO target) {
        if (src == null || target == null) return;
        // set property-style fields on the DTO
        target.fullName(src.getFirstName() + " " + src.getLastName());
        target.firstName(src.getFirstName());
        target.lastName(src.getLastName());
        target.age(src.getAge());
    }
}
