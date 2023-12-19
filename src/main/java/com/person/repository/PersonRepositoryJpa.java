package com.person.repository;
import com.person.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// jpa recibe la entidad y el tipo de dato de la llave primaria
@Repository
public interface PersonRepositoryJpa extends JpaRepository<Person, String> {

}
