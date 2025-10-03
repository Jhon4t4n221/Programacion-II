package HereEj7;

public class Docente extends Persona {
	private double sueldo;
	private String regProf;
	
	public Docente(String nom, String pat, String mat, int ed, double sueldo, String regProf) {
		super(nom, pat, mat, ed);
		this.sueldo = sueldo;
		this.regProf = regProf;
	}
	
	public void mostrar() {
		System.out.println("sueldo: "+this.sueldo + " registro Profesional: "+this.regProf);
	}
}
