package com.sethusurya.learning1.repository;

import com.sethusurya.learning1.collection.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends MongoRepository<Person,String> {
}
