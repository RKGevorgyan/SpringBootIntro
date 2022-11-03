package com.example.springbootintro.service;


import com.example.springbootintro.model.dto.PersonDto;
import com.example.springbootintro.model.dto.mapper.PersonMapper;
import com.example.springbootintro.model.entity.model.PersonEntity;
import com.example.springbootintro.model.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import javax.persistence.EntityManager;
import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Service
@Validated
public class PersonService {

    private PersonRepository personRepository;

    public PersonEntity findById(Long id) {
        return personRepository.findById(id).orElseGet(PersonEntity::new);
    }

    public List<PersonEntity> findAllPersons() {
        List<PersonEntity> all = personRepository.findAll();
        return personRepository.findAll();
    }

    @Transactional
    public PersonDto savePerson(@Valid PersonDto personDto) {
        PersonEntity person = PersonMapper.fromDtoToEntity(personDto);
        PersonEntity entity = personRepository.save(person);
        personDto.setId(entity.getId());
        return personDto;
    }

    @Transactional
    public PersonEntity updatePerson(PersonEntity person) {
        // any methods
        return personRepository.save(person);
    }


    @Autowired
    public void setPersonRepository(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }
}
