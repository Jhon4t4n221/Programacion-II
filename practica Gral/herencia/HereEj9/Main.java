package HereEj9;

public class Main {
    public static void main(String[] args) {
        Partido p1 = new Partido("Partido Liberal", "Gobernante");
        Partido p2 = new Partido("Partido Verde", "Oposición");

        Presidente pres1 = new Presidente("Carlos", "Lopez", "Abogado", 15, p1);
        Presidente pres2 = new Presidente("Maria", "Perez", "Economista", 12, new Partido("Partido Justicialista", "Gobernante"));

        System.out.println(pres1);
        System.out.println(pres2);

        Presidente[] presidentes = new Presidente[3];
        presidentes[0] = pres1;
        presidentes[1] = pres2;
        presidentes[2] = new Presidente("Juan", "Torres", "Ingeniero", 10, p2);

        String nombreBuscado = "Maria";
        boolean encontrado = false;
        for (Presidente pres : presidentes) {
            if (pres.getNombre().equalsIgnoreCase(nombreBuscado)) {
                System.out.println("\nEncontrado: " + pres.getNombre());
                System.out.println("Profesión: " + pres.getProfesion());
                System.out.println("Partido: " + pres.getPartido().getNombreP());
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("\nNo se encontró un presidente con el nombre " + nombreBuscado);
        }
    }
}
