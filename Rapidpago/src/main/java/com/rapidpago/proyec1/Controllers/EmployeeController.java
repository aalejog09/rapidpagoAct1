package com.rapidpago.proyec1.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rapidpago.proyec1.Models.Department;
import com.rapidpago.proyec1.Models.Employee;
import com.rapidpago.proyec1.Models.Experience;
import com.rapidpago.proyec1.Models.Person;
import com.rapidpago.proyect1.Services.DepartmentService;
import com.rapidpago.proyect1.Services.EmployeeService;
import com.rapidpago.proyect1.Services.ExperienceService;
import com.rapidpago.proyect1.Services.PersonService;

@Controller
public class EmployeeController {


		@Autowired
		private EmployeeService employeeServices;
		
		@Autowired
		private DepartmentService departmentServices;
		
		@Autowired
		private ExperienceService experienceServices;
		
		@Autowired
		private PersonService personServices;


		@RequestMapping("/employee")
		public String EmployeeList(Model model) {
			model.addAttribute("list", employeeServices.getAll());
			return "employee/employee-list";
			//Vista a retornar= lista de empleado.
		}
		@GetMapping("/employee/save/{id}")
		public String showSaveEmployee( @PathVariable("id") Integer id, Model model) {
			List<Department> departmentList =  departmentServices.getAll();
			List<Experience> experienceList =  experienceServices.getAll();
			Department department = new Department();
			Experience experience = new Experience();
			model.addAttribute("Title", "Form: Employee");
			model.addAttribute("departments", departmentList);
			model.addAttribute("experiences", experienceList);
			model.addAttribute("department", department);
			model.addAttribute("experience", experience);
			if(id != null && id != 0) {
				//para editar empleado
				model.addAttribute("employee", employeeServices.get(id));
			} else {
				//para crear empleado
				model.addAttribute("employee", new Employee());
			}
			return "/employee/employee-save";
		}
		//Guardar empleado.
		@PostMapping("/employee/save")
		public String saveEmployee(Employee employee, Model model) {
			employeeServices.save(employee);
			return "redirect:/employee";
			
		}

		@GetMapping("/employee/delete/{id}")
		public String deleteEmployee(@PathVariable Integer id, Model model) {
			employeeServices.delete(id);
			return "redirect:/employee";
		}
		
}

