package EjComposicion8;

public class Persona {
    private String nombre;
    private int edad;
    private String ci;
    private Facultad facultad;
    private Fraternidad fraternidad;

    public Persona(String nombre, int edad, String ci) {
        this.nombre = nombre;
        this.edad = edad;
        this.ci = ci;
    }

    public void setFacultad(Facultad facultad) {
        this.facultad = facultad;
    }

    public void setFraternidad(Fraternidad fraternidad) {
        this.fraternidad = fraternidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCi() {
        return ci;
    }

    public Fraternidad getFraternidad() {
        return fraternidad;
    }

    public Facultad getFacultad() {
        return facultad;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + 
                           ", Edad: " + edad +
                           ", CI: " + ci +
                           ", Facultad: " + facultad.getNombre() +
                           ", Fraternidad: " + fraternidad.getNombre());
    }
}
