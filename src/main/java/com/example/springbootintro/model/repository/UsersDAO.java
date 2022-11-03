package com.example.springbootintro.model.repository;

import org.springframework.stereotype.Repository;

@Repository
public class UsersDAO {
    public int getUserAge(String name) {
        return 45;
    }
}
