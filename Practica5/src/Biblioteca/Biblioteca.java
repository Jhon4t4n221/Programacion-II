package Biblioteca;
import java.util.*;

class Biblioteca {
 private String nombre;
 private ArrayList<Libro> libros;
 private ArrayList<Autor> autores;
 private ArrayList<Prestamo> prestamos;
 private Horario horario;

 public Biblioteca(String nombre, String dias, String horaApertura, String horaCierre) {
     this.nombre = nombre;
     this.libros = new ArrayList<>();
     this.autores = new ArrayList<>();
     this.prestamos = new ArrayList<>();
     this.horario = new Horario(dias, horaApertura, horaCierre); 
 }

 public void agregarLibro(Libro libro) {
     libros.add(libro);
 }

 public void agregarAutor(Autor autor) {
     autores.add(autor);
 }

 public void prestarLibro(Estudiante estudiante, Libro libro) {
     Prestamo p = new Prestamo(estudiante, libro);
     prestamos.add(p);
     System.out.println("✅ Libro prestado a " + estudiante.getNombre() + ": " + libro.getTitulo());
 }

 public void mostrarEstado() {
     System.out.println("\n===== ESTADO DE LA BIBLIOTECA: " + nombre + " =====");
     horario.mostrarHorario();
     System.out.println("\n-- Libros disponibles --");
     for (Libro l : libros) {
         System.out.println("  • " + l.getTitulo());
     }

     System.out.println("\n-- Autores registrados --");
     for (Autor a : autores) {
         a.mostrarInfo();
     }

     System.out.println("\n-- Préstamos activos --");
     for (Prestamo p : prestamos) {
         p.mostrarInfo();
     }
 }

 public void cerrarBiblioteca() {
     System.out.println("\n📚 La biblioteca '" + nombre + "' ha cerrado.");
     prestamos.clear();
     System.out.println("Todos los préstamos fueron finalizados.");
 }

 class Horario {
     private String dias;
     private String horaApertura;
     private String horaCierre;

     public Horario(String dias, String horaApertura, String horaCierre) {
         this.dias = dias;
         this.horaApertura = horaApertura;
         this.horaCierre = horaCierre;
     }

     public void mostrarHorario() {
         System.out.println("Horario: " + dias + " de " + horaApertura + " a " + horaCierre);
     }
 }
}

class Libro {
 private String titulo;
 private String isbn;
 private ArrayList<Pagina> paginas;

 public Libro(String titulo, String isbn, String[] contenidos) {
     this.titulo = titulo;
     this.isbn = isbn;
     paginas = new ArrayList<>();
     for (int i = 0; i < contenidos.length; i++) {
         paginas.add(new Pagina(i + 1, contenidos[i]));
     }
 }

 public String getTitulo() {
     return titulo;
 }

 public void leer() {
     System.out.println("\n📖 Leyendo: " + titulo);
     for (Pagina p : paginas) {
         p.mostrarContenido();
     }
 }

 class Pagina {
     private int numero;
     private String contenido;

     public Pagina(int numero, String contenido) {
         this.numero = numero;
         this.contenido = contenido;
     }

     public void mostrarContenido() {
         System.out.println("Página " + numero + ": " + contenido);
     }
 }
}

class Autor {
 private String nombre;
 private String nacionalidad;

 public Autor(String nombre, String nacionalidad) {
     this.nombre = nombre;
     this.nacionalidad = nacionalidad;
 }

 public void mostrarInfo() {
     System.out.println("Autor: " + nombre + " (" + nacionalidad + ")");
 }
}

class Estudiante {
 private String codigo;
 private String nombre;

 public Estudiante(String codigo, String nombre) {
     this.codigo = codigo;
     this.nombre = nombre;
 }

 public String getNombre() {
     return nombre;
 }

 public void mostrarInfo() {
     System.out.println("Estudiante: " + nombre + " [Código: " + codigo + "]");
 }
}

class Prestamo {
 private String fechaPrestamo;
 private String fechaDevolucion;
 private Estudiante estudiante;
 private Libro libro;

 public Prestamo(Estudiante estudiante, Libro libro) {
     this.estudiante = estudiante;
     this.libro = libro;
     this.fechaPrestamo = new Date().toString();
     this.fechaDevolucion = "Pendiente";
 }

 public void mostrarInfo() {
     System.out.println("Préstamo -> Libro: " + libro.getTitulo() + 
                        ", Estudiante: " + estudiante.getNombre() + 
                        ", Fecha: " + fechaPrestamo);
 }
}