package HereEj13;

public class Administrativo extends Empleado {
    String cargo;

    public Administrativo(String nombre, float sueldoMes, String cargo) {
        super(nombre, sueldoMes);
        this.cargo = cargo;
    }

    @Override
    public void mostrar() {
        System.out.println("Administrativo -> Nombre: " + nombre +
                           ", Cargo: " + cargo +
                           ", Sueldo mes: " + sueldoMes);
    }
}

