package com.bbr.soap;

public class Usuario {

	// ATRIBUTOS DE CLASE
	private static final long serialVersionUID = 1L;	
	private String nombre;
	private String apellido;

	
	// CONSTRUCTORES
	public Usuario() {
	}

	public Usuario(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	// METODOS GETTER Y SETTER
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

}
