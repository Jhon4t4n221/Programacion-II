package Ej2;

public class Cabina {
    int nroCabina;
    Persona[] personasAbordo = new Persona[10];
    int cantidad = 0; 

    public Cabina(int nroCabina) {
        this.nroCabina = nroCabina;
    }

    public void agregarPersona(Persona p) {
        personasAbordo[cantidad++] = p;
    }

    public float pesoTotal() {
        float suma = 0;
        for(int i = 0; i < cantidad; i++){
            suma += personasAbordo[i].pesoPersona;
        }
        return suma;
    }
}

