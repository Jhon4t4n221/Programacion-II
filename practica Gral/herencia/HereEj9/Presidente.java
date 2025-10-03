package HereEj9;

public class Presidente extends Politico {
    private String nombre;
    private String apellido;
    private Partido partido;
    
    public Presidente(String nombre, String apellido, String profesion, int aniosExp, Partido partido) {
        super(profesion, aniosExp);
        this.nombre = nombre;
        this.apellido = apellido;
        this.partido = partido;
    }

    public String getNombre() {
        return nombre;
    }

    public Partido getPartido() {
        return partido;
    }

    @Override
    public String toString() {
        return "Presidente: " + nombre + " " + apellido + ", " + super.toString() + ", " + partido.toString();
    }
}
