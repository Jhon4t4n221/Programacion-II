package PooEj5;

public class Persona {
	private String nom;
	private String apPat;
	private String apMat;
	private int edad;
	private int ci;
	
	public Persona(String nom, String apPat, String apMat, int edad, int ci) {
		this.nom = nom;
		this.apPat = apPat;
		this.apMat = apMat;
		this.edad = edad; 
		this.ci = ci;
	}
	
	public void mostrarDatos() {
		System.out.println("nombre: "+this.nom+" ap paterno: "+this.apPat+" ap materno: "+this.apMat);
		System.out.println("edad: "+this.edad);
		System.out.println("ci"+this.ci);
	}
	
	public void mEdad(int mEdad) {
		if(this.edad > 18) {
			System.out.println(this.nom+" es mayor de edad");
		}else {
			System.out.println(this.nom+" no es mayor de edad");
		}
	}
	
	public void modiEdad (int modiEdad) {
		modiEdad = this.edad + modiEdad;
		System.out.println("la nueva edad es: "+modiEdad);
	}
	
	public void veriApellido (String apPat) {
		if (this.apPat.equalsIgnoreCase(apPat)){
			System.out.println("los apellidos coinciden");
		}else {
			System.out.println("los apellidos no coinciden");
		}
	}
}
