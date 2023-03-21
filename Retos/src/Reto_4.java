//Se importa la clase Scanner
import java.util.Scanner;
//Se crea la clase Reto_4
public class Reto_4 {

    //Metodo main para ejecutar las instrucciones, inicio del programa
    public static void main(String[] args) throws Exception {

        //Clase Scanner para capturar los datos
        Scanner Entrada = new Scanner(System.in);

        //Declaracion de variables
        int maquina;
        String Jugada,Nombre;
        char letra;
        double total = 0;
                
        //Se solicita la jugada de la persona
        System.out.println("favor Ingresar su Jugada");

        //Se mencionan los tipos de jugada
        System.out.println("Rock");
        System.out.println("papel");
        System.out.println("Tijera");

        //Se genera un numero random, que este sera la jugada de la maquina
        maquina = (int) (Math.random() *3)+1;

        //Se solicita el nombre del jugador y su respectiva jugada
        System.out.print("Nombre: "); Nombre = Entrada.nextLine();
        System.out.print("Jugada: "); Jugada = Entrada.nextLine();

        //Se toma la primera letra de la jugada
        letra = Jugada.charAt(0);

        //Se evalua la letra de la juagda para conocer la jugada de la persona
        switch (letra) {

            //Jugada Rock en minuscula y mayuscula para evitar errores en el sistema
            case 'R':
            case 'r': 

                //Se compara la jugada de la computadora, si gana la persona o la computadora
                switch (maquina){
                    case 1: 
                     //Se menciona que el jugador empata
                        System.out.println("Jugador: "+Nombre+" Empato Contra la Maquina y no gana ni pierde dinero"); 
                        break;
                    case 2: 
                     //Se menciona que el jugador pierde
                        System.out.println("Jugador: "+Nombre+" perdio Contra la maquina y pierde $10.000");
                            
                            total = 100000 - 10000;

                        break;
                    case 3: 
                    //Se menciona que el jugador gana
                        System.out.println("Jugador: "+Nombre+" Gano contra la maquina y gana $10.000"); 
                            //Se le suma 10000 al jugador por ganar la partida
                            total = 100000 + 10000;

                            //Se cierra el caso
                        break;
                }

                    break;


                case 'P':
                case 'p': 
    
                    switch (maquina){
                        case 1: System.out.println("Jugador: "+Nombre+" Gano contra la maquina y gana $10.000"); 

                        total = 100000 + 10000; 
                            break;
                        case 2: System.out.println("Jugador: "+Nombre+" Empato Contra la Maquina y no gana ni pierde dinero"); 
 
                            break;
                        case 3:  System.out.println("Jugador: "+Nombre+" perdio Contra la maquina y pierde $10.000");
                            
                        total = 100000 - 10000; 
                            break;
                    }

                        break;


                case 'T':
                case 't': 
        
                        switch (maquina){
                            case 1:  System.out.println("Jugador: "+Nombre+" perdio Contra la maquina y pierde $10.000");
                            
                            total = 100000 - 10000; 
                                break;
                            case 2: System.out.println("Jugador: "+Nombre+" Gano contra la maquina y gana $10.000"); 

                            total = 100000 + 10000; 
                                break;
                            case 3: System.out.println("Jugador: "+Nombre+" Empato Contra la Maquina y no gana ni pierde dinero"); 
 
                                break;
                        }

                        break;

                default: 

                        System.out.println("Valor Incorrecto");

                        break;
        }

            //Se muestra El dinero total ganado al final de la jugada
            System.out.println("Su valor actual de dinero es: "+total);

        //Se limpia el buffer
        Entrada.close();





    }
}