package com.example.slot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ParamController {

	@RequestMapping("/param")
	public String param(Model model, @RequestParam String name) {
		
		model.addAttribute("name", name);

		
		return "param_template";
	}
	
}
