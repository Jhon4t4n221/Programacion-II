package Persistencia8;

public class Alimento {

    public String nombre;
    public String fechaVencimiento; 
    public int cantidad;

    public Alimento(String nombre, String fechaVencimiento, int cantidad) {
        this.nombre = nombre;
        this.fechaVencimiento = fechaVencimiento;
        this.cantidad = cantidad;
    }
}
