package HereEJ1;

public class Persona {
	private String nombre;
	private String apellido;
	private String ci;
	
	public Persona(String nom, String ap, String ci) {
		this.nombre = nom;
		this.apellido = ap;
		this.ci = ci;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCi() {
		return ci;
	}

	public void setCi(String ci) {
		this.ci = ci;
	}
}
