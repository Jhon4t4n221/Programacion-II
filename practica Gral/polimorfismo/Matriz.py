#clase base
    def __init__(self, valores=None):
        self.matriz = [[0.0 for _ in range(10)] for _ in range(10)]

        if valores is None:
            for i in range(10):
                for j in range(10):
                    if i == j:
                        self.matriz[i][j] = 1.0
                    else:
                        self.matriz[i][j] = 0.0
        else:
            for i in range(10):
                for j in range(10):
                    self.matriz[i][j] = valores[i][j]

    def mostrar(self):
        for i in range(10):
            for j in range(10):
                print(f"{self.matriz[i][j]:.1f}", end="\t")
            print()
        print()

    def sumar(self, m):
        resultado = [[0.0 for _ in range(10)] for _ in range(10)]
        for i in range(10):
            for j in range(10):
                resultado[i][j] = self.matriz[i][j] + m.matriz[i][j]
        return Matriz(resultado)

    def restar(self, m):
        resultado = [[0.0 for _ in range(10)] for _ in range(10)]
        for i in range(10):
            for j in range(10):
                resultado[i][j] = self.matriz[i][j] - m.matriz[i][j]
        return Matriz(resultado)

    def igual(self, m):
        for i in range(10):
            for j in range(10):
                if self.matriz[i][j] != m.matriz[i][j]:
                    return False
        return True


# Main
if __name__ == "__main__":
    m1 = Matriz()
    print("Matriz identidad:")
    m1.mostrar()

    # Crear matriz personalizada
    valores = [[i + j for j in range(10)] for i in range(10)]
    m2 = Matriz(valores)

    print("Matriz personalizada:")
    m2.mostrar()

    suma = m1.sumar(m2)
    print("Suma de matrices:")
    suma.mostrar()

    resta = m2.restar(m1)
    print("Resta de matrices:")
    resta.mostrar()

    print("m1 igual a m2?", m1.igual(m2))
    print("m1 igual a m1?", m1.igual(m1))
