package PooEj1;

public class Main {

	public static void main(String[] args) {
		Vehiculo V1 = new Vehiculo ("Toyota", "LandCruiser",30);
		Vehiculo V2 = new Vehiculo ("Nissan", "Tundra", 45);
		
		V1.mostrar();
		V2.mostrar();
		
		V1.acelerar(20);
		V1.frenar(20);
		
		V2.acelerar(10);
		V2.frenar(30);
	}

}
