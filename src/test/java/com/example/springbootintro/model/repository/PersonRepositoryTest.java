package com.example.springbootintro.model.repository;

import com.example.springbootintro.model.entity.model.PersonEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class PersonRepositoryTest {

    @Autowired
    PersonRepository personRepository;

    @Test
    public void findPersonByNameTest() {
        List<PersonEntity> vladimirs = personRepository.findByName("Vladimir");
        assertEquals(4, vladimirs.size());
    }

}