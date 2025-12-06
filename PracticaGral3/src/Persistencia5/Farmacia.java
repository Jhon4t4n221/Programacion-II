package Persistencia5;

import java.io.Serializable;

public class Farmacia implements Serializable {

    private String nombreFarmacia;
    private int sucursal;
    private String direccion;
    private Medicamento[] medicamentos;
    private int nroM;

    public Farmacia(String nombreFarmacia, int sucursal, String direccion) {
        this.nombreFarmacia = nombreFarmacia;
        this.sucursal = sucursal;
        this.direccion = direccion;
        this.medicamentos = new Medicamento[100];
        this.nroM = 0;
    }

    public String getNombreFarmacia() { return nombreFarmacia; }
    public int getSucursal() { return sucursal; }
    public String getDireccion() { return direccion; }
    public int getNroM() { return nroM; }
    public Medicamento[] getMedicamentos() { return medicamentos; }

    public void agregarMedicamento(Medicamento m) {
        if (nroM < 100)
            medicamentos[nroM++] = m;
    }

    // Buscar medicamentos por tipo
    public void mostrarMedicamentosPorTipo(String tipo) {
        for (int i = 0; i < nroM; i++) {
            if (medicamentos[i].getTipo().equalsIgnoreCase(tipo)) {
                medicamentos[i].mostrar();
            }
        }
    }

    // Buscar un medicamento específico
    public boolean contieneMedicamento(String nombre) {
        for (int i = 0; i < nroM; i++) {
            if (medicamentos[i].getNombre().equalsIgnoreCase(nombre))
                return true;
        }
        return false;
    }

    // Mostrar sólo para defensa
    public void mostrar() {
        System.out.println("\nFarmacia: " + nombreFarmacia +
                " | Sucursal: " + sucursal +
                " | Dirección: " + direccion);
        for (int i = 0; i < nroM; i++) {
            medicamentos[i].mostrar();
        }
    }
}
