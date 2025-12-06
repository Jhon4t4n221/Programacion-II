package Persistencia10;

public class Main {
    public static void main(String[] args) {

        ArchUsuarios archivo = new ArchUsuarios();

        // Leer si existe
        archivo.leer();

        // Crear usuarios
        archivo.crear("admin", "admin123");
        archivo.crear("jhonatan", "supersecreto");
        archivo.crear("usuario1", "clave123");

        // Mostrar todos
        System.out.println("\n--- TODOS LOS USUARIOS ---");
        archivo.mostrar();

        // Buscar uno
        System.out.println("\n--- BUSCANDO USUARIO jhonatan ---");
        archivo.buscar("jhonatan");

        // Guardar cambios
        archivo.guardar();
    }
}
