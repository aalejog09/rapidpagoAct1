package com.rapidpago.proyec1.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	
	@GetMapping({"/", "/index" , "/home"})
	public String Index() {
		return "index";
	}

}
