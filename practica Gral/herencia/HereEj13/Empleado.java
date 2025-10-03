package HereEj13;

public class Empleado {
    String nombre;
    float sueldoMes;

    public Empleado(String nombre, float sueldoMes) {
        this.nombre = nombre;
        this.sueldoMes = sueldoMes;
    }

    public float sueldoTotal() {
        return sueldoMes;
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre + " | Sueldo mes: " + sueldoMes);
    }
}

