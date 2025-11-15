package EjComposicion8;

import java.util.ArrayList;

public class SistemaEntrada {
    private ArrayList<Persona> participantes = new ArrayList<>();

    public boolean verificarDuplicado(String ci) {
        for (Persona p : participantes) {
            if (p.getCi().equals(ci)) {
                return true;
            }
        }
        return false;
    }

    public void registrarParticipante(Persona p, Facultad f, Fraternidad fr) {
        if (verificarDuplicado(p.getCi())) {
            System.out.println(" ERROR: El participante con CI " + p.getCi() + " ya está registrado.");
            return;
        }

        p.setFacultad(f);
        p.setFraternidad(fr);

        participantes.add(p);
        f.agregarBailarin(p);
        fr.agregarBailarin(p);

        System.out.println(" Registrado: " + p.getNombre());
    }

    public void mostrarParticipantes() {
        System.out.println("\n===== LISTA DE PARTICIPANTES =====");
        for (Persona p : participantes) {
            p.mostrarInfo();
        }
    }
}
