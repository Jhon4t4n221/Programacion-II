package PooEj1;

public class Vehiculo {
	private String marca;
	private String modelo;
	private int velocidad;
	
	public Vehiculo (String marca, String modelo, int velocidad) {
		this.marca = marca;
		this.modelo = modelo;
		this.velocidad = velocidad;
	}
	
	public void mostrar() {
		System.out.println("marca del coche: "+ this.marca);
		System.out.println("modelo del coche: "+this.modelo);
		System.out.println("velocidad actual: "+this.velocidad);
	}
	public void acelerar(int incremento) {
	    this.velocidad += incremento;
	    System.out.println("La velocidad actual es: " + this.velocidad);
	}

	
	public void frenar(int decremento) {
	    this.velocidad -= decremento;
	    if (this.velocidad < 0) {
	        this.velocidad = 0; // no puede ser negativa
	    }
	    System.out.println("El coche frenó, velocidad actual: " + this.velocidad);
	}

	
	
}
