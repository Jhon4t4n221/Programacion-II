package Persistencia9;

public class Main {
    public static void main(String[] args) {

        ArchZoo archivo = new ArchZoo();

        // Cargar si existe
        archivo.leerJSON();

        // Crear zoológicos
        archivo.crearZoo(1, "La Paz Zoo", "La Paz");
        archivo.crearZoo(2, "Santa Cruz Zoo", "Santa Cruz");
        archivo.crearZoo(3, "Tarija Zoo", "Tarija");

        // Añadir animales
        archivo.zoos.get(0).agregarAnimal("Felino", "Leon", 5);
        archivo.zoos.get(0).agregarAnimal("Ave", "Aguila", 3);

        archivo.zoos.get(1).agregarAnimal("Reptil", "Iguana", 4);

        // b) Zoo con mayor variedad
        archivo.listarMayorVariedad();

        // c) Listar vacíos y eliminarlos
        archivo.listarYEliminarVacios();

        // d) Mostrar animales de especie Felino
        archivo.mostrarEspecieGlobal("Felino");

        // e) Mover animales del 1 al 2
        archivo.moverAnimales(1, 2, "Felino");

        // Guardar cambios
        archivo.guardarJSON();
    }
}
