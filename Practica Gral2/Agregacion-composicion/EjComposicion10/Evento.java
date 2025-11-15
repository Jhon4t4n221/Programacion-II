package EjComposicion10;

public class Evento {
    String nombre;
    int nc = 0; // número de charlas
    Charla[] C = new Charla[50];

    public Evento(String nombre) {
        this.nombre = nombre;
    }

    public void agregarCharla(Charla charla) {
        if (nc < 50) {
            C[nc] = charla;
            nc++;
        }
    }
}
