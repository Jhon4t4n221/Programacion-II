package HereEJ1;

public class Cliente extends Persona {
	private String nCompra;
	private String idCliente;
	
	public Cliente (String nCompra, String idCompra, String nom, String ap, String ci) {
		super(nom, ap, ci);
		this.nCompra = nCompra;
		this.idCliente = idCliente;
	}

	public String getnCompra() {
		return nCompra;
	}

	public void setnCompra(String nCompra) {
		this.nCompra = nCompra;
	}

	public String getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}
}
