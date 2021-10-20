package ejercicio4;

public class CuentaBancaria {

	private double saldo;
	private static double totalSaldo;
	
	public CuentaBancaria(double valor) {
		// TODO Auto-generated constructor stub
		this.saldo = valor;	
		CuentaBancaria.totalSaldo += valor;
	}
	
	public double saldo() {
		return this.saldo;
	}
	public static double totalSaldo() {
		return CuentaBancaria.totalSaldo;
	}
	public boolean enNumerosRojos () {
		return this.saldo<0;
	}
	public boolean enNumerosRojos(double cant)
	{
		return (this.saldo>=cant) ? true : false;
	}
	public void movimiento( double valor ) {
		///No valido porque pueden haber numeros "Rojos"
		this.saldo += valor;	
		CuentaBancaria.totalSaldo += valor;
	}
	//Deprecated
	public static void incCuentas () { 
		///Me todo inutil, que reciba parametros de otras cuentas
		//Ademas voy actualizando el totalSaldo en otros metodos
		
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Preguntar

	}

}
