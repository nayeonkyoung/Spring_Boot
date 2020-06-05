package com.nayeonkyoung.springbootcrud.service;

import com.nayeonkyoung.springbootcrud.model.Person;
import com.nayeonkyoung.springbootcrud.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImp implements PersonService {

    @Autowired // 외부에서 찾아 주입 해준다.
    private PersonRepository personRepository;

    @Override
    public Person createPerson(Person person) {
        return personRepository.save(person); // 2
    }

    @Override
    public void deletePerson(Long id) {
        personRepository.delete(id); // 3
    }

    @Override
    public List<Person> getAllPersons() {
        return personRepository.findAll(); // 4
    }

}