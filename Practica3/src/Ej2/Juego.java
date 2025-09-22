package Ej2;

import java.util.Random;
import java.util.Scanner;

class Juego {
    protected int numeroDeVidas;
    protected int record;

    public void reiniciaPartida() {
        numeroDeVidas = 3;
    }

    public void actualizaRecord() {
        if (numeroDeVidas > record) {
            record = numeroDeVidas;
        }
    }

    public boolean quitaVida() {
        numeroDeVidas--;
        return numeroDeVidas > 0;
    }
}

class JuegoAdivinaNumero extends Juego {
    protected int numeroAAdivinar;

    public JuegoAdivinaNumero(int vidas) {
        this.numeroDeVidas = vidas;
    }

    public boolean validaNumero(int num) {
        return (num >= 0 && num <= 10);
    }

    public void juega() {
        reiniciaPartida();
        Random rand = new Random();
        numeroAAdivinar = rand.nextInt(11); 
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Adivina un número entre 0 y 10: ");
            int intento = sc.nextInt();

            if (!validaNumero(intento)) {
                System.out.println("Número inválido, intenta de nuevo.");
                continue;
            }

            if (intento == numeroAAdivinar) {
                System.out.println("¡Acertaste!");
                actualizaRecord();
                break;
            } else {
                if (quitaVida()) {
                    if (intento < numeroAAdivinar) {
                        System.out.println("El número es mayor. Intenta de nuevo.");
                    } else {
                        System.out.println("El número es menor. Intenta de nuevo.");
                    }
                } else {
                    System.out.println("No te quedan más vidas. Fin del juego.");
                    break;
                }
            }
        }
    }
}

class JuegoAdivinaPar extends JuegoAdivinaNumero {
    public JuegoAdivinaPar(int vidas) {
        super(vidas);
    }

    @Override
    public boolean validaNumero(int num) {
        if (num < 0 || num > 10) return false;
        if (num % 2 == 0) return true;
        System.out.println("Error: el número debe ser PAR.");
        return false;
    }
}

class JuegoAdivinaImpar extends JuegoAdivinaNumero {
    public JuegoAdivinaImpar(int vidas) {
        super(vidas);
    }

    @Override
    public boolean validaNumero(int num) {
        if (num < 0 || num > 10) return false;
        if (num % 2 != 0) return true;
        System.out.println("Error: el número debe ser IMPAR.");
        return false;
    }
}

