package com.happyfresh.learn.controller;

import com.happyfresh.learn.model.Person;
import com.happyfresh.learn.repository.PersonRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/redis")
@Log4j2
@CacheConfig(cacheNames = {"person"})
public class RedisController {

    public PersonRepository personRepository;

    public RedisController(PersonRepository personRepository){
        this.personRepository = personRepository;
    }

    @GetMapping("/add/{name}/{age}")
    @Cacheable(key = "#name")
    public String addEntry(@PathVariable String name, @PathVariable Integer age){
        Person person = Person.builder()
                .name(name)
                .age(age)
                .nationality("Indo")
                .build();

        log.error("Saving to DB {}", person.toString());
        personRepository.save(person);
        return person.toString();
    }
    // Remember @EnableCaching in application and spring config in application.properties
}
