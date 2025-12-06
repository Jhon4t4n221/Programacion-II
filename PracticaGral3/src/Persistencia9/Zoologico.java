package Persistencia9;

import java.util.ArrayList;

public class Zoologico {

    public int id;
    public String nombre;
    public String direccion;
    public ArrayList<Animal> animales;

    public Zoologico(int id, String nombre, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        animales = new ArrayList<>();
    }

    // Añadir un animal
    public void agregarAnimal(String especie, String nombre, int cantidad) {
        animales.add(new Animal(especie, nombre, cantidad));
    }

    public int getVariedad() {
        return animales.size();
    }

    public boolean estaVacio() {
        return animales.size() == 0;
    }

    public void mostrarAnimalesDe(String especie) {
        for (Animal a : animales) {
            if (a.especie.equals(especie)) {
                System.out.println(a.nombre + " (" + a.cantidad + ")");
            }
        }
    }

    // Mover animales a otro zoológico
    public void moverA(Zoologico z2, String especie) {
        ArrayList<Animal> movidos = new ArrayList<>();

        for (Animal a : animales) {
            if (a.especie.equals(especie)) {
                z2.animales.add(a);
                movidos.add(a);
            }
        }

        animales.removeAll(movidos);
    }
}
