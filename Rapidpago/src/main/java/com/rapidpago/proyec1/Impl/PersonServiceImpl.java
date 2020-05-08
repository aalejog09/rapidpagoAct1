package com.rapidpago.proyec1.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.rapidpago.proyec1.Commons.GenericServicesImpl;
import com.rapidpago.proyec1.Models.Person;
import com.rapidpago.proyec1.Repository.PersonRepository;
import com.rapidpago.proyect1.Services.PersonService;

@Service
public class PersonServiceImpl extends GenericServicesImpl<Person, Integer> implements PersonService{

	@Autowired
	private PersonRepository personRepository;
	
	@Override
	public CrudRepository<Person, Integer> getDao() {
		
		return personRepository;
	}

	


}
