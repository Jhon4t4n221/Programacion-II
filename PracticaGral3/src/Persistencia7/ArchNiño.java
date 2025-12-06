package Persistencia7;

import java.io.*;
import java.util.ArrayList;

public class ArchNiño {
    private ArrayList<Niño> lista;
    private String nomArch;

    public ArchNiño(String nomArch) {
        this.nomArch = nomArch;
        cargar();
    }

    public void cargar() {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(nomArch));
            lista = (ArrayList<Niño>) in.readObject();
            in.close();
        } catch (Exception e) {
            lista = new ArrayList<>();
        }
    }

    public void guardar() {
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(nomArch));
            out.writeObject(lista);
            out.close();
        } catch (Exception e) {}
    }

    public void agregar(Niño n) {
        lista.add(n);
        guardar();
    }

    public void listar() {
        lista.forEach(System.out::println);
    }

    public Niño buscar(int ci) {
        for (Niño n : lista)
            if (n.getCi() == ci)
                return n;
        return null;
    }

    public ArrayList<Niño> getLista() { return lista; }
    
    public int contarPesoAdecuado() {
        int c = 0;
        for (Niño n : lista) {
            double pesoIdeal = n.getTalla() - 100;
            if (n.getPeso() >= pesoIdeal * 0.9 && n.getPeso() <= pesoIdeal * 1.1)
                c++;
        }
        return c;
    }
    
    public void mostrarNoAdecuados() {
        System.out.println("Niños con peso o talla NO adecuada:");
        for (Niño n : lista) {
            double pesoIdeal = n.getTalla() - 100;
            boolean pesoOK = n.getPeso() >= pesoIdeal * 0.9 && n.getPeso() <= pesoIdeal * 1.1;

            if (!pesoOK)
                System.out.println(n);
        }
    }
    
    public void mostrarTallaMaxima() {
        if (lista.isEmpty()) return;

        double max = 0;
        for (Niño n : lista)
            if (n.getTalla() > max)
                max = n.getTalla();

        System.out.println("Niños con la talla más alta (" + max + " cm):");
        for (Niño n : lista)
            if (n.getTalla() == max)
                System.out.println(n);
    }

	public String promedioEdad() {
		// TODO Auto-generated method stub
		return null;
	}

}
