//Se importa la clase Scanner
import java.util.Scanner;

//Se crea la clase Reto_2
public class Reto_2 {
    
    //Metodo main para ejecutar las instrucciones, inicio del programa
    public static void main(String[] args) throws Exception {

        //Se Solicitan los datos por mensaje
        System.out.println("Favor Ingresar los siguientes Datos Basicos");

            //Clase Scanner para capturar los datos
            Scanner Entrada = new Scanner(System.in);
            
            //Declaracion de variables
            String NomEnfer, NomMama, NomBebe;
            Double PesoBebe, Vacuna;
            int MesesBebe;

            //Se piden los datos a ingresar mencionando cual se debe ingresar en cada campo
            System.out.print(" Nombre de la Enfermera: "); NomEnfer = Entrada.nextLine();
            System.out.print(" Nombre de la Madre: "); NomMama = Entrada.nextLine();
            System.out.print(" Nombre del Bebe: "); NomBebe = Entrada.nextLine();

            System.out.println("Favor Ingresar los siguientes datos del bebe: ");

            System.out.print(" Peso del bebe: "); PesoBebe = Entrada.nextDouble();
            System.out.print(" Meses de Nacido del Bebe: "); MesesBebe = Entrada.nextInt();
            
            //Se hace la operación correspondiente para sacar la dosis de la vacuna
            Vacuna = ((PesoBebe + 10) / (MesesBebe *  10) * 8);

            //Se muestra el resultado final (Nombres de la enfermera, de la mamá, del Bebe y la dosis de la vacuna a ingresar)
            System.out.println("La Enfermera es: "+NomEnfer);
            System.out.println("La Madre es: "+NomMama);
            System.out.println("El Paciente es: "+NomBebe);

            System.out.println("Se le debe aplicar un dosis de: "+Vacuna+" ml");

            //Se limpia el buffer
            Entrada.close();

    }

}
