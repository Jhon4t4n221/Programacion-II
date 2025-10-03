#clase base
class Producto:
    def __init__(self, nombre, precio, stock):
        self.nombre = nombre
        self.precio = precio
        self.stock = stock

    def vender(self, cantidad):
        if cantidad <= self.stock:
            self.stock -= cantidad
            print(f"Se vendió el producto: {self.nombre}, cantidad: {cantidad}")
        else:
            print(f"No hay suficiente stock para vender {cantidad} unidades de {self.nombre}")

    def reabastecer(self, cantidad):
        self.stock += cantidad
        print(f"Se agregó la cantidad de: {cantidad} del producto {self.nombre} al stock")

    def mostrar(self):
        print(f"Nombre del producto: {self.nombre}")
        print(f"Precio: {self.precio}")
        print(f"Stock disponible: {self.stock}")


# Main
if __name__ == "__main__":
    p1 = Producto("papitas", 5.50, 10)
    p2 = Producto("juguitos", 1.50, 20)

    p1.vender(8)
    p1.reabastecer(10)
    print()

    p2.vender(10)
    p2.reabastecer(30)
    print()
