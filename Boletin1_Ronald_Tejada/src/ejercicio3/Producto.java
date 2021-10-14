package ejercicio3;

public class Producto {
	private String nombre;
	private float precio;

	public Producto() {
		// TODO Auto-generated constructor stub
		System.out.println("Producto creado");
	}
	public Producto(String nombre, float precio) {
		// TODO Auto-generated constructor stub
		this.nombre = nombre;
		this.precio = precio;
		System.out.println("Producto creado");
	}
	
	public String getInformacion()
	{
		return "Nombre: "+this.nombre+", Precio: "+this.precio;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto p = new Producto("PIZZA 4 QUESOS", 8.99f);
	    System.out.print(p.getInformacion());	
		
		
	}

}
