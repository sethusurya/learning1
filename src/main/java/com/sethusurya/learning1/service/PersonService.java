package com.sethusurya.learning1.service;

import com.sethusurya.learning1.collection.Person;

import java.util.List;

public interface PersonService {
    String save(Person person);

    List<Person> getAllPeople();
}
