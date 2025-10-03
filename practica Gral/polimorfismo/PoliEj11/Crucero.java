package PoliEj11;
public class Crucero {
    private String nombre;
    private String paisOrigen;
    private String paisDestino;
    private int nroPasajeros;
    private Pasajero[] pasajeros;

    public Crucero(String nombre, String paisOrigen, String paisDestino, int capacidad) {
        this.nombre = nombre;
        this.paisOrigen = paisOrigen;
        this.paisDestino = paisDestino;
        this.pasajeros = new Pasajero[capacidad];
        this.nroPasajeros = 0;
    }

    public void agregarPasajero(Pasajero p) {
        if (nroPasajeros < pasajeros.length) {
            pasajeros[nroPasajeros++] = p;
        } else {
            System.out.println("El crucero está lleno.");
        }
    }

    public void mostrarPasajeros() {
        System.out.println("Pasajeros del crucero " + nombre + ":");
        for (int i = 0; i < nroPasajeros; i++) {
            pasajeros[i].mostrar();
        }
    }

    public void resumenPasajeros() {
        System.out.println("Crucero " + nombre + " tiene " + nroPasajeros + " pasajeros.");
    }

    public double costoTotal() {
        double suma = 0;
        for (int i = 0; i < nroPasajeros; i++) {
            suma += pasajeros[i].getCostoPasaje();
        }
        return suma;
    }

    public boolean mismaCantidadPasajeros(Crucero otro) {
        return this.nroPasajeros == otro.nroPasajeros;
    }
    public void contarGenero() {
        int hombres = 0, mujeres = 0;
        for (int i = 0; i < nroPasajeros; i++) {
            if (pasajeros[i].getGenero().equalsIgnoreCase("M")) {
                hombres++;
            } else {
                mujeres++;
            }
        }
        System.out.println("En el crucero " + nombre + " hay " + hombres + " hombres y " + mujeres + " mujeres.");
    }
}

