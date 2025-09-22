package Ej2;

public class Aplicacion {
    public static void main(String[] args) {
        JuegoAdivinaNumero j1 = new JuegoAdivinaNumero(3);
        JuegoAdivinaPar j2 = new JuegoAdivinaPar(3);
        JuegoAdivinaImpar j3 = new JuegoAdivinaImpar(3);

        System.out.println("\n--- Juego normal ---");
        j1.juega();

        System.out.println("\n--- Juego de números pares ---");
        j2.juega();

        System.out.println("\n--- Juego de números impares ---");
        j3.juega();
    }
}
