public class Main {
    public static void main(String[] args) {
        //Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.
        Cliente cliente1 = new Cliente();
        cliente1.nombre="Ana Romero";
        cliente1.edad = 20;
        cliente1.telefono = 630223344;
        cliente1.credito = 2500.50;

        System.out.println("Los datos del cliente 1 son: " + "\n" + "Nombre " + cliente1.nombre + "\n" + "Edad: "+ cliente1.edad + "\n" + "Teléfono: "+ cliente1.telefono+ "\n" + "Crédito disponible: "+ cliente1.credito + " euros.");

        Trabajador trabajador1 = new Trabajador();
        trabajador1.nombre="John Smith";
        trabajador1.edad = 30;
        trabajador1.telefono = 630428844;
        trabajador1.salario = 35500;

        System.out.println("Los datos del trabajador 1 son: " + "\n" + "Nombre " + trabajador1.nombre + "\n" + "Edad: "+ trabajador1.edad + "\n" + "Teléfono: "+ trabajador1.telefono+ "\n" + "Salario anual: "+ trabajador1.salario + " euros.");


    }

}
//Crea una clase Persona con las siguientes variables: edad, nombre y telefono.
//
class Persona {
    String nombre;
    int edad;
    long telefono;

}
//Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva clase tendrá la variable credito solo para esa clase.
class Cliente extends Persona{
    double credito;
}
//Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una variable salario que solo tenga la clase Trabajador.
class Trabajador extends Persona{
    double salario;
}
