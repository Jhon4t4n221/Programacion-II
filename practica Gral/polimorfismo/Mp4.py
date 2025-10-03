#clase base
class Mp4:
    def __init__(self, marca, capacidad_gb, max_canciones, max_videos):
        self.marca = marca
        self.capacidad_gb = capacidad_gb
        self.nro_canciones = 0
        self.nro_videos = 0
        self.max_canciones = max_canciones
        self.max_videos = max_videos
        self.canciones = []
        self.videos = []

    def borrar_cancion_por_nombre(self, nombre):
        for i, c in enumerate(self.canciones):
            if c[0].lower() == nombre.lower():
                self.canciones.pop(i)
                self.nro_canciones -= 1
                print(f"Canción {nombre} eliminada por nombre.")
                return

    def borrar_cancion_por_artista(self, artista):
        for i, c in enumerate(self.canciones):
            if c[1].lower() == artista.lower():
                self.canciones.pop(i)
                self.nro_canciones -= 1
                print(f"Canción eliminada del artista: {artista}")
                return

    def borrar_cancion_por_peso(self, peso):
        for i, c in enumerate(self.canciones):
            if c[2] == peso:
                self.canciones.pop(i)
                self.nro_canciones -= 1
                print(f"Canción eliminada con peso: {peso}")
                return

    def add_cancion(self, nombre, artista, peso):
        if self.nro_canciones < self.max_canciones:
            self.canciones.append([nombre, artista, peso])
            self.nro_canciones += 1
            print(f"Canción añadida: {nombre}")
        else:
            print("No hay espacio para más canciones.")

    def add_video(self, nombre, artista, peso):
        if self.nro_videos < self.max_videos:
            self.videos.append([nombre, artista, peso])
            self.nro_videos += 1
            print(f"Video añadido: {nombre}")
        else:
            print("No hay espacio para más videos.")

    def capacidad_disponible(self):
        total_kb = sum(float(c[2]) for c in self.canciones)
        total_mb = sum(float(v[2]) for v in self.videos)

        total_gb = (total_kb / (1024 * 1024)) + (total_mb / 1024)
        disponible = self.capacidad_gb - total_gb

        print(f"Capacidad total: {self.capacidad_gb} GB")
        print(f"Usado: {total_gb:.3f} GB")
        print(f"Disponible: {disponible:.3f} GB")

    def mostrar_datos(self):
        print(f"Marca: {self.marca} | Capacidad: {self.capacidad_gb} GB")
        print("\nCanciones:")
        for c in self.canciones:
            print(f"- {c[0]} | {c[1]} | {c[2]} KB")
        print("\nVideos:")
        for v in self.videos:
            print(f"- {v[0]} | {v[1]} | {v[2]} MB")


# --- MAIN ---
if __name__ == "__main__":
    mp4 = Mp4("Sony", 8, 100, 100)

    mp4.add_cancion("Back To Black", "Amy Winehouse", "100")
    mp4.add_cancion("Lost On You", "LP", "150")

    mp4.add_video("Heathens", "Twenty One Pilots", "50")
    mp4.add_video("Without Me", "Halsey", "30")

    mp4.mostrar_datos()
    mp4.borrar_cancion_por_nombre("Lost On You")

    mp4.capacidad_disponible()
