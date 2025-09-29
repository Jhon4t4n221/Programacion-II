package Ej2;
import java.util.Random;

public class Main {
public static void main(String[] args) {
   Random rand = new Random();
   Figura[] figuras = new Figura[5];
   String[] colores = {"Rojo", "Verde", "Azul", "Amarillo", "Negro"};

   // Crear aleatoriamente cuadrados o círculos
   for (int i = 0; i < figuras.length; i++) {
       int tipo = rand.nextInt(2) + 1; // 1=Cuadrado, 2=Círculo
       String color = colores[rand.nextInt(colores.length)];

       if (tipo == 1) {
           double lado = 1 + rand.nextInt(10); // lado entre 1 y 10
           figuras[i] = new Cuadrado(lado, color);
       } else {
           double radio = 1 + rand.nextInt(10); // radio entre 1 y 10
           figuras[i] = new Circulo(radio, color);
       }
   }

   // Mostrar datos de cada figura
   for (Figura f : figuras) {
       System.out.println(f.toString());
       System.out.println("Área: " + f.area());
       System.out.println("Perímetro: " + f.perimetro());

       if (f instanceof Coloreado) {
           Coloreado c = (Coloreado) f;
           System.out.println(c.comoColorear());
       }
       System.out.println("-----------------------");
   }
}
}