package PooEj2;

public class Bus {
	private String linea;
	private int capacidad;
	private int pasajeros;
	private double caja;
	
	public Bus(String linea, int capacidad) {
	    this.linea = linea;
	    this.capacidad = capacidad;
	    this.pasajeros = 0;
	    this.caja = 0.0;
	}

	
	public void subirPasajeros(int cantidad) {
		if(pasajeros + cantidad <= capacidad) {
			pasajeros += cantidad;
			System.out.println("subieron "+cantidad+"pasajeros");
		}else {
			System.out.println("no cupos");
			pasajeros = capacidad;
		}
	}
	
	public void cobrarPasaje() {
		double costo = 1.50;
		double total = pasajeros * costo;
		System.out.println("el total de pasajes vendidos fue de: "+total);
	}
	
	public void mostrarDisponibles() {
        int disponibles = capacidad - pasajeros;
        System.out.println("Asientos disponibles: " + disponibles);
    }

    public void mostrarDatos() {
        System.out.println("Bus de la Linea: " + linea	);
        System.out.println("Capacidad total: " + capacidad);
        System.out.println("Pasajeros actuales: " + pasajeros);
    }
}
