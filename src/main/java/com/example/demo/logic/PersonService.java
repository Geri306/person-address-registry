package com.example.demo.logic;

import com.example.demo.persistence.entity.Person;
import com.example.demo.persistence.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Person> findAll() {
        return personRepository.findAll();
    }

    public Optional<Person> findById(Long id) {
        return personRepository.findById(id);

    }

    public Person save(Person person) {
        return personRepository.save(person);
    }
}