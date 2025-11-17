package Ej2;
import java.util.*;
public class MiTeleferico {
    Linea[] lineas = new Linea[4];
    int cantidadLineas = 0;
    float cantidadIngresos = 0;

    public MiTeleferico() {}

    public void agregarCabina(String lineaColor) {
        for(int i = 0; i < cantidadLineas; i++){
            if(lineas[i].color.equals(lineaColor)){
                Cabina nueva = new Cabina(lineas[i].cantidadCabinas + 1);
                lineas[i].agregarCabina(nueva);
            }
        }
    }

    public void agregarPersonaFila(Persona p, String lineaColor) {
        for(int i = 0; i < cantidadLineas; i++){
            if(lineas[i].color.equals(lineaColor)){
                lineas[i].agregarPersona(p);
                System.out.println("Se agregó una persona más a la fila");
            }
        }
    }

    public void agregarPrimeraPersonaCabina(String lineaColor, int nroCabina){
        for (int i = 0; i < cantidadLineas; i++) {
            if (lineas[i].color.equals(lineaColor)) {
                Linea l = lineas[i];
                for (int j = 0; j < l.cantidadCabinas; j++) {
                    Cabina c = l.cabinas[j];
                    if (c.nroCabina == nroCabina && c.cantidad == 0) {
                        Persona p = l.filaPersonas[0];
                        if (c.cantidad < 10 && c.pesoTotal() + p.pesoPersona <= 850) {
                            c.agregarPersona(p);
                            System.out.println("Se agrego el primer pasajero a la linea: "+lineaColor+" a la cabina: "+nroCabina);
                        }
                        return;
                    }
                }
            }
        }
    }

    public boolean verificarReglas() {
        for (int i = 0; i < cantidadLineas; i++) {
            Linea l = lineas[i];
            for(int j = 0; j < l.cantidadCabinas; j++){
                Cabina c = l.cabinas[j];
                if(c.cantidad > 10) return false;
                if(c.pesoTotal() > 850) return false;
            }
        }
        return true;
    }

    public float calcularIngreso() {
        cantidadIngresos = 0;
        for(int i = 0; i < cantidadLineas; i++){
            Linea l = lineas[i];
            for(int j = 0; j < l.cantidadCabinas; j++){
                Cabina c = l.cabinas[j];
                for(int k = 0; k < c.cantidad; k++){
                    Persona p = c.personasAbordo[k];
                    if(p.edad < 25 || p.edad > 60){
                        cantidadIngresos += 1.5f; 
                    } else {
                        cantidadIngresos += 3f;
                    }
                }
            }
        }
        return cantidadIngresos;
    }

    public void lineaMayorIngresoRegular() {
        float mayor = -1;
        String colorMayor = "";
        for(int i = 0; i < cantidadLineas; i++){
            Linea l = lineas[i];
            float ingreso = 0;
            for(int j = 0; j < l.cantidadCabinas; j++){
                Cabina c = l.cabinas[j];
                for(int k = 0; k < c.cantidad; k++){
                    Persona p = c.personasAbordo[k];
                    if(p.edad >= 25 && p.edad <= 60){
                        ingreso += 3;
                    }
                }
            }
            if(ingreso > mayor){
                mayor = ingreso;
                colorMayor = l.color;
            }
        }
        System.out.println("Línea con mayor ingreso regular: " + colorMayor);
    }
}

