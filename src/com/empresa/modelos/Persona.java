package com.empresa.modelos;

public class Persona {

	String nombre;
	String apellido;
	int edad;
	int anioNacimiento;

	public Persona() {

	// creamos el metodo to String para mostrar el estado de los atributo de mi clase
	// shortcut = alt + shift + s
	}

	public Persona(String nombre, String apellido, int edad, int anioNacimiento) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.anioNacimiento = anioNacimiento;
	}

	public Persona(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public void caminar(String lugar) {
		System.out.println("soy " + nombre + " y estoy caminando por " + lugar);
	}

	public void verProgramaTv(String programa) {
		System.out.println("soy " + nombre + " y estoy mirando el programa " + programa +" en la TV.") ;
	}


	// creamos el metodo to String para mostrar el estado de los atributo de mi
	// clase
	// shortcut = alt + shift + s
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", anioNacimiento="
				+ anioNacimiento + "]";
	}


}