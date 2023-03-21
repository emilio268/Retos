//Se importa la clase Scanner
import java.util.Scanner;

//Se crea la clase Reto_1
public class Reto_1 {

    //Metodo main para ejecutar las instrucciones, inicio del programa
    public static void main(String[] args) throws Exception {

        //Se solicitan los datos por mensaje (Grados Fahrenheit)
        System.out.println("Favor Ingresar los grados Fahrenheit");

        //Clase Scanner para capturar los datos
        Scanner Entrada = new Scanner(System.in);

        //Declaracion de variables
        double GFahren, GCenti, Kelvin;

        //Se solicita el dato (Grados Fahrenheit)
        GFahren = Entrada.nextDouble();

        //Se hace la conversión de grados Fahrenheit a Grados centigrados
        GCenti = (GFahren - 32) / 1.8;
        
        //Se hace la conversión de grados Fahrenheit a Grados kelvin
        Kelvin = ((GFahren - 32)/1.8) + 273.15;

        //Se imprime el resultado de la conversión
        System.out.println("los grados Fahrenheit ingresados en Centigrados es: "+GCenti+" y En grados Kelvin es: "+Kelvin);

        //Se cierra el buffer
        Entrada.close();

    }
}
