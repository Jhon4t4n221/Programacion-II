package Biblioteca;

public class Main {
	 public static void main(String[] args) {
	     Biblioteca biblio = new Biblioteca("Central UMSA", "Lun-Vie", "08:00", "18:00");

	     Autor autor1 = new Autor("Gabriel García Márquez", "Colombiano");
	     Autor autor2 = new Autor("Isabel Allende", "Chilena");
	     biblio.agregarAutor(autor1);
	     biblio.agregarAutor(autor2);

	     String[] paginas1 = {"Era un día soleado...", "La historia continúa..."};
	     String[] paginas2 = {"El viento soplaba fuerte...", "Y el héroe despertó."};

	     Libro libro1 = new Libro("Cien años de soledad", "ISBN123", paginas1);
	     Libro libro2 = new Libro("La casa de los espíritus", "ISBN456", paginas2);

	     biblio.agregarLibro(libro1);
	     biblio.agregarLibro(libro2);

	     Estudiante est1 = new Estudiante("2021001", "Juan Pérez");
	     biblio.prestarLibro(est1, libro1);

	     biblio.mostrarEstado();

	     libro1.leer();

	     biblio.cerrarBiblioteca();
	 }
	}
