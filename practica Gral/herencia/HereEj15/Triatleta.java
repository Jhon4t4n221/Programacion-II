package HereEj15;

class Triatleta implements Nadador, Ciclista, Corredor {
    String estiloNatacion;
    String tipoBicicleta;
    int distanciaPreferida;

    public Triatleta(String estiloNatacion, String tipoBicicleta, int distanciaPreferida) {
        this.estiloNatacion = estiloNatacion;
        this.tipoBicicleta = tipoBicicleta;
        this.distanciaPreferida = distanciaPreferida;
    }

    @Override
    public void nadar() {
        System.out.println("Nadando estilo " + estiloNatacion);
    }

    @Override
    public void pedalear() {
        System.out.println("Pedaleando en bicicleta tipo " + tipoBicicleta);
    }

    @Override
    public void correr() {
        System.out.println("Corriendo una distancia de " + distanciaPreferida + " km");
    }
}
