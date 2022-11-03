package com.example.springbootintro.model.dto.mapper;

import com.example.springbootintro.model.dto.PersonDto;
import com.example.springbootintro.model.entity.model.PersonEntity;
import org.springframework.stereotype.Component;


public class PersonMapper {

    public static PersonDto fromEntityToDto(PersonEntity personEntity) {
        PersonDto personDto = new PersonDto();
        personDto.setId(personEntity.getId());
        personDto.setName(personEntity.getName());
        personDto.setAge(personEntity.getAge());
        return personDto;
    }

    public static PersonEntity fromDtoToEntity(PersonDto personDto) {
        PersonEntity personEntity = new PersonEntity();
        personEntity.setId(personDto.getId());
        personEntity.setName(personDto.getName());
        personEntity.setAge(personDto.getAge());
        return personEntity;
    }

}
