package com.empresa.modelos;
public class AppPrincipal {
	public static void main(String[] args) {
		// Instanciamos (crear) Objetos del tipo Auto
		Auto auto1 = new Auto();
		System.out.println("---------Estado inicial del auto 1---------");
		// validamos el estado inicial de los atributos del objeto auto1
		System.out.println("auto1.color : " + auto1.color);
		System.out.println("auto1.marca : " + auto1.marca);
		System.out.println("auto1.patente : " + auto1.patente);
		System.out.println("auto1.anio : " + auto1.anio);
		System.out.println("auto1.cilindradaMotor : " + auto1.cilindradaMotor);
		System.out.println("---------seteamos el estados de los atributos de auto1-------");
		auto1.color = "rojo";
		auto1.marca = "bmw";
		auto1.patente = "WSD152";
		auto1.anio = 1998;
		auto1.cilindradaMotor = 2.5f;
		System.out.println("---------Estado modificado del auto 1---------");
		// validamos el estado luego de setearlo de los atributos del objeto auto1
		System.out.println("auto1.color : " + auto1.color);
		System.out.println("auto1.marca : " + auto1.marca);
		System.out.println("auto1.patente : " + auto1.patente);
		System.out.println("auto1.anio : " + auto1.anio);
		System.out.println("auto1.cilindradaMotor : " + auto1.cilindradaMotor);
		// ************************************************************************************
		Auto auto2 = new Auto();
		System.out.println("---------Estado inicial del auto 2---------");
		// validamos el estado inicial de los atributos del objeto auto1
		System.out.println("auto2.color : " + auto2.color);
		System.out.println("auto2.marca : " + auto2.marca);
		System.out.println("auto2.patente : " + auto2.patente);
		System.out.println("auto2.anio : " + auto2.anio);
		System.out.println("auto2.cilindradaMotor : " + auto2.cilindradaMotor);
		System.out.println("---------seteamos el estados de los atributos de auto2------");
		auto2.color = "azul";
		auto2.marca = "mercedez";
		auto2.patente = "AAA133";
		auto2.anio = 2005;
		auto2.cilindradaMotor = 2.0f;
		System.out.println("---------Estado modificado del auto 2---------");
		// validamos el estado luego de setearlo de los atributos del objeto auto2
		System.out.println("auto2.color : " + auto2.color);
		System.out.println("auto2.marca : " + auto2.marca);
		System.out.println("auto2.patente : " + auto2.patente);
		System.out.println("auto2.anio : " + auto2.anio);
		System.out.println("auto2.cilindradaMotor : " + auto2.cilindradaMotor);
		// ************************************************************************************
		Auto auto3 = new Auto();
		System.out.println("---------Estado inicial del auto 3---------");
		// validamos el estado inicial de los atributos del objeto auto1
		System.out.println("auto3.color : " + auto3.color);
		System.out.println("auto3.marca : " + auto3.marca);
		System.out.println("auto3.patente : " + auto3.patente);
		System.out.println("auto3.anio : " + auto3.anio);
		System.out.println("auto3.cilindradaMotor : " + auto3.cilindradaMotor);
		System.out.println("---------seteamos el estados de los atributos de auto3------");
		auto3.color = "verde";
		auto3.marca = "jeep";
		auto3.patente = "AAF555";
		auto3.anio = 2019;
		auto3.cilindradaMotor = 5.7f;
		// validamos el estado luego de setearlo de los atributos del objeto auto3
		System.out.println("auto3.color : " + auto3.color);
		System.out.println("auto3.marca : " + auto3.marca);
		System.out.println("auto3.patente : " + auto3.patente);
		System.out.println("auto3.anio : " + auto3.anio);
		System.out.println("auto3.cilindradaMotor : " + auto3.cilindradaMotor);
		// ------------------------------------------------------ resuelto ejercicio
		Persona p1 = new Persona();
		p1.nombre = "Alex";
		p1.apellido = "Cabrera";
		p1.edad = 25;
		p1.anioNacimiento = 1993;
		// invocamos al metodo tostring del objeto p1
		String retorno = p1.toString();
		System.out.println(retorno);
		Persona p2 = new Persona();
		p2.nombre = "Rocio";
		p2.apellido = "Vacca";
		p2.edad = 28;
		p2.anioNacimiento = 1992;
		// invocamos al metodo tostring del objeto p1
		System.out.println(p2.toString());

		System.out.println("Creamos objetos mediante el metodo constructor con todos los parametros ");

		Auto a4 = new Auto("verde", "citroen", "EGA 332", 2015, 2.0f);

		System.out.println("Invocamos al metodo toString para conocer el estado del objeto a4");
		System.out.println(a4.toString());

		System.out.println("Creamos objetos mediante el metodo constructor con DOS parametros ");

		Auto a5 = new Auto("Mercedez Benz", "ELK 453", 50);

		System.out.println("Invocamos al metodo toString para conocer el estado del objeto a5");

		System.out.println(a5.toString());

		System.out.println("Utilizamos metodo para cargar combustible");
		a5.cargarCombustible(25);

		a5.cargarCombustible(15);

		a5.cargarCombustible(25);
		System.out.println("Invocamos al metodo toString para conocer el estado del objeto a5");

		System.out.println(a5.toString());

		// utilizamos el resto de los metodos de la clase Auto
		a5.acelerar(60.0f);

		a5.frenar();

		int litrosQuePuedoCargar = a5.listroDisponiblesParaCargarCombustible();
		System.out.println("me carga por favor " + litrosQuePuedoCargar + " litros de combustible");

		a5.cargarCombustible(litrosQuePuedoCargar);

		a5.acelerar(40.5f);
		System.out.println(a5.toString());

		// ejercicio
		// 1) crear una instancia del tipo Auto con todos sus atributos cargados , luego
		// llenar el tanque de combustible

		Auto miauto = new Auto("verde", "citroen", "FFT 154", 2018, 2.5f, 100, 10);
		System.out.println(miauto.toString());

		miauto.cargarCombustible(miauto.listroDisponiblesParaCargarCombustible());

		System.out.println(miauto.toString());

		// 2) crear una instancia del tipo Persona con todos sus atributos cargados ,
		// luego definir un metodo que permita a las personas "caminar" otro metodo que permita "ver un
		// programa de TV"


		Persona pepe = new Persona("Marce", "Del Carpio", 45, 1993);

	    pepe.caminar("Puerto Madero");

	    pepe.verProgramaTv("Almorzando con Mirta");

	    System.out.println(pepe.toString());
	}

}