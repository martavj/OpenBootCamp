#Escribe una función que pueda decirte si un año (número entero) es bisiesto o no.
import calendar

def calculobisiesto():
    year = int(input('Introduce un año para saber si es bisiesto o no: '))
    if calendar.isleap(year):
        print(year, ' es bisiesto.')
    else:
        print(year, ' NO es bisiesto.')

calculobisiesto()

