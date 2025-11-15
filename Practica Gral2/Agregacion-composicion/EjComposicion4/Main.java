package EjComposicion4;

public class Main {
    public static void main(String[] args) {

        Ropero ropero = new Ropero("Madera");

        ropero.adicionar(new Ropa("Camisa", "Algodón"));
        ropero.adicionar(new Ropa("Pantalón", "Jean"));
        ropero.adicionar(new Ropa("Polera", "Algodón"));
        ropero.adicionar(new Ropa("Chamarra", "Cuero"));
        ropero.adicionar(new Ropa("Falda", "Jean"));

        System.out.println("\n--- Mostrar por material Algodón ---");
        ropero.mostrarPorMaterial("Algodón");

        System.out.println("\n--- Mostrar por tipo Pantalón ---");
        ropero.mostrarPorTipo("Pantalón");

        System.out.println("\n--- Eliminando las prendas de material Jean ---");
        ropero.eliminarPorMaterial("Jean");

        System.out.println("\n--- Mostrar por material Jean ---");
        ropero.mostrarPorMaterial("Jean");

        System.out.println("\n--- Eliminando prendas del tipo Polera ---");
        ropero.eliminarPorTipo("Polera");

        System.out.println("\n--- Mostrar por tipo Polera ---");
        ropero.mostrarPorTipo("Polera");
    }
}
