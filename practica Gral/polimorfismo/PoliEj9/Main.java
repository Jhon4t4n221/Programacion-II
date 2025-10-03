package PoliEj9;

public class Main {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Ana", "Lopez", 25, 28, 35);
        Estudiante e2 = new Estudiante();  
        Estudiante e3 = new Estudiante("Pedro", "Gomez");  


        e1.notaFinal();
        e1.notaFinal(true);
        System.out.println();

        e2.mostrar();
        e2.mostrar(true);
        System.out.println();

        e3.aprobo();
        e3.aprobo(60);
        e3.aproboExtra(10);
    }
}
