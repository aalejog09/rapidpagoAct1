package com.rapidpago.proyec1.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rapidpago.proyec1.Models.Employee;
import com.rapidpago.proyect1.Services.EmployeeService;

@RestController
public class EmployeeRestController {

		
		@Autowired
		EmployeeService employeeServices;
		
		
		@RequestMapping ( path = " /employees "  ,method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
		public  List<Employee>  getAllEmployees () {
			return employeeServices.getAll();
		}
		
	    @RequestMapping ( value  =  " /employee/{id} " , method  =  RequestMethod . GET, produces=MediaType.APPLICATION_JSON_VALUE)
		public  Employee  getEmployeeById ( @PathVariable("id") Integer id  ) {
			return employeeServices.get(id);
		}

	}

