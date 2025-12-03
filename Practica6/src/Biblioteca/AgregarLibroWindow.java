package Biblioteca;

import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class AgregarLibroWindow extends JFrame {

    private JTextField txtTitulo;
    private JTextField txtISBN;
    private JTextField txtNumPagina;
    private JTextField txtContenidoPagina;
    private JButton btnAgregarPagina;
    private JButton btnGuardarLibro;
    private DefaultListModel<String> modeloListaPaginas;
    private JList<String> listaPaginas;

    private List<Pagina> paginas = new ArrayList<>();
    private Biblioteca biblioteca;

    public AgregarLibroWindow(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;

        setTitle("Agregar Libro");
        setSize(450, 500);
        setLayout(null);

        JLabel lblTitulo = new JLabel("Título:");
        lblTitulo.setBounds(30, 20, 100, 25);
        add(lblTitulo);

        txtTitulo = new JTextField();
        txtTitulo.setBounds(150, 20, 200, 25);
        add(txtTitulo);

        JLabel lblISBN = new JLabel("ISBN:");
        lblISBN.setBounds(30, 60, 100, 25);
        add(lblISBN);

        txtISBN = new JTextField();
        txtISBN.setBounds(150, 60, 200, 25);
        add(txtISBN);

        // Sección para páginas
        JLabel lblPaginas = new JLabel("Agregar Página");
        lblPaginas.setBounds(30, 110, 200, 25);
        add(lblPaginas);

        JLabel lblNum = new JLabel("Número:");
        lblNum.setBounds(30, 145, 100, 25);
        add(lblNum);

        txtNumPagina = new JTextField();
        txtNumPagina.setBounds(150, 145, 80, 25);
        add(txtNumPagina);

        JLabel lblContenido = new JLabel("Contenido:");
        lblContenido.setBounds(30, 180, 100, 25);
        add(lblContenido);

        txtContenidoPagina = new JTextField();
        txtContenidoPagina.setBounds(150, 180, 200, 25);
        add(txtContenidoPagina);

        btnAgregarPagina = new JButton("Agregar Página");
        btnAgregarPagina.setBounds(150, 220, 150, 30);
        add(btnAgregarPagina);

        modeloListaPaginas = new DefaultListModel<>();
        listaPaginas = new JList<>(modeloListaPaginas);
        JScrollPane scroll = new JScrollPane(listaPaginas);
        scroll.setBounds(30, 270, 380, 120);
        add(scroll);

        btnGuardarLibro = new JButton("Guardar Libro");
        btnGuardarLibro.setBounds(150, 410, 150, 30);
        add(btnGuardarLibro);

        // EVENTOS

        btnAgregarPagina.addActionListener(e -> agregarPagina());
        btnGuardarLibro.addActionListener(e -> guardarLibro());

        setVisible(true);
    }

    private void agregarPagina() {
        try {
            int numero = Integer.parseInt(txtNumPagina.getText());
            String contenido = txtContenidoPagina.getText();

            if (contenido.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Contenido vacío.");
                return;
            }

            Pagina p = new Pagina(numero, contenido);
            paginas.add(p);

            modeloListaPaginas.addElement("Página " + numero + ": " + contenido);

            // Limpiar campos
            txtNumPagina.setText("");
            txtContenidoPagina.setText("");

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Número de página inválido.");
        }
    }

    private void guardarLibro() {
        String titulo = txtTitulo.getText();
        String isbn = txtISBN.getText();

        if (titulo.isEmpty() || isbn.isEmpty() || paginas.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe completar todos los campos y agregar páginas.");
            return;
        }

        Libro libro = new Libro(titulo, isbn, paginas);
        biblioteca.agregarLibro(libro);

        JOptionPane.showMessageDialog(this, "Libro guardado correctamente.");

        // Cerrar ventana
        dispose();
    }
}
