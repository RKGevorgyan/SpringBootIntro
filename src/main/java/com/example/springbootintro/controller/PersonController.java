package com.example.springbootintro.controller;

import com.example.springbootintro.model.dto.PersonDto;
import com.example.springbootintro.model.entity.model.PersonEntity;
import com.example.springbootintro.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

// localhost:8080/person?name = Ivan
@RestController
@RequestMapping("person")
public class PersonController {

    private PersonService personService;

    // localhost:8080/person/id
    @GetMapping("{id}")
    public PersonEntity findById(@PathVariable("id") long id) {
        return personService.findById(id);
    }



    // localhost:8080/person/all
    @GetMapping("all")
    public List<PersonEntity> findAllPersons() {
        return personService.findAllPersons();
    }

    // localhost:8080/person/create
    @PostMapping("create")
    public PersonDto savePerson(@RequestBody PersonDto personDto,
                                @RequestParam(name = "person_id") String personId) {
        return personService.savePerson(personDto);
    }

    @PutMapping("update")
    public PersonEntity updatePerson(@RequestBody PersonEntity person) {
        if (person.getId() == null) {
            throw new RuntimeException();
        }
        return personService.updatePerson(person);
    }

    @Autowired
    public void setPersonService(PersonService personService) {
        this.personService = personService;
    }
}
