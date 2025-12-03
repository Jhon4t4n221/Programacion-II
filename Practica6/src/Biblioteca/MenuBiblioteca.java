package Biblioteca;

import javax.swing.*;
import java.awt.event.*;

public class MenuBiblioteca extends JFrame {

    private Biblioteca biblioteca = new Biblioteca("UMSA");

    public MenuBiblioteca() {
        setTitle("Sistema Biblioteca UMSA");
        setSize(400, 300);
        setLayout(null);

        JButton btnAgregarLibro = new JButton("Agregar Libro");
        btnAgregarLibro.setBounds(100, 20, 200, 30);
        add(btnAgregarLibro);

        JButton btnMostrar = new JButton("Mostrar Estado");
        btnMostrar.setBounds(100, 70, 200, 30);
        add(btnMostrar);

        JButton btnGuardar = new JButton("Guardar Datos");
        btnGuardar.setBounds(100, 120, 200, 30);
        add(btnGuardar);

        btnAgregarLibro.addActionListener(e -> new AgregarLibroWindow(biblioteca));

        btnMostrar.addActionListener(e -> biblioteca.mostrarEstado());
        btnGuardar.addActionListener(e -> biblioteca.guardarDatos());

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MenuBiblioteca();
    }
}
