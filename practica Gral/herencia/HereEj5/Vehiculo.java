package HereEj5;

public class Vehiculo {
	protected String conductor;
	protected String placa;
	protected int id;
	
	public Vehiculo(String conductor, String placa, int id) {
		this.conductor = conductor;
		this.placa = placa;
		this.id = id;
	}
	
	public void mostrarDatos() {
		System.out.println("conductor: "+this.conductor);
		System.out.println("placa: "+this.placa);
	}
	
	public void cambiarConductor(String nuevoConductor) {
        this.conductor = nuevoConductor;
        System.out.println("El conductor ha sido cambiado a: " + nuevoConductor);
	}
}
