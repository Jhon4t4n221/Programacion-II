package HereEj13;

public class Mesero extends Empleado {
    double propina;
    int horaExtra;
    float sueldoHora;

    public Mesero(String nombre, float sueldoMes, double propina, int horaExtra, float sueldoHora) {
        super(nombre, sueldoMes);
        this.propina = propina;
        this.horaExtra = horaExtra;
        this.sueldoHora = sueldoHora;
    }

    public float sueldoTotal(boolean conExtras, boolean conPropina) {
        float total = sueldoMes;
        if (conExtras) total += horaExtra * sueldoHora;
        if (conPropina) total += propina;
        return total;
    }

    @Override
    public void mostrar() {
        System.out.println("Mesero -> Nombre: " + nombre +
                           ", Sueldo mes: " + sueldoMes +
                           ", Propina: " + propina +
                           ", Horas extra: " + horaExtra);
    }
}
