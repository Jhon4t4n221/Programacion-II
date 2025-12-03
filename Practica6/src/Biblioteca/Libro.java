package Biblioteca;

import java.util.List;

public class Libro {
    private String titulo;
    private String isbn;
    private List<Pagina> paginas;

    public Libro(String titulo, String isbn, List<Pagina> paginas) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.paginas = paginas;
    }

    public void mostrarInfo() {
        System.out.println("Libro: " + titulo + " | ISBN: " + isbn);
        for (Pagina p : paginas) p.mostrarPagina();
    }
}
