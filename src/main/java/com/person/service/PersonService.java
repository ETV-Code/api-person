package com.person.service;

import com.person.model.Person;
import com.person.repository.PersonRepositoryJpa;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {


    private final PersonRepositoryJpa personRepositoryJpa;

    public PersonService(PersonRepositoryJpa personRepositoryJpa) {
        this.personRepositoryJpa = personRepositoryJpa;
    };

    public Person savePerson(Person personObject){

        return personRepositoryJpa.save(personObject);
    };

    public Optional<Person> getPersonById(String id){

        return personRepositoryJpa.findById(id);

    };

    public List<Person> getAllPerson(){

        return personRepositoryJpa.findAll();

    };
}
