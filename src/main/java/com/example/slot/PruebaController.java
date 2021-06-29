package com.example.slot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PruebaController {
	
	@RequestMapping("/prueba")
	public String pruebas(Model model) {
		
		model.addAttribute("name", "Mensaje");
		model.addAttribute("bool", true);
		
		return "prueba_template";
		
	}
	
	@RequestMapping("/list")
	public String lista(Model model) {
		
		List<String> listcolor = new ArrayList<String>();
		listcolor.add("Blue");
		listcolor.add("Green");
		listcolor.add("Black");
		listcolor.add("White");
		listcolor.add("Red");

		model.addAttribute("listcolor", listcolor);
		
		return "lista_template";
		
	}
	
}
