# Escribe un programa que pregunte al usuario su edad y muestre por pantalla si es mayor de edad o no.
edad = input('Inserte su edad para saber si es mayor de edad: ')

# Hay que convertir la edad a int porque sino da un error al ser un string
if (int(edad) > 18):
    print('Es mayor de edad')
else:
    print('Es menor de edad')