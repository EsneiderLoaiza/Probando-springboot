package com.example.slot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ParamController {

	//Se pasan parametros de forma individual, por cada campo
	@RequestMapping("/param")
	public String param(Model model, @RequestParam String nombre, @RequestParam String asunto, @RequestParam String texto) {
		
		model.addAttribute("nombre", nombre);
		model.addAttribute("asunto", asunto);
		model.addAttribute("texto", texto);

		
		return "param_template";
	}
	
}
