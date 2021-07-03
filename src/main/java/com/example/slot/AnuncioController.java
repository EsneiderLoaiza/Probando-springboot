package com.example.slot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.slot.Model.Anuncio;

@Controller
public class AnuncioController {
	 
	//Se crea un metodo llamado Anuncio, que tiene los atributos/parametros para recibir y enviar.
	//No se necesita la atonación @RequestParam, El objeto anuncio recibe todo los valores
	//Después se agregan al model
	@RequestMapping("/guardaranuncio")
	public String guardarAnuncio(Model model, Anuncio anuncio) { 
		
		model.addAttribute("anuncio", anuncio);
		
		return "anuncio";
	}

}
