package HereEJ1;

public class Jefe extends Persona {
	private String sucursal;
	private String tipo;
	
	public Jefe(String sucursal, String tipo, String nom, String ap, String ci) {
		super(nom, ap, ci);
		this.sucursal = sucursal;
		this.tipo = tipo;
	}

	public String getSucursal() {
		return sucursal;
	}

	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
