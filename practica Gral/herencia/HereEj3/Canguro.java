package HereEj3;

public class Canguro extends Animal {
	public Canguro(String nom, int edad) {
		super(nom,edad);
	}
	
	public void desplazarse() {
		System.out.println(nom + " salta muy alto y largo");
	}
}
