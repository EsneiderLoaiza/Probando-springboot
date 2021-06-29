package com.example.slot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GreetingController {
	
	@RequestMapping("/re")
	public String greeting(Model model) {
		
		model.addAttribute("name", 1);
		model.addAttribute("name", 1);
		
		return "greeting_template";
	}

}
