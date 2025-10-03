package HereEj7;

public class Estudiante extends Persona {
	private String ru;
	private String matricula;
	
	public Estudiante(String nom, String pat, String mat, int ed, String ru, String matricula) {
		super(nom,pat,mat,ed);
		this.ru = ru;
		this.matricula = matricula;
	}
	
	public void modificarEdad(int nuevaEdad) {
        this.edad = nuevaEdad;
    }
	
	public void mostrarDatos() {
		System.out.println("RU: "+12345+ " matricula: "+ 345567);
	}
	
	
}
