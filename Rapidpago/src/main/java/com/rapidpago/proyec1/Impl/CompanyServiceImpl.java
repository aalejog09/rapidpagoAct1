package com.rapidpago.proyec1.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.rapidpago.proyec1.Commons.GenericServicesImpl;
import com.rapidpago.proyec1.Models.Company;
import com.rapidpago.proyec1.Repository.CompanyRepository;
import com.rapidpago.proyect1.Services.CompanyService;

@Service
public class CompanyServiceImpl extends GenericServicesImpl<Company, Integer> implements CompanyService{

	@Autowired
	private CompanyRepository companyRepository;
	
	@Override
	public CrudRepository<Company, Integer> getDao() {
		
		return companyRepository;
	}

	


}
