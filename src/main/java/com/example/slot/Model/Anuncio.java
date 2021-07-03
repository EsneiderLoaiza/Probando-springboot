package com.example.slot.Model;

public class Anuncio {
	
	private String nombre;
	private String asunto;
	private String texto;
	
	public Anuncio() {
		
	}
	
	public Anuncio(String nombre, String asunto, String texto) {
		this.setNombre(nombre);
		this.setAsunto(asunto);
		this.setTexto(texto);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAsunto() {
		return asunto;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

}
