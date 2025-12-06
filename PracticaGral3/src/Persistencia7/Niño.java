package Persistencia7;

public class Niño extends Persona {
    private int edad;
    private double peso;
    private double talla;

    public Niño(String nombre, String apP, String apM, int ci, int edad, double peso, double talla) {
        super(nombre, apP, apM, ci);
        this.edad = edad;
        this.peso = peso;
        this.talla = talla;
    }

    public int getEdad() { return edad; }
    public double getPeso() { return peso; }
    public double getTalla() { return talla; }

    @Override
    public String toString() {
        return super.toString() + 
               " | Edad: " + edad + 
               " años | Peso: " + peso + 
               " kg | Talla: " + talla + " cm";
    }
}
