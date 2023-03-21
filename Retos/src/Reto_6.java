//Se importa la clase Scanner
import java.util.Scanner;

//Se crea la clase Reto_6
public class Reto_6 {
    //Metodo main para ejecutar las instrucciones, inicio del programa
    public static void main(String[] args) throws Exception {

            //Clase Scanner para capturar los datos
            Scanner Entrada = new Scanner(System.in);

        //Declaracion de variables
        int COM,Jugada;
        int vidas = 3;
        String Nombre;
        double Apuesta = 100000;

         //Se solicitan los datos       
        System.out.println("favor Su Nombre");
        System.out.print("Nombre: "); Nombre = Entrada.nextLine();

        //Ciclo While que termina cuando el jugador se quede sin vidas
        while(vidas > 0){

        //Jugadas
        System.out.println("Sello: 1");
        System.out.println("Cara: 2");
        System.out.println("Si pierde se le restan $10.000 a su acumulado, si gana se le suman");

        //Numero random para sacar la jugada de la computadora
        COM = (int) (Math.random() *2)+1;

        //Se Solicita la jugada de la persona
        System.out.print("Jugada: "); Jugada = Integer.parseInt(Entrada.nextLine());

        //Se utiliza el ciclo Switch con la variable letra para comparar la jugada de la persona con la de la computadora
        switch (Jugada) {

            //Jugada de la persona 
            case 1: 

                //Se compara la jugada de la computadora, si gana la persona o la computadora
                switch (COM){
                    //Se menciona que el jugador gana 
                    case 1: System.out.println("Jugador: "+Nombre+" Gano contra la COM"); 
                    //Se le suma 10000 al jugador por ganar la partida
                    Apuesta = Apuesta + 10000; 
                        //Se cierra el Case
                        break;
                    case 2: System.out.println("Jugador: "+Nombre+" perdio Contra la COM y pierde una vida");
                    //Se resta una vida al jugador por perder
                    vidas = vidas - 1;
                    Apuesta = Apuesta - 10000;
                        break;
                    default: System.out.println("Error");
                        break;
                }
                    break;


                case 2:
    
                    switch (COM){
                        case 1:  System.out.println("Jugador: "+Nombre+" perdio Contra la COM y pierde una vida");
                        vidas = vidas - 1;
                        Apuesta = Apuesta - 10000; 
                            break;
                        case 2: System.out.println("Jugador: "+Nombre+" Gano contra la COM"); 

                        Apuesta = Apuesta + 10000; 
                            break;
                        default: System.out.println("Error");
                            break;
                    }

                        break;
        }


    }

    System.out.println("Se quedo sin vidas");

    //Se muestra el mensaje final del juego
    System.out.println("Su valor actual de dinero es: "+Apuesta);

    //Se cierra el Buffer
        Entrada.close();





    }
}
