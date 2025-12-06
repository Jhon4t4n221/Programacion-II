package Persistencia5;

public class Main {
    public static void main(String[] args) {

        ArchFarmacia arch = new ArchFarmacia("farmacias.dat");
        arch.crearArchivo();

        // Crear farmacia 1
        Farmacia f1 = new Farmacia("PharmaPlus", 1, "Av. Busch");
        f1.agregarMedicamento(new Medicamento("Tapsin", 100, "resfrio", 12));
        f1.agregarMedicamento(new Medicamento("Broncotos", 200, "tos", 18));

        // Crear farmacia 2
        Farmacia f2 = new Farmacia("MedicCenter", 2, "Av. Saavedra");
        f2.agregarMedicamento(new Medicamento("AntitusivoX", 300, "tos", 21));

        arch.guardarFarmacia(f1);
        arch.guardarFarmacia(f2);

        System.out.println("\nMedicamentos para la tos en sucursal 1:");
        arch.medicamentosTosSucursal(1);

        System.out.println("\nFarmacia con Tapsin:");
        arch.farmaciaConTapsin();

        System.out.println("\nBuscar medicamentos tipo 'tos':");
        arch.buscarPorTipo("tos");

        System.out.println("\nOrdenando farmacias por dirección...");
        arch.ordenarPorDireccion();

        System.out.println("\nMoviendo medicamentos tipo 'tos' de farmacia 1 a 2...");
        arch.moverMedicamentos("tos", 1, 2);
    }
}
