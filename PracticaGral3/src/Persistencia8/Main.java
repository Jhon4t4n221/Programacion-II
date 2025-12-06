package Persistencia8;

public class Main {
    public static void main(String[] args) {

        ArchRefri refri = new ArchRefri("Mi Refri");

        // Cargar si existe
        refri.leerJSON();

        // Crear alimentos
        refri.crear("Leche", "2025-01-01", 2);
        refri.crear("Carne", "2024-12-15", 5);
        refri.crear("Yogurt", "2024-10-10", 0);
        refri.crear("Queso", "2025-03-20", 7);

        // Modificar
        refri.modificar("Leche", "2025-02-01", 3);

        // Mostrar antes de fecha
        refri.mostrarAntesDe("2024-12-30");

        // Eliminar sin stock
        refri.eliminarSinStock();

        // Buscar vencidos
        refri.buscarVencidos("2024-12-20");

        // Mayor cantidad
        refri.mayorCantidad();

        // Guardar todo en JSON
        refri.guardarJSON();
    }
}
