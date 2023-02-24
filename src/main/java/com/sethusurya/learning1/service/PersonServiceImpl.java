package com.sethusurya.learning1.service;

import com.sethusurya.learning1.collection.Person;
import com.sethusurya.learning1.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService{

    @Autowired
    private PersonRepository personRepository;

    @Override
    public String save(Person person) {
        return personRepository.save(person).getPersonId();
    }

    @Override
    public List<Person> getAllPeople() {
        return personRepository.findAll();
    }
}
