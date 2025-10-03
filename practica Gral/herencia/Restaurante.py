# Clase base
class Empleado:
    def __init__(self, nombre, sueldo_mes):
        self.nombre = nombre
        self.sueldo_mes = sueldo_mes

    def sueldo_total(self):
        return self.sueldo_mes

    def mostrar(self):
        print(f"Nombre: {self.nombre} | Sueldo mes: {self.sueldo_mes}")


class Administrativo(Empleado):
    def __init__(self, nombre, sueldo_mes, cargo):
        super().__init__(nombre, sueldo_mes)
        self.cargo = cargo

    def mostrar(self):
        print(f"Administrativo -> Nombre: {self.nombre}, Cargo: {self.cargo}, Sueldo mes: {self.sueldo_mes}")


class Chef(Empleado):
    def __init__(self, nombre, sueldo_mes, hora_extra, tipo, sueldo_hora):
        super().__init__(nombre, sueldo_mes)
        self.hora_extra = hora_extra
        self.tipo = tipo
        self.sueldo_hora = sueldo_hora

    def sueldo_total(self, con_extras=False):
        if con_extras:
            return self.sueldo_mes + (self.hora_extra * self.sueldo_hora)
        return self.sueldo_mes

    def mostrar(self):
        print(f"Chef -> Nombre: {self.nombre}, Tipo: {self.tipo}, "
              f"Sueldo mes: {self.sueldo_mes}, Horas extra: {self.hora_extra}")
      

class Mesero(Empleado):
    def __init__(self, nombre, sueldo_mes, propina, hora_extra, sueldo_hora):
        super().__init__(nombre, sueldo_mes)
        self.propina = propina
        self.hora_extra = hora_extra
        self.sueldo_hora = sueldo_hora

    def sueldo_total(self, con_extras=False, con_propina=False):
        total = self.sueldo_mes
        if con_extras:
            total += self.hora_extra * self.sueldo_hora
        if con_propina:
            total += self.propina
        return total

    def mostrar(self):
        print(f"Mesero -> Nombre: {self.nombre}, Sueldo mes: {self.sueldo_mes}, "
              f"Propina: {self.propina}, Horas extra: {self.hora_extra}")


# --- MAIN ---
if __name__ == "__main__":
    chef = Chef("Remy", 3000, 10, "Pastelero", 50)
    mesero1 = Mesero("Linguini", 2000, 300, 5, 30)
    mesero2 = Mesero("Colette", 2200, 500, 8, 35)
    admin1 = Administrativo("Skinner", 2500, "Gerente")
    admin2 = Administrativo("Anton", 2400, "Contador")

    empleados = [chef, mesero1, mesero2, admin1, admin2]

    X = 2500
    print(f"\nEmpleados con sueldo mes = {X}:")
    for e in empleados:
        if e.sueldo_mes == X:
            e.mostrar()

    print("\nSueldos totales considerando horas extra y propinas:")
    print(f"{chef.nombre}: {chef.sueldo_total(True)}")
    print(f"{mesero1.nombre}: {mesero1.sueldo_total(True, True)}")
    print(f"{mesero2.nombre}: {mesero2.sueldo_total(True, True)}")
