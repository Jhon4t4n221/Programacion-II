package EjComposicion10;

public class Aplicacion {
    public static void main(String[] args) {

        // Speakers
        Speaker sp1 = new Speaker("Juan", "Rojas", 45, 1111, "IA");
        Speaker sp2 = new Speaker("Maria", "López", 39, 2222, "Blockchain");

        // Participantes
        Participante p1 = new Participante("Carlos", "Paz", 22, 9001, 101);
        Participante p2 = new Participante("Ana", "Rios", 25, 9002, 102);
        Participante p3 = new Participante("Luis", "Flores", 30, 9003, 103);

        // Charlas
        Charla c1 = new Charla("Auditorio A", "Introducción IA", sp1);
        Charla c2 = new Charla("Auditorio B", "Avances Blockchain", sp2);

        c1.agregarParticipante(p1);
        c1.agregarParticipante(p2);
        c2.agregarParticipante(p3);

        // Evento
        Evento evento = new Evento("Tech Conference 2025");
        evento.agregarCharla(c1);
        evento.agregarCharla(c2);

        // ============================
        // a) Edad promedio
        // ============================
        System.out.println("\nA) Edad promedio: " + calcularPromedioEdad(evento));

        // ============================
        // b) Buscar persona por nombre/apellido
        // ============================
        System.out.println("\nB) ¿Está Carlos Paz? -> " +
            buscarPersona(evento, "Carlos", "Paz"));

        System.out.println("¿Está Miguel Torres? -> " +
            buscarPersona(evento, "Miguel", "Torres"));

        // ============================
        // c) Eliminar charlas del speaker con CI 1111
        // ============================
        eliminarCharlasDeSpeaker(evento, 1111);
        System.out.println("\nC) Charlas luego de eliminar al speaker CI=1111: " + evento.nc);

        // ============================
        // d) Ordenar charlas por número de participantes
        // ============================
        ordenarCharlas(evento);
        System.out.println("\nD) Charlas ordenadas por participantes:");
        for (int i = 0; i < evento.nc; i++) {
            System.out.println(evento.C[i].nombreCharla + " -> " +
                evento.C[i].getNumParticipantes() + " participantes");
        }
    }

    // ========== A: Promedio ===================
    public static double calcularPromedioEdad(Evento ev) {
        int suma = 0, cont = 0;
        for (int i = 0; i < ev.nc; i++) {
            Charla ch = ev.C[i];
            for (int j = 0; j < ch.np; j++) {
                suma += ch.P[j].getEdad();
                cont++;
            }
        }
        return (cont == 0) ? 0 : (double) suma / cont;
    }

    // ========== B: Buscar persona ===================
    public static boolean buscarPersona(Evento ev, String nombre, String apellido) {
        for (int i = 0; i < ev.nc; i++) {
            Charla ch = ev.C[i];

            // Revisar speaker
            if (ch.S.getNombre().equals(nombre) &&
                ch.S.getApellido().equals(apellido)) {
                return true;
            }

            // Revisar participantes
            for (int j = 0; j < ch.np; j++) {
                Participante p = ch.P[j];
                if (p.getNombre().equals(nombre) &&
                    p.getApellido().equals(apellido)) {
                    return true;
                }
            }
        }
        return false;
    }

    // ========== C: Eliminar charlas ===================
    public static void eliminarCharlasDeSpeaker(Evento ev, int ci) {
        for (int i = 0; i < ev.nc; i++) {
            if (ev.C[i].S.getCi() == ci) {

                // mover todo a la izquierda
                for (int j = i; j < ev.nc - 1; j++) {
                    ev.C[j] = ev.C[j + 1];
                }
                ev.nc--;
                i--; // revisar la nueva posición
            }
        }
    }

    // ========== D: Ordenar charlas por #participantes ===================
    public static void ordenarCharlas(Evento ev) {
        for (int i = 0; i < ev.nc - 1; i++) {
            for (int j = i + 1; j < ev.nc; j++) {
                if (ev.C[i].getNumParticipantes() > ev.C[j].getNumParticipantes()) {
                    Charla aux = ev.C[i];
                    ev.C[i] = ev.C[j];
                    ev.C[j] = aux;
                }
            }
        }
    }
}
