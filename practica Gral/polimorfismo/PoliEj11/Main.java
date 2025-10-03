package PoliEj11;
public class Main {
    public static void main(String[] args) {
        Crucero c1 = new Crucero("CaribeSun", "Panamá", "Miami", 10);
        Crucero c2 = new Crucero("OceanBlue", "Brasil", "España", 10);

        Pasajero p1 = new Pasajero("Juan Vargas", 30, "M", 502, 500);
        Pasajero p2 = new Pasajero("Martina Vasques", 25, "F", 603, 1000);
        Pasajero p3 = new Pasajero("Wilmer Montero", 40, "M", 401, 925);
        Pasajero p4 = new Pasajero("Ana Lopez", 35, "F", 205, 750);
        Pasajero p5 = new Pasajero("Carlos Perez", 28, "M", 110, 800);

        c1.agregarPasajero(p1);
        c1.agregarPasajero(p2);
        c1.agregarPasajero(p3);

        c2.agregarPasajero(p4);
        c2.agregarPasajero(p5);

        c1.mostrarPasajeros();
        c1.resumenPasajeros();

        System.out.println("Costo total c1: " + c1.costoTotal());
        System.out.println("Costo total c2: " + c2.costoTotal());

        System.out.println("¿Misma cantidad de pasajeros? " + c1.mismaCantidadPasajeros(c2));

        c1.contarGenero();
        c2.contarGenero();
    }
}

