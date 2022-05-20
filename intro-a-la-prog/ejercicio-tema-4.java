public class Main {
    public static void main(String[] args) {

        //Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0
        int numeroIf = 5;
         if (numeroIf < 0){
             System.out.println("El número es negativo");
         } else if (numeroIf >0){
             System.out.println("El número es positivo");
         } else {
             System.out.println("El número es igual a cero");
         }

         //Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3
          int numeroWhile = 0;
          while (numeroWhile <3){
              System.out.println("El número es: " + numeroWhile);
              numeroWhile++;
          }

          //Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez
          int numeroDoWhile = 3;
          do {System.out.println("El número es: " + numeroDoWhile);
              numeroDoWhile++;}
          while (numeroDoWhile < 3);

        //Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla
        int numeroFor;
        for (numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println("El número es: " + numeroFor);
        }

        //Switch con las estaciones, mostrando la estación por la pantalla
        String estacion = "Verano";

        switch(estacion){
            case "Primavera":
                System.out.println("La estación es primavera.");
                break;
            case "Verano":
                System.out.println("La estación es verano.");
                break;
            case "Otoño":
                System.out.println("La estación es otoño.");
                break;
            case "Invierno":
                System.out.println("La estación es invierno.");
                break;
            default:
                    System.out.println("No es una estación correcta.");
        }

    }
}