package HereEj3;

public class Pinguino extends Animal {
	public Pinguino(String nom, int edad) {
		super(nom,edad);
	}
	
	public void desplazarse() {
		System.out.println(nom + " nada y se desliza por el hielo");
	}
}
