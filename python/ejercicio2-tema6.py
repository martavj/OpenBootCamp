#En este segundo ejercicio, tendréis que crear un programa que tenga una clase llamada Alumno que tenga como atributos su nombre y su nota.
# Deberéis de definir los métodos para inicializar sus atributos, imprimirlos y mostrar un mensaje con el resultado de la nota y si ha aprobado o no.

class Alumno:
    def __init__(self, nombre, nota):
        self.nombre = nombre
        self.nota = nota

    def imprimir_nota(self):
        print('Nombre del alumno: ', self.nombre)
        print('Nota de la asignatura:', self.nota)

    def resultado_final(self):
        if self.nota > 5:
            print('El alumno ha superado con éxito la asignatura.')
        else:
            print('El alumno no ha superado la asignatura.')


alumno1 = Alumno('Marta Villalobos', 9)
alumno1.imprimir_nota()
alumno1.resultado_final()

alumno2 = Alumno('Marta Jiménez', 4)
alumno2.imprimir_nota()
alumno2.resultado_final()