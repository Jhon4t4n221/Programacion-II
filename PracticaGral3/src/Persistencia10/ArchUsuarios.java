package Persistencia10;

import java.io.*;
import java.util.ArrayList;

public class ArchUsuarios {

    public ArrayList<Usuario> usuarios;

    public ArchUsuarios() {
        usuarios = new ArrayList<>();
    }

    // Crear usuario
    public void crear(String nombre, String contrasena) {
        usuarios.add(new Usuario(nombre, contrasena));
    }

    // Guardar archivo TXT
    public void guardar() {
        try {
            FileWriter writer = new FileWriter("usuarios_seguro.txt");

            for (Usuario u : usuarios) {
                writer.write(u.nombreUsuario + ";" + u.contrasenaCifrada + "\n");
            }

            writer.close();
            System.out.println("Guardado en usuarios_seguro.txt");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Leer archivo TXT
    public void leer() {
        try {
            File file = new File("usuarios_seguro.txt");
            if (!file.exists()) {
                System.out.println("Archivo no encontrado. Iniciando vacío.");
                return;
            }

            BufferedReader br = new BufferedReader(new FileReader(file));

            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(";");
                if (partes.length == 2) {
                    usuarios.add(new Usuario(partes[0], partes[1])); 
                    usuarios.get(usuarios.size() - 1).contrasenaCifrada = partes[1];
                }
            }
            br.close();

            System.out.println("Datos cargados desde usuarios_seguro.txt");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Mostrar todos los usuarios
    public void mostrar() {
        for (Usuario u : usuarios) {
            System.out.println("Usuario: " + u.nombreUsuario +
                               " | Contraseña cifrada: " + u.contrasenaCifrada);
        }
    }

    // Buscar por nombre
    public void buscar(String nombre) {
        for (Usuario u : usuarios) {
            if (u.nombreUsuario.equalsIgnoreCase(nombre)) {
                System.out.println("Encontrado:");
                System.out.println("Usuario: " + u.nombreUsuario +
                                   " | Contraseña cifrada: " + u.contrasenaCifrada);
                return;
            }
        }
        System.out.println("Usuario no encontrado.");
    }
}
