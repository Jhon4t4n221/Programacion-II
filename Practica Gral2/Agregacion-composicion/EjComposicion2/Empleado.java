package EjComposicion2;

public class Empleado {
    private String nombre;
    private String cargo;
    private double sueldo;

    public Empleado(String nombre, String cargo, double sueldo) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setSueldo(double nuevoSueldo) {
        this.sueldo = nuevoSueldo;
    }

    @Override
    public String toString() {
        return "Empleado [Nombre=" + nombre + ", Cargo=" + cargo + ", Sueldo=" + sueldo + "]";
    }
}


