package EjComposicion8;

public class Main {
    public static void main(String[] args) {

        SistemaEntrada sistema = new SistemaEntrada();

        // Facultades
        Facultad fi = new Facultad("Ingeniería", "FI");
        Facultad fd = new Facultad("Derecho", "FD");

        // Encargados (también son bailarines)
        Persona juan = new Persona("Juan", 30, "123");
        Persona mario = new Persona("Mario", 28, "456");

        // Fraternidades
        Fraternidad caporales = new Fraternidad("Caporales San Simón", juan);
        Fraternidad tinkus = new Fraternidad("Tinkus Tolkas", mario);

        // Participantes
        Persona ana = new Persona("Ana", 20, "111");
        Persona luis = new Persona("Luis", 22, "222");
        Persona carla = new Persona("Carla", 19, "333");

        // Registrar encargados
        sistema.registrarParticipante(juan, fi, caporales);
        sistema.registrarParticipante(mario, fi, tinkus);

        // Registrar otros participantes
        sistema.registrarParticipante(ana, fi, caporales);
        sistema.registrarParticipante(luis, fi, tinkus);
        sistema.registrarParticipante(carla, fd, caporales);

        System.out.println("\n========== ESTADO GENERAL ==========");
        sistema.mostrarParticipantes();

        // Mostrar fraternidades
        caporales.mostrarBailarines();
        tinkus.mostrarBailarines();

        // Mostrar facultades
        fi.mostrarBailarines();
        fd.mostrarBailarines();
    }
}
