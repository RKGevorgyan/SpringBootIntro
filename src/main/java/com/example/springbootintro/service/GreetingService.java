package com.example.springbootintro.service;


import com.example.springbootintro.model.repository.UsersDAO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class GreetingService {

    @Resource
    UsersDAO usersDAO;

    public String getGreeting(String name) {
        int age = usersDAO.getUserAge(name);
        return "Hello " + name + " age = " + age;
    }
}
