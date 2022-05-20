# Escribe una función que calcule el área de un triángulo, recibiendo la altura y la base como parámetros
# y otra función que calcule el área de un círculo recibiendo el radio del mismo.
# Importar libreria math para poder usar el pi
import math

def area_triangulo(base, altura):
    return (float(base) * float(altura)) / 2

def area_circulo(r):
    return (2 * float(r)) * math.pi

print('El área del triangulo es: ', area_triangulo(6,4))
print('El área del círculo es :', area_circulo(5))

