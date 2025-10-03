package PooEj4;

public class Main {

	public static void main(String[] args) {
		CuentaBancaria c1 = new CuentaBancaria("Pepito", 1245,300);
		CuentaBancaria c2 = new CuentaBancaria("ale", 4567, 50);
		
		c1.mostrar();
		c1.depositar(300);
		c1.retirar(500);
		System.out.println();
		
		c2.mostrar();
		c2.depositar(30);
		c2.retirar(800);
		
	}

}
