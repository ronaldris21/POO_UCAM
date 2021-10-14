package ejercicio2.mundo;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona p = new Persona("4545654F");
		int edad = 2013 - p.getAnioNacimiento();
		
		System.out.print("Edad en el 2013: "+ edad);
		
		
	}

}
