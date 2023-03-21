//Se importa la clase Scanner
import java.util.Scanner;

//Se crea la clase Reto_7
public class Reto_7 {
    //Metodo main para ejecutar las instrucciones, inicio del programa
    public static void main(String[] args) throws Exception {

        //Clase Scanner para capturar los datos
        Scanner Entrada = new Scanner(System.in);

        //Declaracion de variables
        int COM;
        String Jugada,Nombre;
        char letra;
        int vidas = 3;
        double Apuesta = 100000;
        
        //Se solicita el nombre de la persona
        System.out.println("Ingrese su nombre");

        System.out.print("Nombre: "); Nombre = Entrada.nextLine();
                
        //Ciclo While que termina cuando el jugador se quede sin vidas
        while(vidas > 0){

        //Jugadas
        System.out.println("favor Ingresar su Jugada");

        System.out.println("Rock");
        System.out.println("papel");
        System.out.println("Tijera");
        System.out.println("Si pierde se le restan $10.000 a su acumulado, si gana se le suman");

        //Numero random para sacar la jugada de la computadora
        COM = (int) (Math.random() *3)+1;

        System.out.print("Jugada: "); Jugada = Entrada.nextLine();

        //Se captura la orimera letra de la jugada
        letra = Jugada.charAt(0);

        //Se utiliza el ciclo Switch con la variable letra para comparar la jugada de la persona con la de la computadora
        switch (letra) {

            //Jugada Rock en minuscula y mayuscula para evitar errores en el sistema
            case 'R':
            case 'r': 

                //Se compara la jugada de la computadora, si gana la persona o la computadora
                switch (COM){
                    case 1: 
                     //Se menciona que el jugador empata
                     System.out.println("Jugador: "+Nombre+" Empato Contra la COM y no gana ni pierde dinero"); 
                        break;
                    case 2: 
                     //Se menciona que el jugador pierde
                     System.out.println("Jugador: "+Nombre+" perdio Contra la COM y una vida");
                            
                            Apuesta = Apuesta - 10000;
                            vidas = vidas - 1;

                        break;
                    case 3: 
                    //Se menciona que el jugador gana
                    System.out.println("Jugador: "+Nombre+" Gano contra la COM"); 
                            //Se le suma 10000 al jugador por ganar la partida
                            Apuesta = Apuesta + 10000;
                            //Se cierra el caso
                            break;
                }

                    break;


                case 'P':
                case 'p': 
    
                    switch (COM){
                        case 1: System.out.println("Jugador: "+Nombre+" Gano contra la COM"); 

                        Apuesta = Apuesta + 10000; 
                            break;
                        case 2: System.out.println("Jugador: "+Nombre+" Empato Contra la COM y no gana ni pierde dinero"); 
 
                            break;
                        case 3:  System.out.println("Jugador: "+Nombre+" perdio Contra la COM y pierde una vida");
                        vidas = vidas - 1;
                        Apuesta = Apuesta - 10000; 
                            break;
                    }

                        break;


                case 'T':
                case 't': 
        
                        switch (COM){
                            case 1:  System.out.println("Jugador: "+Nombre+" perdio Contra la COM y pierde una vida");
                            
                            vidas = vidas - 1;
                            Apuesta = Apuesta - 10000; 
                                break;
                            case 2: System.out.println("Jugador: "+Nombre+" Gano contra la COM"); 

                            Apuesta = Apuesta + 10000; 
                                break;
                            case 3: System.out.println("Jugador: "+Nombre+" Empato Contra la COM y no gana ni pierde dinero"); 
 
                                break;
                        }

                        break;

                default: 

                        System.out.println("Valor Incorrecto");

                        break;
        }

    }

        
            System.out.println("Se quedo sin vidas");
            //Se muestra El dinero total ganado al final de la jugada
            System.out.println("Su valor actual de dinero es: "+Apuesta);

        //Se cierra el Buffer
        Entrada.close();





    }
}