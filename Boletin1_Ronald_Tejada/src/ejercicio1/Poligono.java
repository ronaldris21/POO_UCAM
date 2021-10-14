/**
 * 
 */
package ejercicio1;

/**
 * @author 286407
 *
 */
public class Poligono {

	int lados = 0;
	/**
	 * 
	 */
	public Poligono() {
		// TODO Auto-generated constructor stub
		System.out.println("Poligono creado");
	}
	public Poligono(int lados) {
		// TODO Auto-generated constructor stub
		System.out.println("Poligono creado con "+lados+" lados");
		this.lados = lados;
	}
	
	
	
	public int getLados() {
		// TODO Auto-generated method stub
		return this.lados;
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ejercicio1.Poligono poli =  new ejercicio1.Poligono();	
		poli =  new ejercicio1.Poligono(4);	
		System.out.println("El poligono tiene " + poli.getLados() + " lados");

	}

}



