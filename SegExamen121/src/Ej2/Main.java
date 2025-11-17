package Ej2;
public class Main {
    public static void main(String[] args) {

        MiTeleferico miT = new MiTeleferico();

        Linea rojo = new Linea("Rojo");
        Linea Amarillo = new Linea("Amarillo");
        Linea verde = new Linea("Verde");

        miT.lineas[miT.cantidadLineas++] = rojo;
        miT.lineas[miT.cantidadLineas++] = Amarillo;
        miT.lineas[miT.cantidadLineas++] = verde;

        miT.agregarCabina("Rojo");   
        miT.agregarCabina("Amarillo");   
        miT.agregarCabina("Verde");  

        miT.agregarPersonaFila(new Persona("Juan", 20, 70), "Rojo");
        miT.agregarPersonaFila(new Persona("Maria", 30, 60), "Amarillo");
        miT.agregarPersonaFila(new Persona("Luis", 65, 80), "Verde");
        
        miT.agregarPrimeraPersonaCabina("Rojo", 1);
        miT.agregarPrimeraPersonaCabina("Amarillo", 1);
        miT.agregarPrimeraPersonaCabina("Verde", 1);

        System.out.println("\n¿Reglas correctas?: " + miT.verificarReglas());

        float ingreso = miT.calcularIngreso();
        System.out.println("\nIngreso total del Teleférico: " + ingreso + " Bs");

        miT.lineaMayorIngresoRegular();
    }
}
