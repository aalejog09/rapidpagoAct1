package com.rapidpago.proyec1.Repository;

import org.springframework.data.repository.CrudRepository;

import com.rapidpago.proyec1.Models.Person;

public interface PersonRepository extends CrudRepository<Person, Integer> {

	
}
