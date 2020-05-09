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
@RequestMapping("/person")
public class PersonController {


		@Autowired
		private PersonService personServices;

		@RequestMapping("/list")
		public String PersonList(Model model) {
			model.addAttribute("list", personServices.getAll());
			return "personList";
			//Vista a retornar= lista de personas.
		}
		
		@GetMapping("/save/{id}")
		public String showSave( @PathVariable("id") Integer id, Model model) {
			if(id != null && id != 0) {
				//para editar a la persona
				model.addAttribute("person", personServices.get(id));
				
			} else {
				//para crear a la persona
				model.addAttribute("person", new Person());
			}
			return "save";
		}
		//Guardar persona.
		@PostMapping("/save")
		public String save(Person person, Model model) {
			personServices.save(person);
			return "redirect:/person";
			
		}

		@GetMapping("/delete/{id}")
		public String delete(@PathVariable Integer id, Model model) {
			
			personServices.delete(id);
			return "redicect:/person";
		}
		
}

