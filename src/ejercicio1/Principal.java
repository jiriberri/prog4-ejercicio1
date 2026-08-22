package ejercicio1;

import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("--- Proyecto Inicializado por Grupo 18 ---");
		
		Persona p1 = new Persona();
		p1.setNombre("Juan");
		System.out.println(p1.toString());

	   
		Empleado p2=new Empleado("Junior"); 	  
		System.out.println(p2.toString());
		
		
		System.out.println("\n--- Demostracion de funcionamiento de constructorres ---");
		
		Persona p3 = new Persona();
		System.out.println("Primer constructor");
		System.out.println(p3.toString() + "\n");
		
		Persona p4 = new Persona("11111111",
				"Pepe",
				"Fernandez",
				LocalDate.parse("1990-05-20"),
				"Masculino",
				"Belgrano",
				"1122334455",
				"pepefernandez@gmail.com"
				);
		System.out.println("Segundo constructor");
		System.out.println(p4.toString());
		
	}

}
