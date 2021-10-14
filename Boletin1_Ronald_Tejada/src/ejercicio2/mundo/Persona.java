package ejercicio2.mundo;

import java.util.Calendar;

public class Persona {
	//NIF, anioNacimiento (por defecto 1994), nombre, altura (pordefecto 1.70).
	private String NIF;
	private String nombre;
	private int anioNacimiento; 
	private float altura; 
	
	public Persona()
	{
		this.anioNacimiento = 1994; 
		this.altura = 1.70f; 
		
	}

	public Persona(String NIF) {
		// TODO Auto-generated constructor stub
		this.NIF =  NIF;
		this.anioNacimiento = 1994; 
		this.altura = 1.70f; 
	}
	
	

	public Persona(ejercicio2.mundo.Persona p) {
		// TODO Auto-generated constructor stub
		this.anioNacimiento = p.anioNacimiento;
		this.nombre = p.nombre;
		this.NIF = p.NIF;
		this.altura = p.altura;
	}
	
	
	//cambiarNombre, calculaEdad,
	public void cambiarNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int calcularEdad()
	{	
		return Calendar.getInstance().get(Calendar.YEAR) - this.anioNacimiento;
	}
	

	public String getNIF() {
		return NIF;
	}

	public String getNombre() {
		return nombre;
	}

	public int getAnioNacimiento() {
		return anioNacimiento;
	}

	public float getAltura() {
		return altura;
	}
	
	
	
	
	
	
	

}
