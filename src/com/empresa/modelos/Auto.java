package com.empresa.modelos;

public class Auto {
    //cuerpo de la clase
	
	//atributos de la clase : definen las caracteristicas de los objetos
	// cuerpo de la clase

	// atributos de la clase : definen las caracteristicas de los objetos
	String color;
	String marca;
	String patente;
	int anio ;
	float cilindradaMotor;
	int capacidadMaximaTanque;
	int litrosActualesDeCombustible;

	// metodos constructores , Sobrecarga de metodos constructores

	// metodo constructor vacio , este metodo lo tenemos siempre IMPLICITAMENTE , si
	// creamos
	// otro constructor lo perdemos y debemos declararlos de manera EXPLICITA
	public Auto() {

	}

	// Constructor con 5 los parametros
	public Auto(String color, String marca, String patente, int anio, float cilindradaMotor) {
		this.color = color;
		this.marca = marca;
		this.patente = patente;
		this.anio = anio;
		this.cilindradaMotor = cilindradaMotor;
	}

	// Constructor con todos los parametros
	public Auto(String color, String marca, String patente, int anio, float cilindradaMotor, int capacidadMaximaTanque,
			int litrosActualesDeCombustible) {
		this.color = color;
		this.marca = marca;
		this.patente = patente;
		this.anio = anio;
		this.cilindradaMotor = cilindradaMotor;
		this.capacidadMaximaTanque = capacidadMaximaTanque;
		this.litrosActualesDeCombustible = litrosActualesDeCombustible;
	}


	// constructor con dos parametros
	public Auto(String marca, String patente, int capacidadMaximaTanque) {
		this.marca = marca;
		this.patente = patente;
		this.capacidadMaximaTanque = capacidadMaximaTanque;
	}

	// metodos de la clase Auto > estos definen el
	// comportamiento que tendran todas las instacias de la clase Auto
	public void cargarCombustible(int litrosACargar) {
		if ((litrosActualesDeCombustible + litrosACargar) <= capacidadMaximaTanque) {
			System.out.println("se cargaron " + litrosACargar + " Litros de combustible en su " + marca);
			litrosActualesDeCombustible = litrosActualesDeCombustible + litrosACargar;
		} else {
			System.out.println("La capacidad de su tanque de combustible no le permite cargar "
					+ (litrosActualesDeCombustible + litrosACargar) + " litros");
		}
	}

	public void frenar() {
		System.out.println("se freno el " + marca);
	}

	public void acelerar(float aceleracion) {
			System.out.println("Estas acelerando el " + marca + " a " + aceleracion + " Km x hs.");
	}

	public int listroDisponiblesParaCargarCombustible() {

		int litrosDisponibles = capacidadMaximaTanque - litrosActualesDeCombustible;
		return litrosDisponibles;
	}


	@Override
	public String toString() {
		return "Auto [color=" + color + ", marca=" + marca + ", patente=" + patente + ", anio=" + anio
				+ ", cilindradaMotor=" + cilindradaMotor + ", capacidadMaximaTanque=" + capacidadMaximaTanque
				+ ", litrosActualesDeCombustible=" + litrosActualesDeCombustible + "]";
	}

}