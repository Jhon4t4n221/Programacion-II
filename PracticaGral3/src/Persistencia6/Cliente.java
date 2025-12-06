package Persistencia6;

public class Cliente {
    private String codCliente;
    private String ci;
    private String nombre;
    private String apellido;

    public Cliente() {}

    public Cliente(String codCliente, String ci, String nombre, String apellido) {
        this.codCliente = codCliente;
        this.ci = ci;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getCodCliente() { return codCliente; }
    public String getCi() { return ci; }
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }

    @Override
    public String toString() {
        return codCliente + " | " + nombre + " " + apellido + " (CI: " + ci + ")";
    }
}

