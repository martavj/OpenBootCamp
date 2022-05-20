class Main {
     public static void main(String[] args) {
        //Crear un objeto persona en el main.
        Persona miPersona = new Persona();
        miPersona.setEdad(30);
        miPersona.setNombre("Marta");
        miPersona.setTelefono(630001122);
        System.out.println("He creado una primera persona. Su nombre es " + miPersona.getNombre() + ", tiene " + miPersona.getEdad() + " años y su teléfono es " + miPersona.getTelefono() + ".");
    }
}

//Crear clase Persona.
class Persona {
    //Crear variables las privadas edad, nombre y telefono de la clase Persona.
    private int edad;
    private String nombre;
    private long telefono;

    //Crear getters y setterss de cada propiedad.

    //Getter que devuelve el nombre.
    public String getNombre(){
        return nombre;
    }

    //Setter que permite modificar el nombre
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    //Getter que devuelve la edad.
    public int getEdad(){
        return edad;
    }

    //Setter que permite modificar la edad
    public void setEdad(int edad){
        this.edad = edad;
    }

    //Getter que devuelve el telefono
    public long getTelefono(){
        return telefono;
    }

    //Setter que permite modificar el telefono
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
}


