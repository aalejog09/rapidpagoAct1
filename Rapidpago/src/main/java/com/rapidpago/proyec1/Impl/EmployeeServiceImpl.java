package com.rapidpago.proyec1.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.rapidpago.proyec1.Commons.GenericServicesImpl;
import com.rapidpago.proyec1.Models.Employee;
import com.rapidpago.proyec1.Repository.EmployeeRepository;
import com.rapidpago.proyect1.Services.EmployeeService;

@Service
public class EmployeeServiceImpl extends GenericServicesImpl<Employee, Integer> implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public CrudRepository<Employee, Integer> getDao() {
		
		return employeeRepository;
	}

	@Override
	public void set(String string, boolean b) {
		// TODO Auto-generated method stub
		
	}

	


}
