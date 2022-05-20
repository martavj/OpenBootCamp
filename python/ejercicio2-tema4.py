#Escribe un programa capaz de mostrar todos los números impares desde un número de inicio y otro final.

num_inicial = input('Inserte el número inicial :')
num_final = input('Inserte el número final :')
#Hay que convertir los inputs en int antes de poder comparar
contador = int(num_inicial)

while contador <= int(num_final):
    if contador % 2 !=  0:
        print(contador)
    contador += 1



