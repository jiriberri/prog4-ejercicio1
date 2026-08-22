package ejercicio1;

public class Empleado extends Persona {

	private final int legajo; 
	
	private String Puesto;
	
	private static int Cont=1000;

	
	
	public Empleado() {
		
		super();
		Cont++; 
		this.legajo=Cont; 
		this.Puesto="Sin Puesto";
		
	}
	
	public Empleado(String Puesto){
		super();
		Cont++; 
		this.legajo=Cont;  
		this.Puesto=Puesto;
		
	}
	
	
	
	public int getLegajo() {
		return legajo;
	}
	
	public String getPuesto() {
		return Puesto;
	}
	public void setPuesto(String puesto) {
		Puesto = puesto;
	}
	@Override
	public String toString() {
		return super.toString()+"N° de legajo:" + legajo + "Puesto:" + Puesto;
	} 
	
	
	
	
}
