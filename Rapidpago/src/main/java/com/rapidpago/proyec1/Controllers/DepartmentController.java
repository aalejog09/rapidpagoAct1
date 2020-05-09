package com.rapidpago.proyec1.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rapidpago.proyec1.Models.Department;
import com.rapidpago.proyect1.Services.DepartmentService;

@Controller
public class DepartmentController {


		@Autowired
		private DepartmentService departmentServices;

		@RequestMapping("/department")
		public String DepartmentList(Model model) {
			model.addAttribute("list", departmentServices.getAll());
			return "department/department-list";
			//Vista a retornar lista de departmento.
		}
		
		@GetMapping("/department/save/{id}")
		public String showSaveDepartment( @PathVariable("id") Integer id, Model model) {
			if(id != null && id != 0) {
				//para editar departmento
				model.addAttribute("department", departmentServices.get(id));
				
			} else {
				//para crear departmento
				model.addAttribute("department", new Department());
			}
			return "/department/department-save";
		}
		//Guardar departmento.
		@PostMapping("/department/save")
		public String saveDepartment(Department department, Model model) {
			departmentServices.save(department);
			return "redirect:/department";
			
		}

		@GetMapping("/department/delete/{id}")
		public String deleteDepartment(@PathVariable Integer id, Model model) {
			departmentServices.delete(id);
			return "redirect:/department";
		}
		
}

