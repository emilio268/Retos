//Se importa la clase Scanner
import java.util.Scanner;

//Se crea la clase Reto_8
public class Reto_8 {

    //Metodo main para ejecutar las instrucciones, inicio del programa
    public static void main(String[] args) {
        
        //se Declaran las variables
        int oportunidades, j;
        int valor = 0;
        int numAdivinar = 0;
        int Numero = 0;

        //Clase Scanner para capturar los datos
        Scanner Entrada = new Scanner(System.in);
        
        //Se solicitan los datos
        System.out.println("Ingrese las oportunidades en las que quiere jugar"); 
        System.out.print("Oportunidades: "); oportunidades = Integer.parseInt(Entrada.nextLine());

        //Se crea un numero al azar del 1 al 100
        numAdivinar = (int) (Math.random()*100)+1;

        //se crea una condicion
        if (oportunidades <= 10){
        
        //Ciclo para repetir las jugadas n cantidad de veces
        for (j = 0; j < oportunidades; j++){

            //Contador de jugadas
            valor++;

            //Se solicita un numero
            System.out.println("Ingrese el numero que cree");
            System.out.print("Numero: ");

            Numero = Integer.parseInt(Entrada.nextLine());

            //Condicion por si el numero se adivina
            if(numAdivinar==Numero){

                System.out.println("Gano El Juego en la cantidad de: "+valor+" Intentos");

                break;
    
            //Condicion por si el numero es menor al ingresado
            }else if(numAdivinar > Numero){

                System.out.println("El numero es Mas grande");

            //Condicion por si el numero es mayor al ingresado
            }else if(numAdivinar < Numero){

                System.out.println("El numero es mas pequeño");

            }

        }

        //Se menciona que perdio el juego y no adivino el numero
        System.out.println("lo siento perdiste el juego, no lograste adivinar, lo intentaste en: "+valor+" Intentos");


    }else{

        //Mensaje por si se pasa de las 10 oportunidades permitidas
        System.out.println("Solo se pueden 10 oportunidades");

    }

    //Se cierra el Buffer
    Entrada.close();


    }
    
}
