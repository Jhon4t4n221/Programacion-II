package HereEj5;

public class Main {

	public static void main(String[] args) {
		Vehiculo v1 = new Bus("Hernesto", "123 ADF", 345, 60, "superBus");
		Vehiculo v2 = new Auto("Rauw", "456 YDF", 777, 400, true);
		Vehiculo v3 = new Moto("Tony", "6118 RWF", 696, 300, true);
		
		v1.mostrarDatos();
		System.out.println();
		v2.mostrarDatos();
		System.out.println();
		
		v3.mostrarDatos();
		System.out.println();
		
		v1.cambiarConductor("Jorge");
		v1.mostrarDatos();
	}
}
