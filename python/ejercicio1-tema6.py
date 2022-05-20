# En este ejercicio vais a crear la clase Vehículo la cual tendrá los siguientes atributos: color, ruedas y puertas.
# Por otro lado crearéis la clase Coche la cual heredará de Vehículo y tendrá los siguientes atributos:velocidad y cilindrada.
# Por último, tendrás que crear un objeto de la clase Coche y mostrarlo por consola.

class Vehiculo:
    def __init__(self, color, ruedas, puertas):
        self.color = color
        self.ruedas = ruedas
        self.puertas = puertas

    def __str__(self):
        cadena = "Color: "+self.color+"\nRuedas: "+str(self.ruedas)+"\nPuertas: "+str(self.puertas)
        return cadena

class Coche(Vehiculo):
    def __init__(self, color, ruedas, puertas,velocidad, cilindrada):
        self.color = color
        self.ruedas = ruedas
        self.puertas = puertas
        self.velocidad = velocidad
        self.cilindrada = cilindrada

    def __str__(self):
        cadena = "Color: "+self.color+"\nRuedas: "+str(self.ruedas)+"\nPuertas: "+str(self.puertas)+"\nVelocidad: "+str(self.velocidad)+"\nCilindrada: "+str(self.cilindrada)
        return cadena

coche1 = Coche("rojo", 4, 5, 120, 1500)
print(coche1)