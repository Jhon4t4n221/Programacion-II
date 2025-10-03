package PoliEj11;

public class Pasajero {
    private String nombre;
    private int edad;
    private String genero;
    private int nroHabitacion;
    private double costoPasaje;

    public Pasajero(String nombre, int edad, String genero, int nroHabitacion, double costoPasaje) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.nroHabitacion = nroHabitacion;
        this.costoPasaje = costoPasaje;
    }

    public void mostrar() {
        System.out.println(this);
    }

    public void resumen() {
        System.out.println("Pasajero: " + nombre + " | Hab: " + nroHabitacion);
    }

    public double getCostoPasaje() {
        return costoPasaje;
    }

    public String getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return "Pasajero{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", genero='" + genero + '\'' +
                ", nroHabitacion=" + nroHabitacion +
                ", costoPasaje=" + costoPasaje +
                '}';
    }
}
