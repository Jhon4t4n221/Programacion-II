package Persistencia10;

public class Usuario {

    public String nombreUsuario;
    public String contrasenaCifrada;

    public Usuario(String nombreUsuario, String contrasena) {
        this.nombreUsuario = nombreUsuario;
        this.contrasenaCifrada = cifrar(contrasena);
    }

    // Cifrado simple (solo demostración académica)
    public static String cifrar(String c) {
        String r = "";
        for (int i = 0; i < c.length(); i++) {
            r += (char) (c.charAt(i) + 3); // César +3
        }
        return r;
    }
}
