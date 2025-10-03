package PoliEj5;

public class Main {

	public static void main(String[] args) {
		Celular c = new Celular(12345,"paco",100,4,8);
		
		c.mostrarDatos();
		c.incrementarApp();
		c.reducirEspacio();
		System.out.println();
		
		System.out.println("datos actualizados: ");
		c.mostrarDatos();
	}

}
