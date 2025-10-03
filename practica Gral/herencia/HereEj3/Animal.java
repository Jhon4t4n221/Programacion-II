package HereEj3;

public class Animal {
	protected String nom;
	protected int edad;
	
	public Animal(String nom, int edad) {
		this.nom = nom;
		this.edad = edad;
	}
	
	public void desplazarse() {
		System.out.println(nom + " puede desplazarse");
	}
}
