package EjComposicion4;

public class Ropero {
    private String material;
    private Ropa[] ropas;
    private int nroRopas;

    public Ropero(String material) {
        this.material = material;
        this.ropas = new Ropa[20];
        this.nroRopas = 0;
    }

    public void adicionar(Ropa r) {
        if (nroRopas < 20) {
            ropas[nroRopas] = r;
            nroRopas++;
        } else {
            System.out.println("Ropero lleno, no se puede agregar más ropa.");
        }
    }

    public void eliminarPorMaterial(String mat) {
        for (int i = 0; i < nroRopas; i++) {
            if (ropas[i].getMaterial().equalsIgnoreCase(mat)) {
                // eliminar desplazando
                for (int j = i; j < nroRopas - 1; j++) {
                    ropas[j] = ropas[j + 1];
                }
                nroRopas--;
                i--; // revisar posición nuevamente
            }
        }
    }

    public void eliminarPorTipo(String tipo) {
        for (int i = 0; i < nroRopas; i++) {
            if (ropas[i].getTipo().equalsIgnoreCase(tipo)) {
                for (int j = i; j < nroRopas - 1; j++) {
                    ropas[j] = ropas[j + 1];
                }
                nroRopas--;
                i--;
            }
        }
    }

    public void mostrarPorMaterial(String mat) {
        System.out.println("\nRopas con material: " + mat);
        for (int i = 0; i < nroRopas; i++) {
            if (ropas[i].getMaterial().equalsIgnoreCase(mat)) {
                System.out.println("  - " + ropas[i]);
            }
        }
    }

    public void mostrarPorTipo(String tipo) {
        System.out.println("\nRopas del tipo: " + tipo);
        for (int i = 0; i < nroRopas; i++) {
            if (ropas[i].getTipo().equalsIgnoreCase(tipo)) {
                System.out.println("  - " + ropas[i]);
            }
        }
    }
}
