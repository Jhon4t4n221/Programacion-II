package Persistencia1;
public class Charango {

    private String material;
    private int nroCuerdas;
    private boolean[] cuerdas = new boolean[10];

    public Charango(String material, int nroCuerdas, boolean[] cuerdas) {
        this.material = material;
        this.nroCuerdas = nroCuerdas;
        for (int i = 0; i < 10; i++) {
            this.cuerdas[i] = cuerdas[i];
        }
    }

    public String getMaterial() {
        return material;
    }

    public int getNroCuerdas() {
        return nroCuerdas;
    }

    public int contarCuerdasFalsas() {
        int c = 0;
        for (boolean estado : cuerdas) {
            if (!estado) c++;
        }
        return c;
    }

    @Override
    public String toString() {
        return "Charango{" +
                "material='" + material + '\'' +
                ", nroCuerdas=" + nroCuerdas +
                ", cuerdasFalsas=" + contarCuerdasFalsas() +
                '}';
    }
}
