package EjComposicion10;

public class Charla {
    String lugar;
    String nombreCharla;
    Speaker S;
    int np;  // número de participantes
    Participante[] P = new Participante[50];

    public Charla(String lugar, String nombreCharla, Speaker S) {
        this.lugar = lugar;
        this.nombreCharla = nombreCharla;
        this.S = S;
        this.np = 0;
    }

    public void agregarParticipante(Participante part) {
        if (np < 50) {
            P[np] = part;
            np++;
        }
    }

    public Speaker getSpeaker() { return S; }
    public int getNumParticipantes() { return np; }
}
