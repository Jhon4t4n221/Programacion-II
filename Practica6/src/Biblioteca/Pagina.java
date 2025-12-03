package Biblioteca;

public class Pagina {
    private int numero;
    private String contenido;

    public Pagina(int n, String c) {
        this.numero = n;
        this.contenido = c;
    }

    public void mostrarPagina() {
        System.out.println("Página " + numero + ": " + contenido);
    }
}
