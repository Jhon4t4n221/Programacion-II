package EjComposicion2;
import java.util.ArrayList;

public class Departamento {
    private String nombre;
    private String area;
    private ArrayList<Empleado> empleados;

    public Departamento(String nombre, String area) {
        this.nombre = nombre;
        this.area = area;
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado e) {
        empleados.add(e);
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void mostrarEmpleados() {
        System.out.println("\nDepartamento: " + nombre);
        if (empleados.isEmpty()) {
            System.out.println("  (No tiene empleados)");
            return;
        }
        for (Empleado e : empleados) {
            System.out.println("  - " + e.toString());
        }
    }

    public void cambioSalario(double nuevoSalario) {
        for (Empleado e : empleados) {
            e.setSueldo(nuevoSalario);
        }
    }

    public boolean buscarEmpleado(String nombre) {
        for (Empleado e : empleados) {
            if (e.getNombre().equalsIgnoreCase(nombre)) {
                return true;
            }
        }
        return false;
    }
}
