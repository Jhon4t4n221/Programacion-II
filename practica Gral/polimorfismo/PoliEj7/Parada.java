package PoliEj7;

public class Parada {
    private String admin[];
    private String autos[][];
    private String nombreP;
    private int nroAdmins;
    private int nroAutos;
    public Parada() {
        admin = new String[10];
        autos = new String[10][3];
        nombreP = "Parada Default";
        nroAdmins = 0;
        nroAutos = 0;
    }

    public Parada(String nombreP, int capacidadAdmins, int capacidadAutos) {
        this.nombreP = nombreP;
        admin = new String[capacidadAdmins];
        autos = new String[capacidadAutos][3];
        nroAdmins = 0;
        nroAutos = 0;
    }

    public void mostrar() {
        System.out.println("Parada: " + nombreP);
        System.out.println("Administradores:");
        for (int i = 0; i < nroAdmins; i++) {
            System.out.println(" - " + admin[i]);
        }

        System.out.println("Autos:");
        for (int i = 0; i < nroAutos; i++) {
            System.out.println(" - Modelo: " + autos[i][0] + ", Auto: " + autos[i][1] + ", Conductor: " + autos[i][2]);
        }
        System.out.println();
    }

    public void adicionar(String nuevoAdmin) {
        if (nroAdmins < admin.length) {
            admin[nroAdmins] = nuevoAdmin;
            nroAdmins++;
        } else {
            System.out.println("No hay espacio para más administradores.");
        }
    }

    public void adicionar(String modelo, String auto, String conductor) {
        if (nroAutos < autos.length) {
            autos[nroAutos][0] = modelo;
            autos[nroAutos][1] = auto;
            autos[nroAutos][2] = conductor;
            nroAutos++;
        } else {
            System.out.println("No hay espacio para más autos.");
        }
    }
}
