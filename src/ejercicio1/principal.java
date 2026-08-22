package ejercicio1;

public class principal {

	public static void main(String[] args) {
		
		System.out.println("--- Proyecto Inicializado por Grupo 18 ---");
		
		Persona p1 = new Persona();
		p1.setNombre("Juan");
		System.out.println(p1.toString());

	   
	   Empleado p2=new Empleado("Junior"); 
	   
	   
	   System.out.println(p2.toString());
		
		
	}

}
