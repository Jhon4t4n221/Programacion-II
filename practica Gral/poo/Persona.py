#clase base
class Persona:
    def __init__(self, nom, apPat, apMat, edad, ci):
        self.nom = nom
        self.apPat = apPat
        self.apMat = apMat
        self.edad = edad
        self.ci = ci

    def mostrarDatos(self):
        print(f"Nombre: {self.nom} Ap paterno: {self.apPat} Ap materno: {self.apMat}")
        print(f"Edad: {self.edad}")
        print(f"CI: {self.ci}")

    def mEdad(self, mEdad):  # el parámetro mEdad no se usa en Java, lo dejo igual
        if self.edad > 18:
            print(f"{self.nom} es mayor de edad")
        else:
            print(f"{self.nom} no es mayor de edad")

    def modiEdad(self, modiEdad):
        nueva_edad = self.edad + modiEdad
        print(f"La nueva edad es: {nueva_edad}")

    def veriApellido(self, apPat):
        if self.apPat.lower() == apPat.lower():
            print("Los apellidos coinciden")
        else:
            print("Los apellidos no coinciden")


# Main
if __name__ == "__main__":
    p1 = Persona("juan", "pinto", "narvaez", 12, 1234)
    p2 = Persona("leoncio", "garcia", "torredo", 24, 4567)

    p1.mostrarDatos()
    p1.mEdad(10)        # parámetro se ignora, igual que en Java
    p1.modiEdad(30)
    p1.veriApellido("pinto")
    print()

    p2.mostrarDatos()
    p2.mEdad(4)         # parámetro se ignora, igual que en Java
    p2.modiEdad(20)
    p2.veriApellido("garcia")
