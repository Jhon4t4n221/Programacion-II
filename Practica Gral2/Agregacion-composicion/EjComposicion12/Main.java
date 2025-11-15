package EjComposicion12;

public class Main {
    public static void main(String[] args) {

        Doctor d1 = new Doctor("Juan Pérez", "Cardiología");
        Doctor d2 = new Doctor("María López", "Traumatología");
        Doctor d3 = new Doctor("Luis García", "Neurología");

        Hospital h1 = new Hospital("Hospital Arco Iris");
        Hospital h2 = new Hospital("Hospital Obrero");

        h1.agregarDoctor(d1);
        h1.agregarDoctor(d2);

        h2.agregarDoctor(d2);
        h2.agregarDoctor(d3);

        h1.mostrarDoctores();
        h2.mostrarDoctores();
    }
}
