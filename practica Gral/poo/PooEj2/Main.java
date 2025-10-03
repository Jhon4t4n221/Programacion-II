package PooEj2;

public class Main {
    public static void main(String[] args) {
    	 Bus bus1 = new Bus("B-101", 50);

        bus1.mostrarDatos();
        System.out.println();

        bus1.subirPasajeros(25);
        bus1.mostrarDisponibles();

        System.out.println();

        bus1.cobrarPasaje();
        bus1.mostrarDatos();

        System.out.println();

        bus1.subirPasajeros(20);
        bus1.mostrarDisponibles();
        bus1.cobrarPasaje();
        bus1.mostrarDatos();
    }
}
