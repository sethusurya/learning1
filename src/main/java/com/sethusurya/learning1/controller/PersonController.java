package com.sethusurya.learning1.controller;

import com.sethusurya.learning1.collection.Person;
import com.sethusurya.learning1.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/person")
public class PersonController {
    @Autowired
    private PersonService personService;

    @PostMapping
    public String save(@RequestBody Person person) {
        return personService.save(person);
    }

    @GetMapping
    public List<Person> getPeople(){
        return personService.getAllPeople();
    }
}
