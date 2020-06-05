package com.nayeonkyoung.springbootcrud.service;

import com.nayeonkyoung.springbootcrud.model.Person;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PersonService {
    Person createPerson(Person person);

    void deletePerson(Long id);

    List<Person> getAllPersons();
}