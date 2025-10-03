package HereEj7;

public class Persona {
	protected String nombre;
	protected String paterno;
	protected String materno;
	protected int edad;
	
	public Persona (String nom, String pat, String mat, int ed) {
		this.nombre = nom;
		this.paterno = pat;
		this.materno = mat;
		this.edad = ed;
	}
	
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void mostrar() {
		System.out.println("nombre: " + nombre +
						   " apellido paterno: "+ paterno +
						   " apellido materno: "+ materno +
						   " edad: " + edad);
	}
}
