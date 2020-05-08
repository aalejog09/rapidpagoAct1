package com.rapidpago.proyec1.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.rapidpago.proyec1.Commons.GenericServicesImpl;
import com.rapidpago.proyec1.Models.Department;
import com.rapidpago.proyec1.Repository.DepartmentRepository;
import com.rapidpago.proyect1.Services.DepartmentService;

@Service
public class DeparmentServiceImpl extends GenericServicesImpl<Department, Integer> implements DepartmentService{

	@Autowired
	private DepartmentRepository departmentRepository;
	
	@Override
	public CrudRepository<Department, Integer> getDao() {
		
		return departmentRepository;
	}

	


}
