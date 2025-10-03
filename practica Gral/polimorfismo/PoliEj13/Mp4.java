package PoliEj13;
public class Mp4 {
    private String marca;
    private double capacidadGb;
    private int nroCanciones;
    private int nroVideos;
    private String[][] canciones;
    private String[][] videos;

    public Mp4(String marca, double capacidadGb, int maxCanciones, int maxVideos) {
        this.marca = marca;
        this.capacidadGb = capacidadGb;
        this.nroCanciones = 0;
        this.nroVideos = 0;
        this.canciones = new String[maxCanciones][3];
        this.videos = new String[maxVideos][3];
    }

    public void borrarCancionPorNombre(String nombre) {
        for (int i = 0; i < nroCanciones; i++) {
            if (canciones[i][0].equalsIgnoreCase(nombre)) {
                canciones[i] = canciones[nroCanciones - 1];
                canciones[nroCanciones - 1] = null;
                nroCanciones--;
                System.out.println("Canción " + nombre + " eliminada por nombre.");
                return;
            }
        }
    }

    public void borrarCancionPorArtista(String artista) {
        for (int i = 0; i < nroCanciones; i++) {
            if (canciones[i][1].equalsIgnoreCase(artista)) {
                canciones[i] = canciones[nroCanciones - 1];
                canciones[nroCanciones - 1] = null;
                nroCanciones--;
                System.out.println("Canción eliminada del artista: " + artista);
                return;
            }
        }
    }

    public void borrarCancionPorPeso(String peso) {
        for (int i = 0; i < nroCanciones; i++) {
            if (canciones[i][2].equalsIgnoreCase(peso)) {
                canciones[i] = canciones[nroCanciones - 1];
                canciones[nroCanciones - 1] = null;
                nroCanciones--;
                System.out.println("Canción eliminada con peso: " + peso);
                return;
            }
        }
    }

    public void addCancion(String nombre, String artista, String peso) {
        if (nroCanciones < canciones.length) {
            canciones[nroCanciones][0] = nombre;
            canciones[nroCanciones][1] = artista;
            canciones[nroCanciones][2] = peso;
            nroCanciones++;
            System.out.println("Canción añadida: " + nombre);
        } else {
            System.out.println("No hay espacio para más canciones.");
        }
    }

    public void addVideo(String nombre, String artista, String peso) {
        if (nroVideos < videos.length) {
            videos[nroVideos][0] = nombre;
            videos[nroVideos][1] = artista;
            videos[nroVideos][2] = peso;
            nroVideos++;
            System.out.println("Video añadido: " + nombre);
        } else {
            System.out.println("No hay espacio para más videos.");
        }
    }

    public void capacidadDisponible() {
        double totalKB = 0;
        double totalMB = 0;

        for (int i = 0; i < nroCanciones; i++) {
            totalKB += Double.parseDouble(canciones[i][2]);
        }

        for (int i = 0; i < nroVideos; i++) {
            totalMB += Double.parseDouble(videos[i][2]);
        }

        double totalGB = (totalKB / (1024 * 1024)) + (totalMB / 1024);
        double disponible = capacidadGb - totalGB;

        System.out.println("Capacidad total: " + capacidadGb + " GB");
        System.out.println("Usado: " + totalGB + " GB");
        System.out.println("Disponible: " + disponible + " GB");
    }

    public void mostrarDatos() {
        System.out.println("Marca: " + marca + " | Capacidad: " + capacidadGb + "GB");
        System.out.println("\nCanciones:");
        for (int i = 0; i < nroCanciones; i++) {
            System.out.println("- " + canciones[i][0] + " | " + canciones[i][1] + " | " + canciones[i][2] + "KB");
        }
        System.out.println("\nVideos:");
        for (int i = 0; i < nroVideos; i++) {
            System.out.println("- " + videos[i][0] + " | " + videos[i][1] + " | " + videos[i][2] + "MB");
        }
    }
}

