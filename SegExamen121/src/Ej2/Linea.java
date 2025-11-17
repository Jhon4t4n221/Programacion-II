package Ej2;

public class Linea {
    String color;
    Persona[] filaPersonas = new Persona[50];
    Cabina[] cabinas = new Cabina[50];
    int cantidadCabinas = 0;
    int cantidadFila = 0;

    public Linea(String color) {
        this.color = color;
    }

    public void agregarPersona(Persona p) {
        filaPersonas[cantidadFila++] = p;
    }

    public void agregarCabina(Cabina cab) {
        cabinas[cantidadCabinas++] = cab;
    }
}

