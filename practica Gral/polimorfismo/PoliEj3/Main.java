package PoliEj3;
public class Main {
    public static void main(String[] args) {
        Matriz m1 = new Matriz();
        System.out.println("Matriz identidad:");
        m1.mostrar();

        float[][] valores = new float[10][10];
        for (int i = 0; i < 10; i++)
            for (int j = 0; j < 10; j++)
                valores[i][j] = i + j; 
        Matriz m2 = new Matriz(valores);

        System.out.println("Matriz personalizada:");
        m2.mostrar();

        Matriz suma = m1.sumar(m2);
        System.out.println("Suma de matrices:");
        suma.mostrar();

        Matriz resta = m2.restar(m1);
        System.out.println("Resta de matrices:");
        resta.mostrar();

        System.out.println("m1 igual a m2? " + m1.igual(m2));
        System.out.println("m1 igual a m1? " + m1.igual(m1));
    }
}
