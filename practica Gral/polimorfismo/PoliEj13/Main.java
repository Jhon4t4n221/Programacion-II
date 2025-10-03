package PoliEj13;

public class Main {
    public static void main(String[] args) {
        Mp4 mp4 = new Mp4("Sony", 8, 100, 100);

        mp4.addCancion("Back To Black", "Amy Winehouse", "100");
        mp4.addCancion("Lost On You", "LP", "150");

        mp4.addVideo("Heathens", "Twenty One Pilots", "50");
        mp4.addVideo("Without Me", "Halsey", "30");

        mp4.mostrarDatos();
        mp4.borrarCancionPorNombre("Lost On You");

        mp4.capacidadDisponible();
    }
}