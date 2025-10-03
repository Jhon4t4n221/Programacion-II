package HereEj13;

public class Chef extends Empleado {
    int horaExtra;
    String tipo;
    float sueldoHora;

    public Chef(String nombre, float sueldoMes, int horaExtra, String tipo, float sueldoHora) {
        super(nombre, sueldoMes);
        this.horaExtra = horaExtra;
        this.tipo = tipo;
        this.sueldoHora = sueldoHora;
    }

    public float sueldoTotal(boolean conExtras) {
        if (conExtras) {
            return sueldoMes + (horaExtra * sueldoHora);
        }
        return sueldoMes;
    }

    @Override
    public void mostrar() {
        System.out.println("Chef -> Nombre: " + nombre +
                           ", Tipo: " + tipo +
                           ", Sueldo mes: " + sueldoMes +
                           ", Horas extra: " + horaExtra);
    }
}
