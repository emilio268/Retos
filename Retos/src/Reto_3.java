//Se importa la clase Scanner
import java.util.Scanner;

//Se crea la clase Reto_3
public class Reto_3 {
    
    //Metodo main para ejecutar las instrucciones, inicio del programa
    public static void main(String[] args) throws Exception {

        //Clase Scanner para capturar los datos
        Scanner Entrada = new Scanner(System.in);

        //Declaracion de variables
        int maquina;
        String Nombre, Jugada;
        double total = 0;
        char letra;

        //Se menciona los tipos de jugadas que ahi y se solicitan        
        System.out.println("favor Ingresar su Jugada y Su Nombre");

        //jugadas
        System.out.println("Sello");
        System.out.println("Cara");

        //Numero random que va a ser la jugada de la maquina
        maquina = (int) (Math.random() *2)+1;

        //Se solicita el nombre del jugador y su nombre
        System.out.print("Nombre: "); Nombre = Entrada.nextLine();
        System.out.print("Jugada: "); Jugada = Entrada.nextLine();

        //Se captura la orimera letra de la jugada
        letra = Jugada.charAt(0);

        //Se utiliza el ciclo Switch con la variable letra para comparar la jugada de la persona con la de la computadora
        switch (letra) {

            //Jugada Sello en minuscula y mayuscula para evitar errores en el sistema
            case 'S':
            case 's': 

                //Se compara la jugada de la computadora, si gana la persona o la computadora
                switch (maquina){
                    //Se menciona que el jugador gana 
                    case 1: System.out.println("Jugador: "+Nombre+" Gano contra la maquina y gana $10.000"); 
                    //Se le suma 10000 al jugador por ganar la partida
                    total = 100000 + 10000; 
                        //Se cierra el Case
                        break;
                    //Se menciona que el Jugador perdio
                    case 2: System.out.println("Jugador: "+Nombre+" perdio Contra la maquina y pierde $10.000");
                    //Se le resta 10000 al jugador por perder la partida
                    total = 100000 - 10000;
                        break;
                    //En caso de que la información no sea valida o no este dentro de los casos se ejecutara el default
                    default:
                     System.out.println("Error");//Se muestra un mensaje de error
                        break;
                }
                    break;


                case 'C':
                case 'c':
    
                    switch (maquina){
                        case 1:  System.out.println("Jugador: "+Nombre+" perdio Contra la maquina y pierde $10.000");
                            
                        total = 100000 - 10000; 
                            break;
                        case 2: System.out.println("Jugador: "+Nombre+" Gano contra la maquina y gana $10.000"); 

                        total = 100000 + 10000; 
                            break;
                        default: System.out.println("Error");
                            break;
                    }

                        break;
        }

        //Se muestra El dinero total ganado al final de la jugada
        System.out.println("Su valor actual de dinero es: "+total);

        //Se limpia el buffer
        Entrada.close();





    }
}
