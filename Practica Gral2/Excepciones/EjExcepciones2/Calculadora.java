package EjExcepciones2;

public class Calculadora {

 public static int sumar(int a, int b) {
     return a + b;
 }

 public static int restar(int a, int b) {
     return a - b;
 }

 public static int multiplicar(int a, int b) {
     return a * b;
 }

 public static double dividir(double a, double b) {
     if (b == 0) {
         throw new ArithmeticException("Error: división entre cero");
     }
     return a / b;
 }

 public static int convertirEntero(String texto) throws NumeroInvalidoException {
     try {
         return Integer.parseInt(texto);
     } catch (NumberFormatException e) {
         throw new NumeroInvalidoException("No es un número válido: " + texto);
     }
 }
}

