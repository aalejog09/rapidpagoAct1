package com.rapidpago.proyec1.Repository;

import org.springframework.data.repository.CrudRepository;

import com.rapidpago.proyec1.Models.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
