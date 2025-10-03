package PooEj7;

public class Mascota {
    private String nom;
    private String raza;
    private int energia;

    public Mascota(String nom, String raza, int energia) {
        this.nom = nom;
        this.raza = raza;
        this.energia = energia;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + this.nom);
        System.out.println("Raza de mascota: " + this.raza);
        System.out.println("Energía: " + this.energia);
    }

    public void alimentar() {
        this.energia += 20;
        if (this.energia > 100) {
            this.energia = 100;
        }
        System.out.println(this.nom + " acaba de comer, energía actual: " + this.energia);
    }

    public void jugar() {
        this.energia -= 15;
        if (this.energia < 0) {
            this.energia = 0;
        }
        System.out.println(this.nom + " acaba de jugar, energía actual: " + this.energia);
    }
}

