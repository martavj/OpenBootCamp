public class Main {

    public static void main(String[] args) {
        //Primera parte - Llamar a la función en el main y darle valores.
        System.out.println("Primera parte - suma");
        System.out.println(suma(5,5,3));

        //Segunda parte - Añadir 1 puerta al objeto miCoche e imprimir el número de puertas por pantalla.
        System.out.println("Segunda parte - Agregar una puerta a miCoche e imprimir el número de puertas");
        Coche miCoche = new Coche();
        miCoche.agregarPuertas(1);
        System.out.println(miCoche.puertas);
    }

    //Primera parte  - Crear una función con tres parámetros que sean números que se suman entre sí
    public static int suma(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }
}

//Segunda parte - crear una clase coche
class Coche {
    public int puertas = 3;
    public void agregarPuertas(int num) {
        this.puertas = this.puertas + num;
    }

}