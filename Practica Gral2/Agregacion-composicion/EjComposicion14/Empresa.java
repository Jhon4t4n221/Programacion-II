package EjComposicion14;

import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private ArrayList<Empleado> empleados;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado e) {
        empleados.add(e);
    }

    public void mostrarInfo() {
        System.out.println("Empresa: " + nombre);
        System.out.println("Lista de empleados:");
        
        for (Empleado e : empleados) {
            e.mostrarInfo();
        }
    }

    public Empleado buscarEmpleado(String nombre) {
        for (Empleado e : empleados) {
            if (e.getNombre().equalsIgnoreCase(nombre)) {
                return e;
            }
        }
        return null;
    }

    public boolean eliminarEmpleado(String nombre) {
        Empleado e = buscarEmpleado(nombre);
        if (e != null) {
            empleados.remove(e);
            return true;
        }
        return false;
    }

    public double promedioSalarial() {
        if (empleados.isEmpty()) return 0;

        double suma = 0;
        for (Empleado e : empleados) {
            suma += e.getSalario();
        }
        return suma / empleados.size();
    }

    public void empleadosConSalarioMayorA(double valor) {
        System.out.println("Empleados con salario mayor a " + valor + ":");
        for (Empleado e : empleados) {
            if (e.getSalario() > valor) {
                e.mostrarInfo();
            }
        }
    }
}
