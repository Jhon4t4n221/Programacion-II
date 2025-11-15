package EjComposicion4;

public class Ropa {
    private String tipo;
    private String material;

    public Ropa(String tipo, String material) {
        this.tipo = tipo;
        this.material = material;
    }

    public String getTipo() {
        return tipo;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return "Ropa [Tipo=" + tipo + ", Material=" + material + "]";
    }
}
