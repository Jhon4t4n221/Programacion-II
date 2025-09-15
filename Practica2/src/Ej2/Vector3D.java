import math

class Vector3D:
    def __init__(self, x=0, y=0, z=0):
        self.x = x
        self.y = y
        self.z = z

    # Representación
    def __str__(self):
        return f"({self.x}, {self.y}, {self.z})"

    # a) Suma de vectores: a + b
    def __add__(self, other):
        return Vector3D(self.x + other.x, self.y + other.y, self.z + other.z)

    # b) Multiplicación escalar: r * a
    def __rmul__(self, r):   # escalar * vector
        return Vector3D(r * self.x, r * self.y, r * self.z)

    # c) Longitud de un vector: |a|
    def __abs__(self):
        return math.sqrt(self.x**2 + self.y**2 + self.z**2)

    # d) Vector normal: a / |a|
    def normal(self):
        length = abs(self)
        if length == 0:
            return Vector3D(0, 0, 0)
        return Vector3D(self.x/length, self.y/length, self.z/length)

    # e) Producto escalar: a · b
    def dot(self, other):
        return self.x*other.x + self.y*other.y + self.z*other.z

    # f) Producto vectorial: a × b
    def cross(self, other):
        return Vector3D(
            self.y*other.z - self.z*other.y,
            self.z*other.x - self.x*other.z,
            self.x*other.y - self.y*other.x
        )
