package EjExcepciones2;

//==========================
//PROGRAMA PRINCIPAL
//==========================
public class Main {

 public static void main(String[] args) {

     try {
         System.out.println("=== Pruebas normales ===");
         System.out.println(Calculadora.sumar(10, 5));
         System.out.println(Calculadora.restar(20, 3));
         System.out.println(Calculadora.multiplicar(4, 7));
         System.out.println(Calculadora.dividir(12, 3));

         System.out.println("=== Conversión válida ===");
         int n = Calculadora.convertirEntero("123");
         System.out.println(n);

         System.out.println("=== Prueba división por cero ===");
         Calculadora.dividir(10, 0);

         System.out.println("=== Prueba string inválido ===");
         Calculadora.convertirEntero("abc");

     } catch (ArithmeticException e) {
         System.out.println("Error aritmético: " + e.getMessage());

     } catch (NumeroInvalidoException e) {
         System.out.println("Número inválido: " + e.getMessage());

     } catch (Exception e) {
         System.out.println("Error general: " + e.getMessage());
     }
 }
}

