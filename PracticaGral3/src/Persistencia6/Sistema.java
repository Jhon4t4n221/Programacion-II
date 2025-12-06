package Persistencia6;

import java.util.*;

public class Sistema {
    private ArchLibro archLibro = new ArchLibro();
    private ArchCliente archCliente = new ArchCliente();
    private ArchPrestamo archPrestamo = new ArchPrestamo();

    // envoltorios para agregar
    public void agregarLibro(Libro l) { archLibro.agregar(l); }
    public void agregarCliente(Cliente c) { archCliente.agregar(c); }
    public void agregarPrestamo(Prestamo p) { archPrestamo.agregar(p); }

    // a) listar libros entre dos precios
    public List<Libro> librosEntre(double x, double y) {
        List<Libro> out = new ArrayList<>();
        for (Libro l : archLibro.listar()) if (l.getPrecio() >= x && l.getPrecio() <= y) out.add(l);
        return out;
    }

    // b) ingreso total generado por un libro (multiplica cantidad*precio)
    public double ingresoPorLibro(String codLibro) {
        Libro lib = archLibro.buscarPorCodigo(codLibro);
        if (lib == null) return 0;
        double total = 0;
        for (Prestamo p : archPrestamo.listar()) if (p.getCodLibro().equalsIgnoreCase(codLibro))
            total += p.getCantidad() * lib.getPrecio();
        return total;
    }

    // c) libros nunca vendidos
    public List<Libro> librosNoVendidos() {
        List<Libro> resultado = new ArrayList<>();
        Set<String> vendidos = new HashSet<>();
        for (Prestamo p : archPrestamo.listar()) vendidos.add(p.getCodLibro());
        for (Libro l : archLibro.listar()) if (!vendidos.contains(l.getCodLibro())) resultado.add(l);
        return resultado;
    }

    // d) mostrar clientes que compraron un libro dado su código
    public List<Cliente> clientesQueCompraron(String codLibro) {
        List<Cliente> res = new ArrayList<>();
        Set<String> cods = new HashSet<>();
        for (Prestamo p : archPrestamo.listar()) {
            if (p.getCodLibro().equalsIgnoreCase(codLibro)) {
                if (!cods.contains(p.getCodCliente())) {
                    Cliente c = archCliente.buscarPorCodigo(p.getCodCliente());
                    if (c != null) {
                        res.add(c);
                        cods.add(c.getCodCliente());
                    }
                }
            }
        }
        return res;
    }

    // e) libro más prestado (por cantidad total)
    public Libro libroMasPrestado() {
        Map<String,Integer> mapa = new HashMap<>();
        for (Prestamo p : archPrestamo.listar()) {
            mapa.put(p.getCodLibro(), mapa.getOrDefault(p.getCodLibro(), 0) + p.getCantidad());
        }
        String maxCod = null; int max = -1;
        for (Map.Entry<String,Integer> e : mapa.entrySet()) {
            if (e.getValue() > max) { max = e.getValue(); maxCod = e.getKey(); }
        }
        return (maxCod == null) ? null : archLibro.buscarPorCodigo(maxCod);
    }

    // f) cliente que tuvo más préstamos (por cantidad total)
    public Cliente clienteMasPrestamos() {
        Map<String,Integer> mapa = new HashMap<>();
        for (Prestamo p : archPrestamo.listar()) {
            mapa.put(p.getCodCliente(), mapa.getOrDefault(p.getCodCliente(), 0) + p.getCantidad());
        }
        String maxCod = null; int max = -1;
        for (Map.Entry<String,Integer> e : mapa.entrySet()) {
            if (e.getValue() > max) { max = e.getValue(); maxCod = e.getKey(); }
        }
        return (maxCod == null) ? null : archCliente.buscarPorCodigo(maxCod);
    }

    // métodos de ayuda para listar
    public List<Libro> listarLibros() { return archLibro.listar(); }
    public List<Cliente> listarClientes() { return archCliente.listar(); }
    public List<Prestamo> listarPrestamos() { return archPrestamo.listar(); }
}
