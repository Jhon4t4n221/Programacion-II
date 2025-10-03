package HereEj11;

public class JefePolicia extends Empleado implements Policia {
    private String grado;
    private String unidad;

    public JefePolicia(String nombre, int edad, double sueldo, String departamento, String grado, String unidad) {
        super(nombre, edad, sueldo, departamento);
        this.grado = grado;
        this.unidad = unidad;
    }

    @Override
    public String getGrado() {
        return grado;
    }

    @Override
    public String getUnidad() {
        return unidad;
    }

    @Override
    public String toString() {
        return super.toString() + ", Grado: " + grado + ", Unidad: " + unidad;
    }
}
