package com.example.springbootintro.controller;


import com.example.springbootintro.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

// localhost:8080/
@RestController
public class GreetingController {

    private GreetingService service;


    @GetMapping("/greeting")
    public String greeting(@PathParam("name") String name
    ,@PathParam("age") int age) {
        return service.getGreeting(name);
    }

    @Autowired
    public void setService(GreetingService service) {
        this.service = service;
    }
}
// http://localhost:8080/greeting?name=Robert&age=46 - rest

// kafka, activeMq - транспорт