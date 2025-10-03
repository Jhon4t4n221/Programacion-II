package HereEj11;

public class Empleado extends Persona {
    private double sueldo;
    private String departamento;

    public Empleado(String nombre, int edad, double sueldo, String departamento) {
        super(nombre, edad);
        this.sueldo = sueldo;
        this.departamento = departamento;
    }

    public double getSueldo() {
        return sueldo;
    }

    public String getDepartamento() {
        return departamento;
    }

    @Override
    public String toString() {
        return super.toString() + ", Sueldo: " + sueldo + ", Departamento: " + departamento;
    }
}