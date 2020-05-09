package com.rapidpago.proyec1.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.rapidpago.proyec1.Commons.GenericServicesImpl;
import com.rapidpago.proyec1.Models.Experience;
import com.rapidpago.proyec1.Repository.ExperienceRepository;
import com.rapidpago.proyect1.Services.ExperienceService;

@Service
public class ExperienceServiceImpl extends GenericServicesImpl<Experience, Integer> implements ExperienceService{

	@Autowired
	private ExperienceRepository experienceRepository;
	
	@Override
	public CrudRepository<Experience, Integer> getDao() {
		
		return experienceRepository;
	}

	


}
