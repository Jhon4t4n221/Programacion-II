package PooEj7;

public class Main {
    public static void main(String[] args) {
        Mascota m1 = new Mascota("Juanchito", "Pequines", 60);
        Mascota m2 = new Mascota("Pepa", "Gato Persa", 50);

        m1.mostrarDatos();
        m1.alimentar(); 
        m1.jugar();   
        System.out.println();

        m2.mostrarDatos();
        m2.alimentar();
        m2.jugar();
    }
}
