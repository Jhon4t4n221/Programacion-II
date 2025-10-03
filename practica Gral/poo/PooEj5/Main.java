package PooEj5;

public class Main {

	public static void main(String[] args) {
		Persona p1 = new Persona("juan", "pinto", "narvaez",12,1234);
		Persona p2 = new Persona("leoncio","garcia","torredo",24,4567);
		
		p1.mostrarDatos();
		p1.mEdad(10);
		p1.modiEdad(30);
		p1.veriApellido("pinto");
		System.out.println();
		
		p2.mostrarDatos();
		p2.mEdad(4);
		p2.modiEdad(20);
		p2.veriApellido("garcia");
	}
}
