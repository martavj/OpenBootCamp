# Escribe una función que pueda decirte si un número (número entero) es primo o no.
import sympy

def calculoprimo():
    numero = int(input('Introduce un número (entero): '))
    if sympy.isprime(numero):
        print('El número ', numero, ' es primo.')
    else:
        print('El número ', numero, ' NO es primo.')

calculoprimo()
