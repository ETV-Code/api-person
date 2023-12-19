package com.person.controller;

import com.person.model.Person;
import com.person.service.PersonService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/person")
public class PersonController {
    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    public ResponseEntity<Person> savePerson(@RequestBody Person personObject){
        Person persona = personService.savePerson(personObject);
        return ResponseEntity.ok(persona);
    }
    @GetMapping
    public ResponseEntity<List<Person>> getAllPerson(){
        List<Person> personList = personService.getAllPerson();
        return ResponseEntity.ok(personList);
    }
}
