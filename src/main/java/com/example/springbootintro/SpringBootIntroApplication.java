package com.example.springbootintro;

import com.example.springbootintro.service.GreetingService;
import com.example.springbootintro.service.TestClass;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootIntroApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootIntroApplication.class, args);
    }

}
