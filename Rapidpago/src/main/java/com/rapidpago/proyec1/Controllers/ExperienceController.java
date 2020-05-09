package com.rapidpago.proyec1.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rapidpago.proyec1.Models.Experience;
import com.rapidpago.proyect1.Services.ExperienceService;

@Controller
public class ExperienceController {


		@Autowired
		private ExperienceService experienceServices;

		@RequestMapping("/experience")
		public String experienceList(Model model) {
			model.addAttribute("list", experienceServices.getAll());
			return "experience/experience-list";
			//Vista a retornar lista de experiencia.
		}
		
		@GetMapping("/experience/save/{id}")
		public String showSaveExperience( @PathVariable("id") Integer id, Model model) {
			if(id != null && id != 0) {
				//para editar experiencia
				model.addAttribute("experience", experienceServices.get(id));
				
			} else {
				//para crear experiencia
				model.addAttribute("experience", new Experience());
			}
			return "/experience/experience-save";
		}
		//Guardar experiencia.
		@PostMapping("/experience/save")
		public String saveExperience(Experience experience, Model model) {
			experienceServices.save(experience);
			return "redirect:/experience";
			
		}

		@GetMapping("/experience/delete/{id}")
		public String deleteExperience(@PathVariable Integer id, Model model) {
			experienceServices.delete(id);
			return "redirect:/experience";
		}
		
}

