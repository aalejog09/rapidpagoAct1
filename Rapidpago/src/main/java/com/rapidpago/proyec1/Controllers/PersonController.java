package com.rapidpago.proyec1.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rapidpago.proyec1.Models.Person;
import com.rapidpago.proyect1.Services.PersonService;

@Controller
public class PersonController {


		@Autowired
		private PersonService personServices;

		@RequestMapping("/person")
		public String PersonList(Model model) {
			model.addAttribute("list", personServices.getAll());
			return "person/person-list";
			//Vista a retornar= lista de personas.
		}
		
		@GetMapping("/person/save/{id}")
		public String showSavePerson( @PathVariable("id") Integer id, Model model) {
			if(id != null && id != 0) {
				//para editar a la persona
				model.addAttribute("person", personServices.get(id));
				
			} else {
				//para crear a la persona
				model.addAttribute("person", new Person());
			}
			return "/person/person-save";
		}
		//Guardar persona.
		@PostMapping("/person/save")
		public String savePerson(Person person, Model model) {
			personServices.save(person);
			return "redirect:/person";
			
		}

		@GetMapping("/person/delete/{id}")
		public String deletePerson(@PathVariable Integer id, Model model) {
			personServices.delete(id);
			return "redirect:/person";
		}
		
}

