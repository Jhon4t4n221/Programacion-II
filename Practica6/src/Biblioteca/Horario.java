package Biblioteca;

public class Horario {
    private String dias;
    private String inicio;
    private String fin;

    public Horario(String d, String i, String f) {
        dias = d; inicio = i; fin = f;
    }

    public void mostrarHorario() {
        System.out.println("Horario: " + dias + " " + inicio + "-" + fin);
    }
}
