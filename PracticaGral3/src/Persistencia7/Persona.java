package Persistencia7;

import java.io.Serializable;

public class Persona implements Serializable {
    protected String nombre;
    protected String apellidoPaterno;
    protected String apellidoMaterno;
    protected int ci;

    public Persona(String nombre, String apP, String apM, int ci) {
        this.nombre = nombre;
        this.apellidoPaterno = apP;
        this.apellidoMaterno = apM;
        this.ci = ci;
    }

    public int getCi() { return ci; }

    @Override
    public String toString() {
        return nombre + " " + apellidoPaterno + " " + apellidoMaterno + " (CI: " + ci + ")";
    }
}

