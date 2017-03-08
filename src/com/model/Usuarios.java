package com.model;

public class Usuarios {

	String nombre;
	String apellido;
	String complexion;
	String fechaNacimiento;
	int idUsuario;
	int altura;
	int peso;
	int idCoach;
	
	
	public Usuarios(){
		
	}
	
	public Usuarios(int inIdUs,int intPeso,int inAltura, int inIdCoach,String inNombre,
		String inApellido, String inComplexion,String inFechaNacimiento){
		idUsuario = inIdUs;
		altura = inAltura;
		peso = intPeso;
		idCoach = inIdCoach;
		nombre = inNombre;
		apellido = inApellido;
		complexion = inComplexion;
		fechaNacimiento = inFechaNacimiento;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

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

	public String getComplexion() {
		return complexion;
	}

	public void setComplexion(String complexion) {
		this.complexion = complexion;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getIdCoach() {
		return idCoach;
	}

	public void setIdCoach(int idCoach) {
		this.idCoach = idCoach;
	}
	
	
	

}
